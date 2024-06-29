import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class308 {

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    private int field4481 = -1;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    private int field4487 = 0;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "Lkn;")
    private class442 field4477 = new class442();

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "Z")
    public boolean field4489 = false;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    private int field4480;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    private int field4478;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "[[[I")
    private int[][][] field4475;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "[Lai;")
    private class357[] field4479;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "Llm;")
    public static class291 field4476 = new class291(128);

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field4488;

    static {
        new class349("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field4484 = 0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)[[[I", line = 3)
    public final int[][][] method2068(int arg0) {
        field4488++;
        if (this.field4480 != this.field4478) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4478; var2++) {
            this.field4479[var2] = class2.field10;
        }
        return this.field4475;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLhl;)V", line = 23)
    public static final void method2069(byte arg0, class311 arg1) {
        if (arg0 <= 63) {
            return;
        }
        field4482++;
        if ((arg1 instanceof class446)) {
            class446 var2 = (class446) arg1;
            if (var2.field6375 != null) {
                class73.method443((byte) 124, var2);
            }
        } else if (arg1 instanceof class128) {
            class153.method1127((class128) arg1, 0);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[[I", line = 52)
    public final int[][] method2070(int arg0, int arg1) {
        field4483++;
        if (arg0 != 0) {
            method2071(106);
        }
        if (this.field4480 == this.field4478) {
            this.field4489 = this.field4479[arg1] == null;
            this.field4479[arg1] = class2.field10;
            return this.field4475[arg1];
        } else if (this.field4478 == 1) {
            this.field4489 = this.field4481 != arg1;
            this.field4481 = arg1;
            return this.field4475[0];
        } else {
            class357 var3 = this.field4479[arg1];
            if (var3 == null) {
                this.field4489 = true;
                if (this.field4487 >= this.field4478) {
                    class357 var4 = (class357) this.field4477.method2760(arg0);
                    var3 = new class357(arg1, var4.field5160);
                    this.field4479[var4.field5158] = null;
                    var4.method2660((byte) 119);
                } else {
                    var3 = new class357(arg1, this.field4487);
                    this.field4487++;
                }
                this.field4479[arg1] = var3;
            } else {
                this.field4489 = false;
            }
            this.field4477.method2758(0, var3);
            return this.field4475[var3.field5160];
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V", line = 125)
    public static void method2071(int arg0) {
        field4476 = null;
        int var1 = -26 / ((-arg0 - 68) / 58);
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V", line = 136)
    public final void method2072(int arg0) {
        for (int var2 = 0; var2 < this.field4478; var2++) {
            this.field4475[var2][0] = null;
            this.field4475[var2][1] = null;
            this.field4475[var2][2] = null;
            this.field4475[var2] = null;
        }
        field4485++;
        this.field4479 = null;
        this.field4475 = null;
        this.field4477.method2755(arg0);
        this.field4477 = null;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(III)V", line = 188)
    public class308(int arg0, int arg1, int arg2) {
        this.field4480 = arg1;
        this.field4478 = arg0;
        this.field4475 = new int[this.field4478][3][arg2];
        this.field4479 = new class357[this.field4480];
    }
}

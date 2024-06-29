import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 {

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    private int field463 = -1;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    private int field456 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lvj;")
    private class115 field454 = new class115();

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Z")
    public boolean field470 = false;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[Lpg;")
    private class75[] field464;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[[[I")
    private int[][][] field453;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Laf;")
    public static class68 field466 = new class68(64);

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "S")
    public static short field467 = 32767;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field469 = -1;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
    public static int[] field471 = new int[2];

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lqh;")
    public static class201 field462;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[[I")
    public static int[][] field452;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[[I")
    public final int[][] method248(int arg0, int arg1) {
        field473++;
        if (arg1 != 17416) {
            field472 = -79;
        }
        if (this.field461 == this.field460) {
            this.field470 = this.field464[arg0] == null;
            this.field464[arg0] = class45.field816;
            return this.field453[arg0];
        } else if (this.field461 == 1) {
            this.field470 = this.field463 != arg0;
            this.field463 = arg0;
            return this.field453[0];
        } else {
            class75 var3 = this.field464[arg0];
            if (var3 == null) {
                this.field470 = true;
                if (this.field461 > this.field456) {
                    var3 = new class75(arg0, this.field456);
                    this.field456++;
                } else {
                    class75 var4 = (class75) this.field454.method847(arg1 ^ 0x4409);
                    var3 = new class75(arg0, var4.field1209);
                    this.field464[var4.field1210] = null;
                    var4.method1388(-127);
                }
                this.field464[arg0] = var3;
            } else {
                this.field470 = false;
            }
            this.field454.method846((byte) 83, var3);
            return this.field453[var3.field1209];
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method249(int arg0) {
        field457++;
        if (arg0 >= -71) {
            method253(97);
        }
        if (this.field461 != this.field460) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field461; var2++) {
            this.field464[var2] = class45.field816;
        }
        return this.field453;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public final void method250(int arg0) {
        field465++;
        for (int var2 = 0; var2 < this.field461; var2++) {
            this.field453[var2][0] = null;
            this.field453[var2][1] = null;
            this.field453[var2][2] = null;
            this.field453[var2] = null;
        }
        this.field464 = null;
        if (arg0 < 41) {
            this.method249(-119);
        }
        this.field453 = null;
        this.field454.method854(true);
        this.field454 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method251(byte arg0) {
        if (arg0 > -78) {
            method251((byte) 19);
        }
        field458++;
        if (class194.field3107) {
            class77.field1242 = null;
            class194.field3107 = false;
            class96.field1574 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method252(byte arg0) {
        field452 = null;
        if (arg0 == 57) {
            field466 = null;
            field471 = null;
            field462 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static final void method253(int arg0) {
        class262.field4157 = null;
        class199.field3177 = null;
        class94.field1538 = null;
        class118.field1940 = null;
        class128.field2071 = null;
        if (arg0 == 0) {
            field468++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(III)V")
    public class29(int arg0, int arg1, int arg2) {
        this.field460 = arg1;
        this.field461 = arg0;
        this.field464 = new class75[this.field460];
        this.field453 = new int[this.field461][3][arg2];
    }
}

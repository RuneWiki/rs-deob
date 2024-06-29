import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class142 {

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    private int field2441 = -1;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    private int field2446 = 0;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lci;")
    private class60 field2439 = new class60();

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Z")
    public boolean field2448 = false;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    private int field2434;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    private int field2432;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[[I")
    private int[][] field2431;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[Lpf;")
    private class269[] field2438;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2440 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lrc;")
    public static class9 field2449 = new class9(50);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lvh;")
    public static class108 field2442;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lvh;")
    public static class108 field2445;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[I")
    public static int[] field2444;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)[[I")
    public final int[][] method990(boolean arg0) {
        if (!arg0) {
            this.field2434 = -65;
        }
        field2435++;
        if (this.field2434 != this.field2432) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2432; var2++) {
            this.field2438[var2] = class193.field3120;
        }
        return this.field2431;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public final void method991(byte arg0) {
        for (int var2 = 0; var2 < this.field2432; var2++) {
            this.field2431[var2] = null;
        }
        this.field2431 = null;
        field2436++;
        this.field2438 = null;
        this.field2439.method377(107);
        if (arg0 == -50) {
            this.field2439 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
    public final int[] method992(int arg0, int arg1) {
        if (arg0 != 17118) {
            this.field2439 = null;
        }
        field2450++;
        if (this.field2434 == this.field2432) {
            this.field2448 = this.field2438[arg1] == null;
            this.field2438[arg1] = class193.field3120;
            return this.field2431[arg1];
        } else if (this.field2432 == 1) {
            this.field2448 = this.field2441 != arg1;
            this.field2441 = arg1;
            return this.field2431[0];
        } else {
            class269 var3 = this.field2438[arg1];
            if (var3 == null) {
                this.field2448 = true;
                if (this.field2432 > this.field2446) {
                    var3 = new class269(arg1, this.field2446);
                    this.field2446++;
                } else {
                    class269 var4 = (class269) this.field2439.method376((byte) 108);
                    var3 = new class269(arg1, var4.field4337);
                    this.field2438[var4.field4342] = null;
                    var4.method547(arg0 - 7092);
                }
                this.field2438[arg1] = var3;
            } else {
                this.field2448 = false;
            }
            this.field2439.method380(var3, 120);
            return this.field2431[var3.field4337];
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Lw;")
    public static final class37 method993(int arg0, int arg1) {
        field2430++;
        class37 var2 = (class37) class134.field2325.method57((long) arg0, -127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field1861.method746(arg0, (byte) -128, 32);
        class37 var4 = new class37();
        if (var3 != null) {
            var4.method242((byte) 97, new class101(var3));
        }
        var4.method240((byte) -31);
        if (arg1 < 117) {
            return null;
        } else {
            class134.field2325.method62(0, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)I")
    public static final int method994(int arg0, int arg1) {
        field2437++;
        class47 var2 = class133.method925(arg0, (byte) 77);
        int var3 = var2.field828;
        int var4 = var2.field823;
        int var5 = var2.field827;
        if (arg1 < 118) {
            field2445 = null;
        }
        int var6 = class256.field4176[var4 - var5];
        return class125.field2191[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public static void method995(byte arg0) {
        field2444 = null;
        if (arg0 >= -47) {
            field2447 = 124;
        }
        field2442 = null;
        field2449 = null;
        field2445 = null;
        field2440 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(III)V")
    public class142(int arg0, int arg1, int arg2) {
        this.field2434 = arg1;
        this.field2432 = arg0;
        this.field2431 = new int[this.field2432][arg2];
        this.field2438 = new class269[this.field2434];
    }
}

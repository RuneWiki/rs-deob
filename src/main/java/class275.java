import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class275 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    private int field4474 = -1;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field4479 = 0;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Len;")
    private class49 field4478 = new class49();

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Z")
    public boolean field4493 = false;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    private int field4487;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[[[I")
    private int[][][] field4482;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    private int field4477;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "[Lgg;")
    private class82[] field4476;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4484 = "Loaded interfaces";

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Len;")
    public static class49 field4486 = new class49();

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Z")
    public static boolean field4492 = true;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lg;")
    public static class181 field4488;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
    public static int[] field4483;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 7)
    public static void method1952(int arg0) {
        int var1 = -90 % ((arg0 - 9) / 37);
        field4484 = null;
        field4486 = null;
        field4483 = null;
        field4488 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[[I", line = 18)
    public final int[][] method1953(int arg0, int arg1) {
        field4485++;
        if (arg1 <= 71) {
            this.field4476 = (class82[]) null;
        }
        if (this.field4487 == this.field4477) {
            this.field4493 = this.field4476[arg0] == null;
            this.field4476[arg0] = class21.field541;
            return this.field4482[arg0];
        } else if (this.field4487 == 1) {
            this.field4493 = this.field4474 != arg0;
            this.field4474 = arg0;
            return this.field4482[0];
        } else {
            class82 var3 = this.field4476[arg0];
            if (var3 == null) {
                this.field4493 = true;
                if (this.field4487 <= this.field4479) {
                    class82 var4 = (class82) this.field4478.method429(-119);
                    var3 = new class82(arg0, var4.field1422);
                    this.field4476[var4.field1421] = null;
                    var4.method535(-2801);
                } else {
                    var3 = new class82(arg0, this.field4479);
                    this.field4479++;
                }
                this.field4476[arg0] = var3;
            } else {
                this.field4493 = false;
            }
            this.field4478.method434(0, var3);
            return this.field4482[var3.field1422];
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V", line = 85)
    public static final void method1954(int arg0, int arg1, int arg2) {
        field4491++;
        class335 var3 = class119.method868(arg1, (byte) -90);
        int var4 = var3.field5329;
        int var5 = var3.field5337;
        int var6 = var3.field5334;
        int var7 = class238.field3970[var5 - var6];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class244.method1730(var4, (byte) 90, ~var8 & class334.field5322[var4] | var8 & arg2 << var6);
        if (arg0 != 1) {
            field4492 = true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZIILek;)V", line = 113)
    public static final void method1955(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class206 arg6) {
        class257.field4202 = arg6;
        field4490++;
        class144.field2426 = arg4;
        class316.field5136 = arg2;
        class359.field5720 = arg0;
        class352.field5619 = arg1;
        class181.field3110 = arg3;
        class222.field3671 = arg5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIZ)V", line = 133)
    public static final void method1956(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class224.field3701 = arg1;
        class280.field4578 = arg2;
        class111.field2035 = arg3;
        class37.field814 = new class312[arg0][class224.field3701][class280.field4578];
        class123.field2166 = new int[arg0][class224.field3701 + 1][class280.field4578 + 1];
        if (class241.field4016) {
            class341.field5399 = new class102[4][];
        }
        if (arg4) {
            class253.field4154 = new class312[1][class224.field3701][class280.field4578];
            class318.field5180 = new int[class224.field3701][class280.field4578];
            class55.field1085 = new int[1][class224.field3701 + 1][class280.field4578 + 1];
            if (class241.field4016) {
                class23.field572 = new class102[1][];
            }
        } else {
            class253.field4154 = (class312[][][]) null;
            class318.field5180 = (int[][]) null;
            class55.field1085 = (int[][][]) null;
            class23.field572 = (class102[][]) null;
        }
        class51.method450(false);
        class33.field736 = new class308[500];
        class177.field2927 = 0;
        class233.field3811 = new class308[500];
        class238.field3952 = 0;
        class120.field2136 = new int[arg0][class224.field3701 + 1][class280.field4578 + 1];
        class172.field2842 = new class278[5000];
        class201.field3383 = 0;
        class160.field2706 = new class278[100];
        class200.field3358 = new boolean[class111.field2035 + class111.field2035 + 1][class111.field2035 + class111.field2035 + 1];
        class284.field4647 = new boolean[class111.field2035 + class111.field2035 + 2][class111.field2035 + class111.field2035 + 2];
        class271.field4409 = new byte[arg0][class224.field3701][class280.field4578];
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 176)
    public final void method1957(int arg0) {
        if (arg0 != -11647) {
            this.field4476 = (class82[]) null;
        }
        for (int var2 = 0; var2 < this.field4487; var2++) {
            this.field4482[var2][0] = null;
            this.field4482[var2][1] = null;
            this.field4482[var2][2] = null;
            this.field4482[var2] = (int[][]) null;
        }
        this.field4482 = (int[][][]) null;
        field4481++;
        this.field4476 = null;
        this.field4478.method440(-77);
        this.field4478 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V", line = 278)
    public class275(int arg0, int arg1, int arg2) {
        this.field4487 = arg0;
        this.field4482 = new int[this.field4487][3][arg2];
        this.field4477 = arg1;
        this.field4476 = new class82[this.field4477];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)[[[I", line = 217)
    public final int[][][] method1958(boolean arg0) {
        field4475++;
        if (this.field4487 != this.field4477) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0) {
            method1954(0, -81, 82);
        }
        for (int var2 = 0; var2 < this.field4487; var2++) {
            this.field4476[var2] = class21.field541;
        }
        return this.field4482;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 243)
    public static final void method1959(int arg0, byte arg1, String arg2) {
        field4480++;
        class199 var3 = class173.method1231(false, 3, arg0);
        var3.method1367((byte) 127);
        var3.field3344 = arg2;
        if (arg1 > -63) {
            field4489 = -23;
        }
    }
}

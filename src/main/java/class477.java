import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class477 {

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    private int field7027 = 0;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    private int field7029 = -1;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lpk;")
    private class133 field7023 = new class133();

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Z")
    public boolean field7031 = false;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    private int field7030;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    private int field7020;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[Lcr;")
    private class403[] field7024;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[[I")
    private int[][] field7017;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lgk;")
    public static class331 field7022 = new class331("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "[Ll;")
    public static class16[] field7026;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 9)
    public final void method2881(int arg0) {
        field7028++;
        if (arg0 != 258510055) {
            return;
        }
        for (int var2 = 0; var2 < this.field7020; var2++) {
            this.field7017[var2] = null;
        }
        this.field7017 = null;
        this.field7024 = null;
        this.field7023.method1016(-105);
        this.field7023 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)Z", line = 30)
    public static final boolean method2882(byte arg0, int arg1, int arg2) {
        field7018++;
        if (arg0 >= -87) {
            method2884(-8);
        }
        class222 var3 = class384.field5645.method786(arg1, 0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1515((byte) -105, arg2);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 50)
    public static void method2883(boolean arg0) {
        if (arg0) {
            method2883(true);
        }
        field7022 = null;
        field7026 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 62)
    public static final void method2884(int arg0) {
        field7019++;
        if (arg0 <= 113) {
            field7022 = null;
        }
        if (class73.field1007 != -1) {
            class527.method3124(-1, -1, -112, class73.field1007, false);
            class73.field1007 = -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)[[I", line = 79)
    public final int[][] method2885(int arg0) {
        field7016++;
        if (arg0 != 10) {
            return null;
        } else if (this.field7030 == this.field7020) {
            for (int var2 = 0; var2 < this.field7020; var2++) {
                this.field7024[var2] = class45.field503;
            }
            return this.field7017;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILrs;Llh;IIILrd;)V", line = 109)
    public static final void method2886(int arg0, int arg1, class461 arg2, class364 arg3, int arg4, int arg5, int arg6, class222 arg7) {
        field7021++;
        class307 var8 = new class307();
        if (arg1 != -1) {
            method2886(-111, 71, null, null, -94, 47, 5, null);
        }
        var8.field4353 = arg0 << 7;
        var8.field4360 = arg6;
        var8.field4350 = arg4 << 7;
        if (arg7 != null) {
            var8.field4345 = arg7;
            int var10 = arg7.field3206;
            int var11 = arg7.field3180;
            if (arg5 == 1 || arg5 == 3) {
                var10 = arg7.field3180;
                var11 = arg7.field3206;
            }
            var8.field4361 = arg7.field3188;
            var8.field4363 = arg7.field3255;
            var8.field4346 = arg4 + var11 << 7;
            var8.field4352 = arg7.field3215;
            var8.field4354 = arg0 + var10 << 7;
            var8.field4356 = arg7.field3213;
            var8.field4344 = arg7.field3264 << 7;
            var8.field4364 = arg7.field3256;
            if (arg7.field3233 != null) {
                var8.field4347 = true;
                var8.method1903(arg1 ^ 0x8A3);
            }
            if (var8.field4352 != null) {
                var8.field4358 = var8.field4364 + ((int) ((double) (var8.field4363 - var8.field4364) * Math.random()));
            }
            class134.field1942.method1015(false, var8);
            return;
        }
        if (arg2 != null) {
            var8.field4349 = arg2;
            class100 var9 = arg2.field6790;
            if (var9.field1364 != null) {
                var8.field4347 = true;
                var9 = var9.method848(false, class253.field3739);
            }
            if (var9 != null) {
                var8.field4354 = arg0 + var9.field1344 << 7;
                var8.field4346 = arg4 + var9.field1344 << 7;
                var8.field4356 = class49.method494((byte) -26, arg2);
                var8.field4344 = var9.field1408 << 7;
                var8.field4361 = var9.field1399;
            }
            class250.field3680.method1015(false, var8);
            return;
        }
        if (arg3 == null) {
            return;
        }
        var8.field4355 = arg3;
        var8.field4354 = arg3.method963((byte) 127) + arg0 << 7;
        var8.field4346 = arg3.method963((byte) 127) + arg4 << 7;
        var8.field4356 = class75.method707((byte) -80, arg3);
        var8.field4361 = arg3.field5099;
        var8.field4344 = arg3.field5080 << 7;
        class453.field6669.method878((long) arg3.field1716, -2301, var8);
        return;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(III)V", line = 281)
    public class477(int arg0, int arg1, int arg2) {
        this.field7030 = arg1;
        this.field7020 = arg0;
        this.field7024 = new class403[this.field7030];
        this.field7017 = new int[this.field7020][arg2];
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[I", line = 201)
    public final int[] method2887(byte arg0, int arg1) {
        if (arg0 != -112) {
            field7026 = null;
        }
        field7025++;
        if (this.field7030 == this.field7020) {
            this.field7031 = this.field7024[arg1] == null;
            this.field7024[arg1] = class45.field503;
            return this.field7017[arg1];
        } else if (this.field7020 == 1) {
            this.field7031 = this.field7029 != arg1;
            this.field7029 = arg1;
            return this.field7017[0];
        } else {
            class403 var3 = this.field7024[arg1];
            if (var3 == null) {
                this.field7031 = true;
                if (this.field7020 > this.field7027) {
                    var3 = new class403(arg1, this.field7027);
                    this.field7027++;
                } else {
                    class403 var4 = (class403) this.field7023.method1017(-102);
                    var3 = new class403(arg1, var4.field5976);
                    this.field7024[var4.field5974] = null;
                    var4.method1525((byte) -29);
                }
                this.field7024[arg1] = var3;
            } else {
                this.field7031 = false;
            }
            this.field7023.method1011(1245184, var3);
            return this.field7017[var3.field5976];
        }
    }
}

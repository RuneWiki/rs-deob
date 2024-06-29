import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class146 {

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lla;")
    private class476 field1797;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "[Z")
    private boolean[] field1798;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[[I")
    private int[][] field1792;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    private int field1794;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1801 = new String[] { method1238(method1237("'p,&j")), method1238(method1237("1=,M?")), method1238(method1237("'p,_+$zv]j")), method1238(method1237("$fn\u000f")), method1238(method1237("'p,'j")), method1238(method1237("'p,!j")), method1238(method1237("'p, j")), method1238(method1237("'p,\"j")) };

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ldv;")
    public static class685 field1793 = new class685(6, 0, 4, 2);

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lel;")
    public static class573 field1800 = new class573(64, 2);

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I", line = 4)
    public static final int method1232(int arg0, int arg1) {
        try {
            field1799++;
            if (arg0 != -1) {
                return -51;
            }
            byte var2;
            if (arg1 > 12000) {
                var2 = 4;
                class90.method771(-20247);
            } else if (arg1 > 5000) {
                var2 = 3;
                class551.method4149(arg0 + 115);
            } else if (arg1 <= 2000) {
                var2 = 1;
                class176.method1545((byte) 84, true);
            } else {
                var2 = 2;
                class496.method3750(true);
            }
            if (class289.field4305.field812.method1610(false) != 2) {
                class289.field4305.method655(17, 2, class289.field4305.field834);
                class640.method4693(2, -13558, false);
            }
            class124.method1077(-3);
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1801[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 53)
    public static void method1233(int arg0) {
        try {
            if (arg0 != -30339) {
                field1793 = null;
            }
            field1800 = null;
            field1793 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1801[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)[I", line = 71)
    public final int[] method1234(int arg0, int arg1) {
        try {
            field1791++;
            if (arg1 < 0 || this.field1792.length <= arg1) {
                return this.field1794 == -1 ? new int[0] : new int[] { this.field1794 };
            } else if (this.field1798[arg1] && this.field1792[arg1].length > 1) {
                int var3 = this.field1794 == -1 ? 0 : 1;
                Random var4 = new Random();
                int[] var5 = new int[this.field1792[arg1].length];
                class467.method3553(this.field1792[arg1], 0, var5, 0, var5.length);
                for (int var6 = var3; var6 < var5.length; var6++) {
                    int var7 = var3 + class656.method4817(var5.length - var3, var4, (byte) -116);
                    int var8 = var5[var6];
                    var5[var6] = var5[var7];
                    var5[var7] = var8;
                }
                if (arg0 != 1) {
                    this.method1234(-50, 69);
                }
                return var5;
            } else {
                return this.field1792[arg1];
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1801[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Loia;", line = 117)
    public final class97 method1235(int arg0, int arg1) {
        try {
            field1796++;
            if (arg1 == -23585) {
                byte[] var3 = this.field1797.method3632(1, arg0, arg1 ^ 0x5C5A);
                class97 var4 = new class97();
                var4.method815(new class163(var3), arg1 ^ 0xFFFFA3DD);
                return var4;
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1801[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Z", line = 139)
    public final boolean method1236(byte arg0) {
        try {
            if (arg0 < 25) {
                this.method1235(49, -105);
            }
            field1795++;
            return this.field1794 != -1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1801[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lto;ILla;)V", line = 149)
    public class146(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field1797 = arg2;
            this.field1797.method3646(1, (byte) -34);
            class163 var4 = new class163(this.field1797.method3632(0, 0, -118));
            int var5 = var4.method1455((byte) 62);
            if (var5 > 3) {
                this.field1798 = new boolean[0];
                this.field1792 = new int[0][];
                this.field1794 = -1;
            } else {
                int var6 = var4.method1455((byte) 62);
                class494[] var7 = class239.method2049((byte) 94);
                boolean var8 = true;
                if (var7.length == var6) {
                    for (int var9 = 0; var9 < var7.length; var9++) {
                        int var10 = var4.method1455((byte) 62);
                        if (var7[var9].field7095 != var10) {
                            var8 = false;
                            break;
                        }
                    }
                } else {
                    var8 = false;
                }
                if (var8) {
                    int var11 = var4.method1455((byte) 62);
                    int var12 = var4.method1455((byte) 62);
                    if (var5 <= 2) {
                        this.field1794 = -1;
                    } else {
                        this.field1794 = var4.method1442(65280);
                    }
                    this.field1792 = new int[var12 + 1][];
                    this.field1798 = new boolean[var12 + 1];
                    for (int var13 = 0; var13 < var11; var13++) {
                        int var14 = var4.method1455((byte) 62);
                        this.field1798[var14] = var4.method1455((byte) 62) == 1;
                        int var15 = var4.method1445((byte) 119);
                        if (this.field1794 == -1) {
                            this.field1792[var14] = new int[var15];
                            for (int var16 = 0; var16 < var15; var16++) {
                                this.field1792[var14][var16] = var4.method1445((byte) 113);
                            }
                        } else {
                            this.field1792[var14] = new int[var15 + 1];
                            this.field1792[var14][0] = this.field1794;
                            for (int var17 = 0; var17 < var15; var17++) {
                                this.field1792[var14][var17 + 1] = var4.method1445((byte) 117);
                            }
                        }
                    }
                    for (int var18 = 0; var18 < (var12 + 1); var18++) {
                        if (this.field1792[var18] == null) {
                            if (this.field1794 == -1) {
                                this.field1792[var18] = new int[0];
                            } else {
                                this.field1792[var18] = new int[] { this.field1794 };
                            }
                        }
                    }
                } else {
                    this.field1792 = new int[0][];
                    this.field1798 = new boolean[0];
                    this.field1794 = -1;
                }
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field1801[2] + (arg0 == null ? field1801[3] : field1801[1]) + ',' + arg1 + ',' + (arg2 == null ? field1801[3] : field1801[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1237(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1238(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

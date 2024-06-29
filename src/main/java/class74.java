import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class74 {

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Leq;")
    private class508 field1024 = null;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
    private boolean field1019;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lad;")
    private class12 field1020;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Luv;")
    public static class2 field1039 = new class2(94, -1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "[Ljava/lang/Object;")
    private Object[] field1045;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1046;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public final void method517(byte arg0) {
        if (this.field1046 != null) {
            for (int var2 = 0; var2 < this.field1046.length; var2++) {
                this.field1046[var2] = null;
            }
        }
        if (arg0 == 9) {
            field1030++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIZ)V")
    public final void method518(boolean arg0, int arg1, boolean arg2) {
        field1023++;
        if (!this.method545((byte) 120)) {
            return;
        }
        if (arg1 != -1) {
            this.method543((byte) 110);
        }
        if (arg2) {
            this.field1024.field7453 = null;
            this.field1024.field7461 = null;
        }
        if (arg0) {
            this.field1024.field7456 = null;
            this.field1024.field7472 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method519(int arg0, String arg1) {
        field1015++;
        if (!this.method545((byte) -47)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1024.field7461.method2079(arg0 - 117, class466.method2705((byte) -117, var3));
        this.method533(arg0 ^ 0xFFFFFFC7, var4);
        if (arg0 != 0) {
            this.field1020 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method520(boolean arg0) {
        if (arg0) {
            method548(102);
        }
        field1039 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[I)[B")
    public final byte[] method521(int arg0, int arg1, int arg2, int[] arg3) {
        field1041++;
        if (!this.method530(arg0, (byte) 15, arg1)) {
            return null;
        }
        if (this.field1046[arg0] == null || this.field1046[arg0][arg1] == null) {
            boolean var5 = this.method550(arg0, arg1, arg2 ^ 0xFFFFFFDB, arg3);
            if (!var5) {
                this.method534((byte) 120, arg0);
                boolean var6 = this.method550(arg0, arg1, arg2 - 125, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class50.method374(false, -1, this.field1046[arg0][arg1]);
        if (this.field1051 == arg2) {
            this.field1046[arg0][arg1] = null;
            if (this.field1024.field7469[arg0] == 1) {
                this.field1046[arg0] = null;
            }
        } else if (this.field1051 == 2) {
            this.field1046[arg0] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
    public final int[] method522(int arg0, int arg1) {
        field1052++;
        if (arg0 != 0) {
            this.field1020 = null;
        }
        if (!this.method542(arg1, false)) {
            return null;
        }
        int[] var3 = this.field1024.field7466[arg1];
        if (var3 == null) {
            var3 = new int[this.field1024.field7463[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method523(String arg0, int arg1, String arg2) {
        field1034++;
        if (!this.method545((byte) -116)) {
            return false;
        }
        int var4 = -75 / ((arg1 + 69) / 56);
        String var5 = arg2.toLowerCase();
        String var6 = arg0.toLowerCase();
        int var7 = this.field1024.field7461.method2079(-113, class466.method2705((byte) -58, var5));
        if (this.method542(var7, false)) {
            int var8 = this.field1024.field7472[var7].method2079(58, class466.method2705((byte) -36, var6));
            return this.method538(var7, 100, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I")
    private final int method524(int arg0, int arg1) {
        field1021++;
        if (arg1 != 100) {
            return 74;
        } else if (this.method542(arg0, false)) {
            return this.field1045[arg0] == null ? this.field1020.method166((byte) 14, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method525(String arg0, int arg1) {
        field1048++;
        if (arg1 != 0) {
            this.field1020 = null;
        }
        if (this.method545((byte) 117)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1024.field7461.method2079(-105, class466.method2705((byte) -78, var3));
            return this.method546(var4, 121);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)[B")
    public final byte[] method526(int arg0, int arg1) {
        field1029++;
        if (!this.method545((byte) -60)) {
            return null;
        } else if (this.field1024.field7469.length == arg1) {
            return this.method541(arg0, 0, (byte) -122);
        } else if (!this.method542(arg0, false)) {
            return null;
        } else if (this.field1024.field7469[arg0] == 1) {
            return this.method541(0, arg0, (byte) -122);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(II)V")
    public final void method527(int arg0, int arg1) {
        field1050++;
        if (!this.method542(arg0, false)) {
            return;
        }
        if (arg1 >= -119) {
            this.field1045 = null;
        }
        if (this.field1046 != null) {
            this.field1046[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)V")
    public final void method528(boolean arg0) {
        if (this.field1045 != null) {
            for (int var2 = 0; var2 < this.field1045.length; var2++) {
                this.field1045[var2] = null;
            }
        }
        if (!arg0) {
            field1047++;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method529(int arg0, String arg1, String arg2) {
        field1031++;
        if (!this.method545((byte) -96)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg0 != 0) {
            return null;
        }
        String var5 = arg1.toLowerCase();
        int var6 = this.field1024.field7461.method2079(arg0 - 120, class466.method2705((byte) -102, var4));
        if (this.method542(var6, false)) {
            int var7 = this.field1024.field7472[var6].method2079(-73, class466.method2705((byte) -35, var5));
            return this.method541(var7, var6, (byte) -122);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)Z")
    private final boolean method530(int arg0, byte arg1, int arg2) {
        field1028++;
        if (!this.method545((byte) -106)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field1024.field7469.length > arg0 && this.field1024.field7469[arg0] > arg2) {
            if (arg1 != 15) {
                this.field1046 = null;
            }
            return true;
        } else if (class357.field5465) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method531(String arg0, int arg1) {
        field1037++;
        if (!this.method545((byte) -115)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1024.field7461.method2079(118, class466.method2705((byte) -79, var3));
        if (var4 < 0) {
            return false;
        } else {
            int var5 = 54 % ((arg1 - 37) / 42);
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(II)I")
    public final int method532(int arg0, int arg1) {
        field1032++;
        if (arg1 != 1) {
            return 12;
        } else if (this.method545((byte) -86)) {
            int var3 = this.field1024.field7461.method2079(-88, arg0);
            return this.method542(var3, false) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(II)V")
    private final void method533(int arg0, int arg1) {
        if (arg0 <= -43) {
            field1016++;
            this.field1020.method168((byte) -109, arg1);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
    private final void method534(byte arg0, int arg1) {
        field1017++;
        int var3 = -102 % ((arg0 - 46) / 55);
        if (this.field1019) {
            this.field1045[arg1] = this.field1020.method163(0, arg1);
        } else {
            this.field1045[arg1] = class295.method1834(false, this.field1020.method163(0, arg1), 136);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I")
    public final int method535(byte arg0) {
        field1043++;
        if (arg0 != 117) {
            field1054 = -53;
        }
        return this.method545((byte) 126) ? this.field1024.field7469.length : -1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)I")
    public final int method536(boolean arg0, int arg1) {
        field1042++;
        return this.method542(arg1, arg0) ? this.field1024.field7469[arg1] : 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
    public static final void method537(int arg0, int arg1, int arg2, int arg3) {
        field1040++;
        class506 var4 = class14.method185(-1304589728, arg3, 9);
        var4.method2992(0);
        var4.field7441 = arg2;
        if (arg1 == 16504) {
            var4.field7442 = arg0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z")
    public final boolean method538(int arg0, int arg1, int arg2) {
        field1027++;
        if (!this.method530(arg0, (byte) 15, arg2)) {
            return false;
        } else if (this.field1046[arg0] != null && this.field1046[arg0][arg2] != null) {
            return true;
        } else if (arg1 != 100) {
            return true;
        } else if (this.field1045[arg0] == null) {
            this.method534((byte) 112, arg0);
            return this.field1045[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method539(byte arg0, String arg1) {
        field1026++;
        if (!this.method545((byte) -55)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1024.field7461.method2079(-101, class466.method2705((byte) -91, var3));
        if (arg0 != 27) {
            method520(false);
        }
        return this.method542(var4, false) ? var4 : -1;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method540(int arg0, String arg1) {
        field1038++;
        if (!this.method545((byte) -124)) {
            return 0;
        }
        if (arg0 != 0) {
            field1054 = 76;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1024.field7461.method2079(-75, class466.method2705((byte) -111, var3));
        return this.method524(var4, arg0 + 100);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)[B")
    public final byte[] method541(int arg0, int arg1, byte arg2) {
        field1025++;
        if (arg2 != -122) {
            field1039 = null;
        }
        return this.method521(arg1, arg0, arg2 + 123, null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Z")
    private final boolean method542(int arg0, boolean arg1) {
        if (arg1) {
            this.field1019 = true;
        }
        field1044++;
        if (!this.method545((byte) 105)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field1024.field7469.length && this.field1024.field7469[arg0] != 0) {
            return true;
        } else if (class357.field5465) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)I")
    public final int method543(byte arg0) {
        field1035++;
        if (!this.method545((byte) -79)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1045.length; var4++) {
            if (this.field1024.field7463[var4] > 0) {
                var3 += this.method524(var4, 100);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            int var5 = var3 * 100 / var2;
            int var6 = 48 % ((arg0 + 72) / 44);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
    public final boolean method544(int arg0) {
        field1053++;
        if (!this.method545((byte) 108)) {
            return false;
        } else if (arg0 == -1) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1024.field7452.length; var3++) {
                int var4 = this.field1024.field7452[var3];
                if (this.field1045[var4] == null) {
                    this.method534((byte) -21, var4);
                    if (this.field1045[var4] == null) {
                        var2 = false;
                    }
                }
            }
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)Z")
    private final boolean method545(byte arg0) {
        int var2 = 119 % ((39 - arg0) / 62);
        field1012++;
        if (this.field1024 == null) {
            this.field1024 = this.field1020.method167(0);
            if (this.field1024 == null) {
                return false;
            }
            this.field1045 = new Object[this.field1024.field7455];
            this.field1046 = new Object[this.field1024.field7455][];
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(II)Z")
    public final boolean method546(int arg0, int arg1) {
        field1036++;
        int var3 = -56 % ((arg1 - 35) / 52);
        if (!this.method542(arg0, false)) {
            return false;
        } else if (this.field1045[arg0] == null) {
            this.method534((byte) -29, arg0);
            return this.field1045[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
    public static final void method547(int arg0, byte arg1) {
        if (arg1 == 125) {
            field1013++;
            if (class54.field714 == null || class54.field714.length < arg0) {
                class54.field714 = new int[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
    public static final int method548(int arg0) {
        field1049++;
        class11 var1 = class407.field6147;
        boolean var2 = false;
        if (class113.field1723 != arg0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class11.method76(0, null, 8, var3, null, 0);
            var2 = true;
        }
        long var4 = class381.method2281((byte) -124);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method79(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class381.method2281((byte) -112) - var4);
        var1.method67(96, 100, -16777216, 0, 100, 0);
        if (var2) {
            var1.method111(1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)I")
    public final int method549(byte arg0) {
        field1018++;
        if (!this.method545((byte) 111)) {
            throw new IllegalStateException("");
        }
        if (arg0 > -74) {
            this.method532(-84, 22);
        }
        return this.field1024.field7462;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III[I)Z")
    private final boolean method550(int arg0, int arg1, int arg2, int[] arg3) {
        field1014++;
        if (!this.method542(arg0, false)) {
            return false;
        } else if (this.field1045[arg0] == null) {
            return false;
        } else {
            int var5 = this.field1024.field7463[arg0];
            int[] var6 = this.field1024.field7466[arg0];
            if (this.field1046[arg0] == null) {
                this.field1046[arg0] = new Object[this.field1024.field7469[arg0]];
            }
            Object[] var7 = this.field1046[arg0];
            boolean var8 = true;
            int var9 = 42 % ((arg2 - 48) / 49);
            for (int var10 = 0; var10 < var5; var10++) {
                int var11;
                if (var6 == null) {
                    var11 = var10;
                } else {
                    var11 = var6[var10];
                }
                if (var7[var11] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var12;
            if (arg3 != null && (arg3[0] != 0 || arg3[1] != 0 || arg3[2] != 0 || arg3[3] != 0)) {
                var12 = class50.method374(true, -1, this.field1045[arg0]);
                class468 var13 = new class468(var12);
                var13.method2768((byte) 84, arg3, 5, var13.field6868.length);
            } else {
                var12 = class50.method374(false, -1, this.field1045[arg0]);
            }
            byte[] var14;
            try {
                var14 = class201.method1327(var12, 83);
            } catch (RuntimeException var50) {
                throw class200.method1323(var50, "T3 - " + (arg3 != null) + "," + arg0 + "," + var12.length + "," + class84.method673((byte) 51, var12.length, var12) + "," + class84.method673((byte) 51, var12.length - 2, var12) + "," + this.field1024.field7468[arg0] + "," + this.field1024.field7462);
            }
            if (this.field1019) {
                this.field1045[arg0] = null;
            }
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field1051 == 0) {
                    var7[var16] = class295.method1834(false, var14, 136);
                } else {
                    var7[var16] = var14;
                }
            } else if (this.field1051 == 2) {
                int var17 = var14.length;
                int var51 = var17 - 1;
                int var18 = var14[var51] & 0xFF;
                int var19 = var51 - var18 * 4 * var5;
                class468 var20 = new class468(var14);
                int var21 = 0;
                int var22 = 0;
                var20.field6830 = var19;
                for (int var23 = 0; var23 < var18; var23++) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < var5; var25++) {
                        var24 += var20.method2722(false);
                        int var26;
                        if (var6 == null) {
                            var26 = var25;
                        } else {
                            var26 = var6[var25];
                        }
                        if (arg1 == var26) {
                            var22 = var26;
                            var21 += var24;
                        }
                    }
                }
                if (var21 == 0) {
                    return true;
                }
                byte[] var27 = new byte[var21];
                int var28 = 0;
                var20.field6830 = var19;
                int var29 = 0;
                for (int var30 = 0; var30 < var18; var30++) {
                    int var31 = 0;
                    for (int var32 = 0; var32 < var5; var32++) {
                        var31 += var20.method2722(false);
                        int var33;
                        if (var6 == null) {
                            var33 = var32;
                        } else {
                            var33 = var6[var32];
                        }
                        if (arg1 == var33) {
                            class442.method2590(var14, var29, var27, var28, var31);
                            var28 += var31;
                        }
                        var29 += var31;
                    }
                }
                var7[var22] = var27;
            } else {
                int var34 = var14.length;
                int var52 = var34 - 1;
                int var35 = var14[var52] & 0xFF;
                int var36 = var52 - var5 * 4 * var35;
                class468 var37 = new class468(var14);
                var37.field6830 = var36;
                int[] var38 = new int[var5];
                for (int var39 = 0; var39 < var35; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var37.method2722(false);
                        var38[var41] += var40;
                    }
                }
                byte[][] var42 = new byte[var5][];
                for (int var43 = 0; var43 < var5; var43++) {
                    var42[var43] = new byte[var38[var43]];
                    var38[var43] = 0;
                }
                var37.field6830 = var36;
                int var44 = 0;
                for (int var45 = 0; var45 < var35; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var37.method2722(false);
                        class442.method2590(var14, var44, var42[var47], var38[var47], var46);
                        var44 += var46;
                        var38[var47] += var46;
                    }
                }
                for (int var48 = 0; var48 < var5; var48++) {
                    int var49;
                    if (var6 == null) {
                        var49 = var48;
                    } else {
                        var49 = var6[var48];
                    }
                    if (this.field1051 == 0) {
                        var7[var49] = class295.method1834(false, var42[var48], 136);
                    } else {
                        var7[var49] = var42[var48];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lad;ZI)V")
    public class74(class12 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1019 = arg1;
        this.field1051 = arg2;
        this.field1020 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(II)Z")
    public final boolean method551(int arg0, int arg1) {
        field1022++;
        if (!this.method545((byte) -49)) {
            return false;
        } else if (this.field1024.field7469.length == 1) {
            return this.method538(0, 100, arg1);
        } else if (!this.method542(arg1, false)) {
            return false;
        } else if (this.field1024.field7469[arg1] == 1) {
            return this.method538(arg1, 100, 0);
        } else {
            int var3 = 97 % ((59 - arg0) / 32);
            throw new RuntimeException();
        }
    }
}

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class269 extends class179 {

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Ljava/lang/String;")
    private String field4028 = "null";

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "C")
    public char field4029;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "C")
    public char field4038;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    private int field4026;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Ljj;")
    private class156 field4025;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Ljj;")
    public class156 field4040;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "Lbs;")
    public static class186 field4041;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILec;)V", line = 5)
    private final void method1915(byte arg0, int arg1, class37 arg2) {
        int var4 = -116 % ((arg0 + 49) / 33);
        field4033++;
        if (arg1 == 1) {
            this.field4038 = class254.method1841(arg2.method291(0), (byte) -128);
        } else if (arg1 == 2) {
            this.field4029 = class254.method1841(arg2.method291(0), (byte) -127);
        } else if (arg1 == 3) {
            this.field4028 = arg2.method322((byte) -34);
        } else if (arg1 == 4) {
            this.field4026 = arg2.method278(76);
        } else if (arg1 == 5 || arg1 == 6) {
            int var5 = arg2.method320((byte) -87);
            this.field4040 = new class156(class202.method1526(var5, -2092404400));
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg2.method278(-7);
                class35 var8;
                if (arg1 == 5) {
                    var8 = new class450(arg2.method322((byte) -34));
                } else {
                    var8 = new class9(arg2.method278(-112));
                }
                this.field4040.method1217(1, (long) var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILec;)V", line = 58)
    public final void method1916(int arg0, class37 arg1) {
        if (arg0 != -1) {
            this.field4026 = -29;
        }
        while (true) {
            int var3 = arg1.method271((byte) 115);
            if (var3 == 0) {
                field4031++;
                return;
            }
            this.method1915((byte) -100, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 88)
    public static final void method1917(int arg0) {
        if (class276.field4158 < 102) {
            class276.field4158 += 6;
        }
        field4032++;
        int var1 = 0;
        if (arg0 <= 74) {
            field4041 = null;
        }
        while (var1 < class228.field3334) {
            int var2 = class199.field2909[var1];
            char var3 = (char) class441.field6405[var1];
            if (var2 == 84) {
                class123.method1035(0);
            } else if (class33.field482[82] && var2 == 66) {
                if (class333.field4775 != null) {
                    String var8 = "";
                    for (int var9 = class137.field2192.length - 1; var9 >= 0; var9--) {
                        if (class137.field2192[var9] != null && class137.field2192[var9].length() > 0) {
                            var8 = var8 + class137.field2192[var9] + '\n';
                        }
                    }
                    class333.field4775.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class33.field482[82] && var2 == 67) {
                if (class333.field4775 != null) {
                    Transferable var4 = class333.field4775.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class169.method1289(var5, '\n', 26329);
                                if (var6.length <= 1) {
                                    class336.field4817 = class336.field4817 + var5;
                                } else {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class336.field4817 = var6[var7];
                                        class123.method1035(0);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class336.field4817.length() > 0) {
                class336.field4817 = class336.field4817.substring(0, class336.field4817.length() - 1);
            } else if (var2 == 104 && class157.field2397 < class137.field2192.length) {
                class157.field2397++;
                class124.method1051(0);
            } else if (var2 == 105 && class157.field2397 > 0) {
                class157.field2397--;
                class124.method1051(0);
            } else if (class153.method1184(var3, 7) || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+') {
                class336.field4817 = class336.field4817 + (char) class441.field6405[var1];
            }
            var1++;
        }
        class228.field3334 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class303.field4426[var10]) {
                var10002 = class161.field2438[var10]++;
                if (class161.field2438[var10] > 102) {
                    class303.field4426[var10] = false;
                }
            } else {
                var10002 = class161.field2438[var10]--;
                if (class161.field2438[var10] < 0) {
                    class200.field2932[var10] = (int) ((double) class113.field1819 * Math.random());
                    class220.field3280[var10] = (int) (Math.random() * 350.0D);
                    class161.field2438[var10] = 0;
                    class303.field4426[var10] = true;
                }
            }
        }
        class126.method1061(false);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)I", line = 244)
    public final int method1918(int arg0, int arg1) {
        field4027++;
        if (this.field4040 == null) {
            return this.field4026;
        }
        class9 var3 = (class9) this.field4040.method1219((long) arg0, -110);
        if (var3 == null) {
            return this.field4026;
        } else if (arg1 <= 70) {
            return -35;
        } else {
            return var3.field117;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 267)
    public final boolean method1919(String arg0, int arg1) {
        field4034++;
        if (this.field4040 == null) {
            return false;
        }
        if (this.field4025 == null) {
            this.method1922(119);
        }
        class64 var3 = (class64) this.field4025.method1219(class107.method948(arg0, false), -112);
        if (arg1 != 0) {
            this.field4025 = null;
        }
        while (var3 != null) {
            if (var3.field1039.equals(arg0)) {
                return true;
            }
            var3 = (class64) this.field4025.method1229(0);
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 297)
    private final void method1920(int arg0) {
        this.field4025 = new class156(this.field4040.method1220(99999));
        field4030++;
        int var2 = -11 % ((arg0 + 65) / 47);
        for (class9 var3 = (class9) this.field4040.method1222(5656); var3 != null; var3 = (class9) this.field4040.method1224((byte) -88)) {
            class9 var4 = new class9((int) var3.field499);
            this.field4025.method1217(1, (long) var3.field117, var4);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)Z", line = 321)
    public final boolean method1921(boolean arg0, int arg1) {
        if (!arg0) {
            field4041 = null;
        }
        field4036++;
        if (this.field4040 == null) {
            return false;
        }
        if (this.field4025 == null) {
            this.method1920(-126);
        }
        class9 var3 = (class9) this.field4025.method1219((long) arg1, -102);
        return var3 != null;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V", line = 348)
    private final void method1922(int arg0) {
        this.field4025 = new class156(this.field4040.method1220(99999));
        field4039++;
        if (arg0 > 51) {
            for (class450 var2 = (class450) this.field4040.method1222(5656); var2 != null; var2 = (class450) this.field4040.method1224((byte) -123)) {
                class64 var3 = new class64(var2.field6531, (int) var2.field499);
                this.field4025.method1217(1, class107.method948(var2.field6531, false), var3);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V", line = 370)
    public static void method1923(int arg0) {
        field4041 = null;
        if (arg0 != 2) {
            method1925(-66);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)Ljava/lang/String;", line = 383)
    public final String method1924(int arg0, int arg1) {
        field4035++;
        if (this.field4040 == null) {
            return this.field4028;
        }
        class450 var3 = (class450) this.field4040.method1219((long) arg0, -93);
        if (arg1 != 6) {
            this.method1920(19);
        }
        return var3 == null ? this.field4028 : var3.field6531;
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "(I)V", line = 406)
    public static final void method1925(int arg0) {
        class45.field710 = new class258[class311.field4535.method1325(-106)][];
        field4037++;
        class297.field4392 = new boolean[class311.field4535.method1325(arg0 ^ 0xFFFFE80D)];
        if (arg0 != 6065) {
            method1925(-103);
        }
    }
}

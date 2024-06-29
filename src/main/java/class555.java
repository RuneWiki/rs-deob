import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class555 {

    @OriginalMember(owner = "client!nda", name = "x", descriptor = "B")
    public byte field7963;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public int field7940;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public int field7941;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public int field7950;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    private int field7953;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "[I")
    public static int[] field7955 = new int[13];

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "Lpia;")
    public static class94 field7945 = new class94(31, 3);

    @OriginalMember(owner = "client!nda", name = "z", descriptor = "Lpia;")
    public static class94 field7965 = new class94(47, 3);

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public int field7942;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public int field7946;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    public int field7947;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    public int field7948;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public int field7949;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public int field7952;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "I")
    public int field7956;

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
    public int field7958;

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
    public int field7961;

    @OriginalMember(owner = "client!nda", name = "w", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!nda", name = "y", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Lnda;")
    public class555 field7943;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)Ldia;")
    public static final class233 method3250(byte arg0) {
        field7944++;
        if (arg0 > -61) {
            field7955 = null;
        }
        return class41.field465;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)I")
    public static int method3251(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)Lgw;")
    public final class170 method3252(boolean arg0) {
        field7964++;
        return arg0 ? class27.method130(this.field7953, -128) : null;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V")
    public static final void method3253(byte arg0) {
        for (int var1 = 0; var1 < class306.field3815; var1++) {
            class590 var2 = class313.field3888[var1];
            if (var2.field8324 == 3) {
                if (var2.field8310 == null) {
                    var2.field8313 = Integer.MIN_VALUE;
                } else {
                    class597.field8470.method1690(var2.field8310);
                }
            }
        }
        if (arg0 != 70) {
            field7965 = null;
        }
        field7959++;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3254(int arg0, byte arg1, int arg2) {
        int var3 = -122 / ((arg1 + 33) / 38);
        field7957++;
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IC)Z")
    public static final boolean method3255(int arg0, char arg1) {
        field7962++;
        if (arg0 != 2) {
            method3259(-60);
        }
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)Z")
    public static final boolean method3256(int arg0) {
        if (arg0 != 0) {
            field7945 = null;
        }
        field7951++;
        return class396.field5430;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
    public static void method3257(int arg0) {
        field7945 = null;
        field7965 = null;
        if (arg0 == 0) {
            field7955 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)Lnda;")
    public final class555 method3258(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > -62) {
            method3260(19);
        }
        field7960++;
        return new class555(this.field7953, arg3, arg1, arg2, this.field7963);
    }

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "(I)Z")
    public static final boolean method3259(int arg0) {
        field7954++;
        if (arg0 != 0) {
            return true;
        }
        try {
            if (class446.field6457 == 2) {
                if (class664.field9448 == null) {
                    class664.field9448 = class362.method2123(class462.field6583, class407.field5582, class163.field1819);
                    if (class664.field9448 == null) {
                        return false;
                    }
                }
                if (class688.field9714 == null) {
                    class688.field9714 = new class537(class471.field6734, class686.field9686);
                }
                class233 var1 = class41.field465;
                if (class344.field4471 != null) {
                    var1 = class344.field4471;
                }
                if (var1.method1366(22050, class664.field9448, class730.field10217, 128, class688.field9714)) {
                    class41.field465 = var1;
                    class41.field465.method1359((byte) 120);
                    if (class215.field2505 <= 0) {
                        class446.field6457 = 0;
                        class41.field465.method1380(-2, class30.field344);
                        for (int var2 = 0; var2 < class376.field4854.length; var2++) {
                            class41.field465.method1368(arg0, class376.field4854[var2], var2);
                            class376.field4854[var2] = 255;
                        }
                    } else {
                        class446.field6457 = 3;
                        class41.field465.method1380(-2, class215.field2505 <= class30.field344 ? class215.field2505 : class30.field344);
                        for (int var3 = 0; var3 < class376.field4854.length; var3++) {
                            class41.field465.method1368(0, class376.field4854[var3], var3);
                            class376.field4854[var3] = 255;
                        }
                    }
                    if (class344.field4471 == null) {
                        if (class387.field5372 > 0L) {
                            class41.field465.method1384(class387.field5372, class34.field372, class664.field9448, true, 0);
                        } else {
                            class41.field465.method1375(class34.field372, class664.field9448, false);
                        }
                    }
                    if (class326.field4233 != null) {
                        class326.field4233.method108(class41.field465, -119);
                    }
                    class462.field6583 = null;
                    class688.field9714 = null;
                    class387.field5372 = 0L;
                    class664.field9448 = null;
                    class344.field4471 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class41.field465.method1363(17768);
            class446.field6457 = 0;
            class462.field6583 = null;
            class688.field9714 = null;
            class664.field9448 = null;
            class344.field4471 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "(I)V")
    public static final void method3260(int arg0) {
        if (arg0 == 0) {
            if (class128.field1340 == 2) {
                class472.field6766[0].method571(class727.field10181[0]);
                class472.field6766[1].method571(class727.field10181[1]);
            } else if (class128.field1340 == 3) {
                class472.field6766[0].method571(class727.field10181[0]);
                class472.field6766[1].method571(class727.field10181[1]);
                class472.field6766[2].method571(class727.field10181[2]);
            } else {
                class472.field6766[0].method571(class727.field10181[0]);
                class472.field6766[1].method571(class727.field10181[1]);
                class472.field6766[2].method571(class727.field10181[2]);
                class472.field6766[3].method571(class727.field10181[3]);
            }
        } else if (arg0 == 1) {
            if (class128.field1340 == 2) {
                class472.field6766[0].method571(class727.field10181[2]);
            } else if (class128.field1340 == 3) {
                class472.field6766[0].method571(class727.field10181[3]);
                class472.field6766[1].method571(class727.field10181[4]);
            } else {
                class472.field6766[0].method571(class727.field10181[4]);
                class472.field6766[1].method571(class727.field10181[5]);
                class472.field6766[2].method571(class727.field10181[6]);
            }
        } else if (arg0 == 2) {
            if (class128.field1340 == 2) {
                class472.field6766[0].method571(class727.field10181[3]);
                return;
            }
            if (class128.field1340 == 3) {
                class472.field6766[0].method571(class727.field10181[5]);
                return;
            }
            class472.field6766[0].method571(class727.field10181[7]);
        }
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIIB)V")
    public class555(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7963 = arg4;
        this.field7940 = arg1;
        this.field7941 = arg2;
        this.field7950 = arg3;
        this.field7953 = arg0;
    }
}

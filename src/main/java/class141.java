import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class141 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ld;")
    public static class378 field2233;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[[[B")
    public static byte[][][] field2232;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILdp;)V", line = 3)
    public static final void method1128(int arg0, class174 arg1) {
        class375.field5314 = arg1.method1359(126, "p11_full");
        field2230++;
        class228.field3346 = arg1.method1359(51, "p12_full");
        class197.field2879 = arg1.method1359(111, "b12_full");
        class451.field6552 = arg1.method1359(107, "hitmarks");
        class268.field4012 = arg1.method1359(81, "hitbar_default");
        class362.field5161 = arg1.method1359(119, "timerbar_default");
        class206.field3014 = arg1.method1359(124, "headicons_pk");
        class27.field405 = arg1.method1359(62, "headicons_prayer");
        class452.field6583 = arg1.method1359(67, "hint_headicons");
        class58.field934 = arg1.method1359(arg0 ^ 0xFF788E, "hint_mapmarkers");
        class107.field1764 = arg1.method1359(59, "mapflag");
        class73.field1218 = arg1.method1359(arg0 - 16742515, "cross");
        class109.field1785 = arg1.method1359(84, "mapdots");
        class26.field392 = arg1.method1359(arg0 ^ 0xFF78D3, "scrollbar");
        class136.field2174 = arg1.method1359(97, "name_icons");
        class12.field205 = arg1.method1359(84, "floorshadows");
        if (arg0 == 16742584) {
            class157.field2382 = arg1.method1359(77, "compass");
            class252.field3633 = arg1.method1359(69, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 32)
    public static final void method1129(int arg0, int arg1) {
        field2229++;
        class18 var2 = class168.field2483;
        synchronized (class168.field2483) {
            if (arg0 != 128) {
                method1132(true);
            }
            class168.field2483.method104(arg1, (byte) -34);
        }
        class18 var3 = class58.field923;
        synchronized (class58.field923) {
            class58.field923.method104(arg1, (byte) -34);
        }
        class78 var4 = class417.field6046;
        synchronized (class417.field6046) {
            class417.field6046.method621(-63, arg1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)V", line = 59)
    public static final void method1130(int arg0, int arg1, byte arg2) {
        class351.field4987[arg1] = arg0;
        field2231++;
        if (arg2 > -93) {
            field2232 = null;
        }
        class79 var3 = (class79) class190.field2821.method1219((long) arg1, -119);
        if (var3 == null) {
            class79 var4 = new class79(4611686018427387905L);
            class190.field2821.method1217(1, (long) arg1, var4);
        } else if (var3.field1341 != 4611686018427387905L) {
            var3.field1341 = class10.method63(-21149) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)Z", line = 88)
    public static final boolean method1131(int arg0, int arg1, int arg2, int arg3) {
        if (!class78.method619(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class50.field816[arg0].method794(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class113.field1817) {
                    if (!class218.method1647(var4, var6, var5)) {
                        return false;
                    }
                    if (!class218.method1647(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class218.method1647(var4, var7, var5)) {
                        return false;
                    }
                    if (!class218.method1647(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class218.method1647(var4, var8, var5)) {
                    return false;
                }
                if (!class218.method1647(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class389.field5579) {
                    if (!class218.method1647(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class218.method1647(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class218.method1647(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class218.method1647(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class218.method1647(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class218.method1647(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class113.field1817) {
                    if (!class218.method1647(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class218.method1647(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class218.method1647(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class218.method1647(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class218.method1647(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class218.method1647(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class389.field5579) {
                    if (!class218.method1647(var4, var6, var5)) {
                        return false;
                    }
                    if (!class218.method1647(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class218.method1647(var4, var7, var5)) {
                        return false;
                    }
                    if (!class218.method1647(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class218.method1647(var4, var8, var5)) {
                    return false;
                }
                if (!class218.method1647(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class218.method1647(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class218.method1647(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class218.method1647(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class218.method1647(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class218.method1647(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 275)
    public static void method1132(boolean arg0) {
        field2233 = null;
        if (arg0) {
            field2232 = null;
        }
    }
}

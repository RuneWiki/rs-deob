import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class562 extends class18 implements class532 {

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "Ll;")
    public class18 field7454;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "Lcu;")
    public static class206 field7451 = new class206(52, 18);

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field7461 = 0;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Loa;I)V")
    public final void method138(class651 arg0, int arg1) {
        field7457++;
        if (arg1 != 2215) {
            field7461 = 91;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = 54 / ((-arg0 - 26) / 38);
        field7449++;
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z")
    public final boolean method150(byte arg0) {
        field7460++;
        if (arg0 > -34) {
            this.method148(null, (byte) 6);
        }
        return false;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public final void method144(boolean arg0) {
        if (arg0) {
            this.method152(true);
        }
        field7455++;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(Z)I")
    public final int method152(boolean arg0) {
        if (arg0) {
            field7450++;
            return 0;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(B)I")
    public final int method188(byte arg0) {
        if (arg0 <= 73) {
            this.method143(44, null);
        }
        field7453++;
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIIILl;)V")
    public class562(int arg0, int arg1, int arg2, int arg3, int arg4, class18 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class636.method3513(arg0, arg1, -48));
        this.field7454 = arg5;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Loa;BI)Lba;")
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        if (arg1 != -47) {
            field7461 = -63;
        }
        field7459++;
        return null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Loa;B)V")
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 != 70) {
            method3088(-124);
        }
        field7458++;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)I")
    public final int method146(boolean arg0) {
        field7446++;
        return arg0 ? 60 : 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILoa;)Ldd;")
    public final class660 method143(int arg0, class651 arg1) {
        field7448++;
        return arg0 == 31358 ? this.field7454.method143(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3087(int arg0, int arg1, int arg2, int arg3) {
        if (!class572.method3142(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class348.field4782;
        int var5 = arg2 << class348.field4782;
        int var6 = class218.field3099[arg0].method195(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class348.field4782 - 7);
        int var8 = var6 - (0xE6 << class348.field4782 - 7);
        int var9 = var6 - (0xEE << class348.field4782 - 7);
        if (arg3 == 1) {
            if (var4 > class548.field7315) {
                if (!class312.method1861(var4, var6, var5)) {
                    return false;
                }
                if (!class312.method1861(var4, var6, class16.field256 + var5)) {
                    return false;
                }
                if (!class312.method1861(var4, var6, class587.field7787 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class312.method1861(var4, var7, var5)) {
                    return false;
                }
                if (!class312.method1861(var4, var7, class16.field256 + var5)) {
                    return false;
                }
                if (!class312.method1861(var4, var7, class587.field7787 + var5)) {
                    return false;
                }
            }
            if (!class312.method1861(var4, var8, var5)) {
                return false;
            } else if (class312.method1861(var4, var8, class16.field256 + var5)) {
                return class312.method1861(var4, var8, class587.field7787 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class418.field5723) {
                if (!class312.method1861(var4, var6, class587.field7787 + var5)) {
                    return false;
                }
                if (!class312.method1861(class16.field256 + var4, var6, class587.field7787 + var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var6, class587.field7787 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class312.method1861(var4, var7, class587.field7787 + var5)) {
                    return false;
                }
                if (!class312.method1861(class16.field256 + var4, var7, class587.field7787 + var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var7, class587.field7787 + var5)) {
                    return false;
                }
            }
            if (!class312.method1861(var4, var8, class587.field7787 + var5)) {
                return false;
            } else if (class312.method1861(class16.field256 + var4, var8, class587.field7787 + var5)) {
                return class312.method1861(class587.field7787 + var4, var8, class587.field7787 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class548.field7315) {
                if (!class312.method1861(class587.field7787 + var4, var6, var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var6, class16.field256 + var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var6, class587.field7787 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class312.method1861(class587.field7787 + var4, var7, var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var7, class16.field256 + var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var7, class587.field7787 + var5)) {
                    return false;
                }
            }
            if (!class312.method1861(class587.field7787 + var4, var8, var5)) {
                return false;
            } else if (class312.method1861(class587.field7787 + var4, var8, class16.field256 + var5)) {
                return class312.method1861(class587.field7787 + var4, var8, class587.field7787 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class418.field5723) {
                if (!class312.method1861(var4, var6, var5)) {
                    return false;
                }
                if (!class312.method1861(class16.field256 + var4, var6, var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class312.method1861(var4, var7, var5)) {
                    return false;
                }
                if (!class312.method1861(class16.field256 + var4, var7, var5)) {
                    return false;
                }
                if (!class312.method1861(class587.field7787 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class312.method1861(var4, var8, var5)) {
                return false;
            } else if (class312.method1861(class16.field256 + var4, var8, var5)) {
                return class312.method1861(class587.field7787 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class312.method1861(class16.field256 + var4, var9, class16.field256 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class312.method1861(var4, var8, class587.field7787 + var5);
        } else if (arg3 == 32) {
            return class312.method1861(class587.field7787 + var4, var8, class587.field7787 + var5);
        } else if (arg3 == 64) {
            return class312.method1861(class587.field7787 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class312.method1861(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
    public final int method151(byte arg0) {
        if (arg0 != 78) {
            field7451 = null;
        }
        field7456++;
        return 0;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public static void method3088(int arg0) {
        if (arg0 != 30709) {
            method3087(53, 17, -93, 91);
        }
        field7451 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Loa;Z)V")
    public final void method147(class651 arg0, boolean arg1) {
        field7452++;
        if (!arg1) {
            this.method150((byte) -118);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BLoa;)Lpe;")
    public final class571 method145(byte arg0, class651 arg1) {
        if (arg0 != 124) {
            this.field7454 = null;
        }
        field7447++;
        return null;
    }
}

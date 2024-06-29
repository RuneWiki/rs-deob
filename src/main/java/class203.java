import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class203 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lhj;")
    public static class69 field3660 = class181.method1318("Nehmen", (byte) -111);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lhj;")
    public static class69 field3657 = class181.method1318("<col=00ffff>", (byte) -124);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3662 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static final void method1471(byte arg0) {
        field3659++;
        class250.field4538++;
        class48.field692.method301(83, -104);
        for (class259 var1 = (class259) class156.field2910.method768((byte) 30); var1 != null; var1 = (class259) class156.field2910.method760(-15725)) {
            if (var1.field4639 == 0) {
                class52.method306(var1, true, 3);
            }
        }
        if (class193.field3516 != null) {
            class204.method1478(class193.field3516, false);
            class193.field3516 = null;
        }
        int var2 = -45 / (-arg0 / 60);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
    public static final boolean method1472(int arg0, int arg1) {
        field3661++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            return arg0 == -24587;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lsd;ILjava/lang/Object;)V")
    public static final void method1473(class42 arg0, int arg1, Object arg2) {
        field3663++;
        if (arg0.field598 == null) {
            return;
        }
        if (arg1 >= -14) {
            method1472(-32, 24);
        }
        for (int var3 = 0; var3 < 50 && arg0.field598.peekEvent() != null; var3++) {
            class59.method356(false, 1L);
        }
        if (arg2 != null) {
            arg0.field598.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public static void method1474(boolean arg0) {
        field3660 = null;
        if (!arg0) {
            field3657 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1475(int arg0, int arg1, int arg2, int arg3) {
        if (!class152.method1154(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class271.field4793[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class108.field2050) {
                    if (!class64.method419(var4, var6, var5)) {
                        return false;
                    }
                    if (!class64.method419(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method419(var4, var7, var5)) {
                        return false;
                    }
                    if (!class64.method419(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class64.method419(var4, var8, var5)) {
                    return false;
                }
                if (!class64.method419(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class88.field1673) {
                    if (!class64.method419(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class64.method419(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method419(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class64.method419(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class64.method419(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class64.method419(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class108.field2050) {
                    if (!class64.method419(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class64.method419(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method419(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class64.method419(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class64.method419(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class64.method419(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class88.field1673) {
                    if (!class64.method419(var4, var6, var5)) {
                        return false;
                    }
                    if (!class64.method419(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class64.method419(var4, var7, var5)) {
                        return false;
                    }
                    if (!class64.method419(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class64.method419(var4, var8, var5)) {
                    return false;
                }
                if (!class64.method419(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class64.method419(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class64.method419(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class64.method419(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class64.method419(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class64.method419(var4, var8, var5);
        } else {
            return true;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class133 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lnp;")
    public class340 field1935 = new class340();

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Z")
    public static boolean field1940;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lnp;")
    private class340 field1939;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lnp;")
    public final class340 method908(int arg0) {
        if (arg0 >= -4) {
            field1940 = false;
        }
        field1936++;
        class340 var2 = this.field1935.field4899;
        if (this.field1935 == var2) {
            this.field1939 = null;
            return null;
        } else {
            this.field1939 = var2.field4899;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLnp;)V")
    public final void method909(byte arg0, class340 arg1) {
        field1933++;
        if (arg0 > -56) {
            return;
        }
        if (arg1.field4898 != null) {
            arg1.method2020(105);
        }
        arg1.field4898 = this.field1935.field4898;
        arg1.field4899 = this.field1935;
        arg1.field4898.field4899 = arg1;
        arg1.field4899.field4898 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
    public final int method910(int arg0) {
        field1938++;
        int var2 = arg0;
        for (class340 var3 = this.field1935.field4899; var3 != this.field1935; var3 = var3.field4899) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)Z")
    public static final boolean method911(int arg0, int arg1, int arg2, int arg3) {
        if (!class442.method2635(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class523.field7736;
        int var5 = arg2 << class523.field7736;
        int var6 = class211.field2950[arg0].method351(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class523.field7736 - 7);
        int var8 = var6 - (0xE6 << class523.field7736 - 7);
        int var9 = var6 - (0xEE << class523.field7736 - 7);
        if (arg3 == 1) {
            if (var4 > class181.field2671) {
                if (!class61.method501(var4, var6, var5)) {
                    return false;
                }
                if (!class61.method501(var4, var6, class131.field1925 + var5)) {
                    return false;
                }
                if (!class61.method501(var4, var6, class424.field6241 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class61.method501(var4, var7, var5)) {
                    return false;
                }
                if (!class61.method501(var4, var7, class131.field1925 + var5)) {
                    return false;
                }
                if (!class61.method501(var4, var7, class424.field6241 + var5)) {
                    return false;
                }
            }
            if (!class61.method501(var4, var8, var5)) {
                return false;
            } else if (class61.method501(var4, var8, class131.field1925 + var5)) {
                return class61.method501(var4, var8, class424.field6241 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class13.field201) {
                if (!class61.method501(var4, var6, class424.field6241 + var5)) {
                    return false;
                }
                if (!class61.method501(class131.field1925 + var4, var6, class424.field6241 + var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var6, class424.field6241 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class61.method501(var4, var7, class424.field6241 + var5)) {
                    return false;
                }
                if (!class61.method501(class131.field1925 + var4, var7, class424.field6241 + var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var7, class424.field6241 + var5)) {
                    return false;
                }
            }
            if (!class61.method501(var4, var8, class424.field6241 + var5)) {
                return false;
            } else if (class61.method501(class131.field1925 + var4, var8, class424.field6241 + var5)) {
                return class61.method501(class424.field6241 + var4, var8, class424.field6241 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class181.field2671) {
                if (!class61.method501(class424.field6241 + var4, var6, var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var6, class131.field1925 + var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var6, class424.field6241 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class61.method501(class424.field6241 + var4, var7, var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var7, class131.field1925 + var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var7, class424.field6241 + var5)) {
                    return false;
                }
            }
            if (!class61.method501(class424.field6241 + var4, var8, var5)) {
                return false;
            } else if (class61.method501(class424.field6241 + var4, var8, class131.field1925 + var5)) {
                return class61.method501(class424.field6241 + var4, var8, class424.field6241 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class13.field201) {
                if (!class61.method501(var4, var6, var5)) {
                    return false;
                }
                if (!class61.method501(class131.field1925 + var4, var6, var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class61.method501(var4, var7, var5)) {
                    return false;
                }
                if (!class61.method501(class131.field1925 + var4, var7, var5)) {
                    return false;
                }
                if (!class61.method501(class424.field6241 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class61.method501(var4, var8, var5)) {
                return false;
            } else if (class61.method501(class131.field1925 + var4, var8, var5)) {
                return class61.method501(class424.field6241 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class61.method501(class131.field1925 + var4, var9, class131.field1925 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class61.method501(var4, var8, class424.field6241 + var5);
        } else if (arg3 == 32) {
            return class61.method501(class424.field6241 + var4, var8, class424.field6241 + var5);
        } else if (arg3 == 64) {
            return class61.method501(class424.field6241 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class61.method501(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public final void method912(int arg0) {
        while (true) {
            class340 var2 = this.field1935.field4899;
            if (this.field1935 == var2) {
                field1937++;
                if (arg0 != 7) {
                    this.field1939 = null;
                }
                this.field1939 = null;
                return;
            }
            var2.method2020(120);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Lnp;")
    public final class340 method913(byte arg0) {
        field1934++;
        class340 var2 = this.field1939;
        if (this.field1935 == var2) {
            this.field1939 = null;
            return null;
        }
        if (arg0 <= 65) {
            this.field1939 = null;
        }
        this.field1939 = var2.field4899;
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class133() {
        this.field1935.field4899 = this.field1935;
        this.field1935.field4898 = this.field1935;
    }

    static {
        new class466("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field1940 = true;
    }
}

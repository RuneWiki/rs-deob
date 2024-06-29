import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class134 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lfm;")
    private class94 field1997 = null;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    private int field2003 = 65000;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lfm;")
    private class94 field2006 = null;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    private int field2009;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Lam;")
    public static class317 field2000 = new class317(0, 0);

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field2001 = -2;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[[Ldg;")
    public static class6[][] field2010;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)Z", line = 4)
    public static final boolean method939(int arg0, int arg1, int arg2, int arg3) {
        if (class92.method651(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class125.method882(var4 + 1, class278.field4548[arg0][arg1][arg2] + arg3, var5 + 1) && class125.method882(var4 + 128 - 1, class278.field4548[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class125.method882(var4 + 128 - 1, class278.field4548[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class125.method882(var4 + 1, class278.field4548[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;", line = 36)
    public final String toString() {
        field2005++;
        return "Cache:" + this.field2009;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[BI)Z", line = 49)
    public final boolean method940(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != -18728) {
            this.field2003 = 86;
        }
        field1999++;
        class94 var5 = this.field1997;
        synchronized (this.field1997) {
            if (arg3 < 0 || this.field2003 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method944(arg3, arg1 ^ 0xFFFFB6A4, arg2, true, arg0);
            if (!var6) {
                var6 = this.method944(arg3, 98, arg2, false, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V", line = 77)
    public static final void method941() {
        for (int var0 = 0; var0 < class234.field3732; var0++) {
            class232 var1 = class241.field3857[var0];
            class238.method1707(var1);
            class241.field3857[var0] = null;
        }
        class234.field3732 = 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIILth;JZ)V", line = 95)
    public static final void method942(int arg0, int arg1, int arg2, int arg3, class126 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class107 var8 = new class107();
        var8.field1499 = arg4;
        var8.field1510 = arg1 * 128 + 64;
        var8.field1500 = arg2 * 128 + 64;
        var8.field1504 = arg3;
        var8.field1508 = arg5;
        var8.field1503 = arg6;
        if (class205.field3312[arg0][arg1][arg2] == null) {
            class205.field3312[arg0][arg1][arg2] = new class308(arg0, arg1, arg2);
        }
        class205.field3312[arg0][arg1][arg2].field5207 = var8;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)[B", line = 115)
    public final byte[] method943(int arg0, int arg1) {
        field1998++;
        class94 var3 = this.field1997;
        synchronized (this.field1997) {
            try {
                Object var10000;
                if (((long) (arg1 * 6 + 6)) > this.field2006.method670(0)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field2006.method675(-105, (long) (arg1 * 6));
                this.field2006.method667(false, 0, class112.field1599, 6);
                int var4 = (class112.field1599[5] & 0xFF) + ((class112.field1599[arg0] & 0xFF) << 16) + (class112.field1599[4] & 0xFF << 8);
                int var5 = ((class112.field1599[0] & 0xFF) << 16) + (((class112.field1599[1] & 0xFF) << 8) + (class112.field1599[2] & 0xFF));
                if (var5 < 0 || var5 > this.field2003) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var4 > 0 && (long) var4 <= this.field1997.method670(0) / 520L) {
                    byte[] var6 = new byte[var5];
                    int var7 = 0;
                    int var8 = 0;
                    while (var8 < var5) {
                        if (var4 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field1997.method675(-116, (long) (var4 * 520));
                        int var9 = var5 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1997.method667(false, 0, class112.field1599, var9 + 8);
                        int var10 = class112.field1599[7] & 0xFF;
                        int var11 = ((class112.field1599[2] & 0xFF) << 8) + (class112.field1599[3] & 0xFF);
                        int var12 = (class112.field1599[6] & 0xFF) + (class112.field1599[5] & 0xFF << 8) + (class112.field1599[4] & 0xFF << 16);
                        int var13 = (class112.field1599[0] & 0xFF << 8) + (class112.field1599[1] & 0xFF);
                        if (arg1 != var13 || var7 != var11 || this.field2009 != var10) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var12 < 0 || ((long) var12) > (this.field1997.method670(0) / 520L)) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var4 = var12;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var8++] = class112.field1599[var14 + 8];
                        }
                        var7++;
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(ILfm;Lfm;I)V", line = 350)
    public class134(int arg0, class94 arg1, class94 arg2, int arg3) {
        this.field2006 = arg2;
        this.field2009 = arg0;
        this.field2003 = arg3;
        this.field1997 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[BZI)Z", line = 204)
    private final boolean method944(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field2008++;
        class94 var6 = this.field1997;
        synchronized (this.field1997) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (this.field2006.method670(0) < ((long) (arg4 * 6 + 6))) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field2006.method675(-117, (long) (arg4 * 6));
                    this.field2006.method667(false, 0, class112.field1599, 6);
                    var7 = ((class112.field1599[3] & 0xFF) << 16) + (class112.field1599[4] & 0xFF << 8) + (class112.field1599[5] & 0xFF);
                    if (var7 <= 0 || this.field1997.method670(0) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1997.method670(0) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class112.field1599[0] = (byte) (arg0 >> 16);
                class112.field1599[5] = (byte) var7;
                int var8 = 0;
                class112.field1599[4] = (byte) (var7 >> 8);
                class112.field1599[2] = (byte) arg0;
                class112.field1599[3] = (byte) (var7 >> 16);
                class112.field1599[1] = (byte) (arg0 >> 8);
                int var9 = 0;
                this.field2006.method675(-101, (long) (arg4 * 6));
                this.field2006.method677(class112.field1599, 0, 6, false);
                while (true) {
                    if (var8 < arg0) {
                        label133: {
                            int var10 = 0;
                            if (arg3) {
                                this.field1997.method675(-114, (long) (var7 * 520));
                                try {
                                    this.field1997.method667(false, 0, class112.field1599, 8);
                                } catch (EOFException var19) {
                                    break label133;
                                }
                                int var12 = (class112.field1599[0] & 0xFF << 8) + (class112.field1599[1] & 0xFF);
                                int var13 = ((class112.field1599[2] & 0xFF) << 8) + (class112.field1599[3] & 0xFF);
                                var10 = (class112.field1599[6] & 0xFF) + (((class112.field1599[4] & 0xFF) << 16) + (class112.field1599[5] & 0xFF << 8));
                                int var14 = class112.field1599[7] & 0xFF;
                                if (arg4 != var12 || var9 != var13 || this.field2009 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field1997.method670(0) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            int var15 = arg0 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            if (var10 == 0) {
                                arg3 = false;
                                var10 = (int) ((this.field1997.method670(0) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class112.field1599[0] = (byte) (arg4 >> 8);
                            class112.field1599[7] = (byte) this.field2009;
                            class112.field1599[3] = (byte) var9;
                            if ((arg0 - var8) <= 512) {
                                var10 = 0;
                            }
                            class112.field1599[2] = (byte) (var9 >> 8);
                            class112.field1599[4] = (byte) (var10 >> 16);
                            class112.field1599[5] = (byte) (var10 >> 8);
                            class112.field1599[1] = (byte) arg4;
                            var9++;
                            class112.field1599[6] = (byte) var10;
                            this.field1997.method675(-118, (long) (var7 * 520));
                            this.field1997.method677(class112.field1599, 0, 8, false);
                            this.field1997.method677(arg2, var8, var15, false);
                            var8 += var15;
                            var7 = var10;
                            continue;
                        }
                    }
                    int var16 = 85 % ((17 - arg1) / 42);
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var20) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 326)
    public static final int method945(int arg0) {
        int var1 = 112 / ((arg0 - 4) / 63);
        field2002++;
        return 2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V", line = 336)
    public static void method946(byte arg0) {
        int var1 = -70 % ((arg0 + 57) / 58);
        field2000 = null;
        field2010 = (class6[][]) null;
    }
}

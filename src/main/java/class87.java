import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 extends class26 {

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "Z")
    private volatile boolean field2182 = false;

    @OriginalMember(owner = "client!md", name = "lb", descriptor = "I")
    private int field2187 = -1;

    @OriginalMember(owner = "client!md", name = "wb", descriptor = "Z")
    private boolean field2198 = false;

    @OriginalMember(owner = "client!md", name = "Ab", descriptor = "Lpd;")
    private class108 field2202;

    @OriginalMember(owner = "client!md", name = "Cb", descriptor = "I")
    private int field2204;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "Lpd;")
    private class108 field2180;

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "Lic;")
    private static class59 field2184 = class59.method433(0, "wave2:");

    @OriginalMember(owner = "client!md", name = "nb", descriptor = "Lic;")
    public static class59 field2189 = field2184;

    @OriginalMember(owner = "client!md", name = "zb", descriptor = "[Lic;")
    public static class59[] field2201 = new class59[100];

    @OriginalMember(owner = "client!md", name = "Db", descriptor = "Lic;")
    public static class59 field2205 = field2184;

    @OriginalMember(owner = "client!md", name = "Bb", descriptor = "Lic;")
    public static class59 field2203 = class59.method433(0, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "Laf;")
    public static class7 field2181 = new class7(4096);

    @OriginalMember(owner = "client!md", name = "Gb", descriptor = "Lic;")
    private static class59 field2208 = class59.method433(0, "No response from server)3");

    @OriginalMember(owner = "client!md", name = "Hb", descriptor = "Lic;")
    public static class59 field2209 = field2208;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!md", name = "mb", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!md", name = "ob", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!md", name = "pb", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!md", name = "qb", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!md", name = "rb", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!md", name = "sb", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!md", name = "tb", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!md", name = "ub", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!md", name = "vb", descriptor = "I")
    private int field2197;

    @OriginalMember(owner = "client!md", name = "xb", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!md", name = "yb", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!md", name = "Fb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!md", name = "Ib", descriptor = "[Lce;")
    public static class20[] field2210;

    @OriginalMember(owner = "client!md", name = "Eb", descriptor = "[Z")
    private volatile boolean[] field2206;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Z")
    public static final boolean method713(int arg0) {
        if (arg0 <= 66) {
            field2189 = null;
        }
        ++field2188;
        class38 var1 = class18.field353;
        synchronized (class18.field353) {
            if (class42.field1089 == class131.field2934) {
                return false;
            } else {
                class23.field564 = class85.field2143[class42.field1089];
                class118.field2749 = class155.field3364[class42.field1089];
                class42.field1089 = class42.field1089 + 1 & 127;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static final void method714(byte arg0) {
        class75.field1842.method676((byte) -123);
        ++field2193;
        class102.field2488.method676((byte) -99);
        if (arg0 != -118) {
            field2201 = null;
        }
        class51.field1277.method676((byte) -121);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lpd;Lpd;IZZZ)V")
    public class87(class108 arg0, class108 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2202 = arg0;
        this.field2198 = arg5;
        this.field2204 = arg2;
        this.field2180 = arg1;
        class91.method749(false, this.field2204, this);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B[BZZI)V")
    public final void method715(byte arg0, byte[] arg1, boolean arg2, boolean arg3, int arg4) {
        ++field2192;
        int var6 = -82 / ((arg0 - -21) / 42);
        if (!arg3) {
            arg1[arg1.length + -2] = (byte) (super.field653[arg4] >> 8);
            arg1[arg1.length - 1] = (byte) super.field653[arg4];
            if (this.field2202 != null) {
                class86.method705(this.field2202, arg1, arg4, 88);
                this.field2206[arg4] = true;
            }
            if (arg2) {
                super.field652[arg4] = class47.method368(false, 136, arg1);
                return;
            }
        } else {
            if (this.field2182) {
                throw new RuntimeException();
            }
            if (this.field2180 != null) {
                class86.method705(this.field2180, arg1, this.field2204, 88);
            }
            this.method180(arg1, 6);
            this.method716(0);
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    private final void method716(int arg0) {
        this.field2206 = new boolean[super.field652.length];
        for (int var2 = arg0; ~this.field2206.length < ~var2; ++var2) {
            this.field2206[var2] = false;
        }
        ++field2200;
        if (this.field2202 == null) {
            this.field2182 = true;
        } else {
            this.field2187 = -1;
            for (int var3 = 0; var3 < this.field2206.length; ++var3) {
                if (~super.field674[var3] < -1) {
                    class139.method1055(this, var3, this.field2202, (byte) 21);
                    this.field2187 = var3;
                }
            }
            if (this.field2187 == -1) {
                this.field2182 = true;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method717(boolean arg0) {
        ++field2183;
        if (arg0) {
            if (class18.field353 != null) {
                class38 var1 = class18.field353;
                synchronized (class18.field353) {
                    class18.field353 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I")
    public final int method718(int arg0) {
        ++field2186;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field652.length; ++var4) {
            if (~super.field674[var4] < -1) {
                var3 += this.method723(var4, (byte) -51);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            if (arg0 != -1) {
                this.method715((byte) 25, (byte[]) null, true, false, -87);
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
    public final int method719(byte arg0) {
        ++field2190;
        if (this.field2182) {
            return 100;
        } else if (super.field652 != null) {
            return 99;
        } else {
            int var2 = class49.method378(this.field2204, 255, 125);
            if (~var2 <= -101) {
                var2 = 99;
            }
            int var3 = -53 / ((16 - arg0) / 54);
            return var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(II)V")
    public final void method204(int arg0, int arg1) {
        if (arg0 >= -90) {
            this.method716(-90);
        }
        class6.method31(arg1, this.field2204, -32904304);
        ++field2194;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V")
    public final void method720(int arg0, byte arg1, int arg2) {
        ++field2196;
        this.field2197 = arg0;
        this.field2185 = arg2;
        if (this.field2180 != null) {
            class80.method658(this, false, this.field2180, this.field2204);
        } else {
            class84.method696(255, (byte) 0, this.field2204, this.field2197, 7, this, true);
        }
        int var4 = -12 / ((54 - arg1) / 52);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V")
    public static final void method721(boolean arg0) {
        class16.field322.method676((byte) -115);
        ++field2199;
        if (!arg0) {
            field2201 = null;
        }
        class90.field2279.method676((byte) -100);
        class91.field2311.method676((byte) -101);
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
    public static void method722(int arg0) {
        field2184 = null;
        field2201 = null;
        field2203 = null;
        field2181 = null;
        field2210 = null;
        field2205 = null;
        field2208 = null;
        field2209 = null;
        field2189 = null;
        if (arg0 > -23) {
            field2201 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I")
    private final int method723(int arg0, byte arg1) {
        ++field2207;
        if (arg1 != -51) {
            this.method723(69, (byte) -22);
        }
        if (super.field652[arg0] != null) {
            return 100;
        } else {
            return this.field2206[arg0] ? 100 : class49.method378(arg0, this.field2204, arg1 ^ 43);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BZBLpd;I)V")
    public final void method724(byte[] arg0, boolean arg1, byte arg2, class108 arg3, int arg4) {
        if (arg2 != -11) {
            this.method723(54, (byte) -122);
        }
        ++field2195;
        if (this.field2180 == arg3) {
            if (this.field2182) {
                throw new RuntimeException();
            } else if (arg0 == null) {
                class84.method696(255, (byte) 0, this.field2204, this.field2197, 7, this, true);
            } else {
                class23.field550.reset();
                class23.field550.update(arg0, 0, arg0.length);
                int var6 = (int) class23.field550.getValue();
                class157 var7 = new class157(class22.method139(arg0, (byte) -119));
                int var8 = var7.method1194(false);
                if (~var8 != -6 && var8 != 6) {
                    throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
                } else {
                    int var9 = 0;
                    if (~var8 <= -7) {
                        var9 = var7.method1175((byte) -109);
                    }
                    if (~this.field2197 == ~var6 && this.field2185 == var9) {
                        this.method180(arg0, 6);
                        this.method716(0);
                    } else {
                        class84.method696(255, (byte) 0, this.field2204, this.field2197, 7, this, true);
                    }
                }
            }
        } else {
            if (!arg1 && this.field2187 == arg4) {
                this.field2182 = true;
            }
            if (arg0 != null && ~arg0.length < -3) {
                class23.field550.reset();
                class23.field550.update(arg0, 0, arg0.length - 2);
                int var10 = (int) class23.field550.getValue();
                int var11 = ((arg0[arg0.length - 2] & 255) << 8) + (arg0[arg0.length + -1] & 255);
                if (~super.field696[arg4] == ~var10 && super.field653[arg4] == var11) {
                    this.field2206[arg4] = true;
                    if (arg1) {
                        super.field652[arg4] = class47.method368(false, 136, arg0);
                    }
                } else {
                    this.field2206[arg4] = false;
                    if (this.field2198 || arg1) {
                        class84.method696(this.field2204, (byte) 2, arg4, super.field696[arg4], 7, this, arg1);
                    }
                }
            } else {
                this.field2206[arg4] = false;
                if (this.field2198 || arg1) {
                    class84.method696(this.field2204, (byte) 2, arg4, super.field696[arg4], 7, this, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
    public final void method198(byte arg0, int arg1) {
        if (this.field2202 != null && this.field2206 != null && this.field2206[arg1]) {
            class80.method658(this, false, this.field2202, arg1);
        } else {
            class84.method696(this.field2204, (byte) 2, arg1, super.field696[arg1], 7, this, true);
        }
        ++field2191;
        if (arg0 != 20) {
            method713(-5);
        }
    }
}

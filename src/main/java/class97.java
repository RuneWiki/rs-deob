import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class97 extends class13 {

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Z")
    public boolean field2190 = true;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "[Lec;")
    public class32[] field2191 = new class32[5];

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public int field2187 = -1;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    private int field2194 = -1;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public int field2197 = -1;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public int field2198 = 1;

    @OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
    public int field2213 = -1;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    private int field2208 = 128;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public int field2211 = -1;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public int field2204 = -1;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    private int field2193 = 0;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public int field2200 = -1;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "Lec;")
    public class32 field2206 = class71.field1672;

    @OriginalMember(owner = "client!o", name = "sb", descriptor = "I")
    private int field2224 = 0;

    @OriginalMember(owner = "client!o", name = "pb", descriptor = "I")
    public int field2221 = -1;

    @OriginalMember(owner = "client!o", name = "nb", descriptor = "I")
    public int field2219 = -1;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    private int field2188 = -1;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public int field2203 = -1;

    @OriginalMember(owner = "client!o", name = "xb", descriptor = "I")
    private int field2229 = 128;

    @OriginalMember(owner = "client!o", name = "ob", descriptor = "I")
    public int field2220 = 32;

    @OriginalMember(owner = "client!o", name = "rb", descriptor = "Z")
    public boolean field2223 = true;

    @OriginalMember(owner = "client!o", name = "Lb", descriptor = "Z")
    public boolean field2243 = true;

    @OriginalMember(owner = "client!o", name = "Nb", descriptor = "Z")
    public boolean field2245 = false;

    @OriginalMember(owner = "client!o", name = "ib", descriptor = "Lwc;")
    public static class156 field2214 = new class156(4096);

    @OriginalMember(owner = "client!o", name = "Ab", descriptor = "I")
    public static int field2232 = 0;

    @OriginalMember(owner = "client!o", name = "Cb", descriptor = "Lec;")
    private static class32 field2234 = class73.method594("You are standing in a members)2only area)3", true);

    @OriginalMember(owner = "client!o", name = "Eb", descriptor = "Lec;")
    public static class32 field2236 = class73.method594("Ihr Charakter)2Profil wird in:", true);

    @OriginalMember(owner = "client!o", name = "Bb", descriptor = "Lec;")
    private static class32 field2233 = class73.method594("Please try again)3", true);

    @OriginalMember(owner = "client!o", name = "Kb", descriptor = "I")
    public static int field2242 = 20;

    @OriginalMember(owner = "client!o", name = "Jb", descriptor = "Lec;")
    public static class32 field2241 = field2234;

    @OriginalMember(owner = "client!o", name = "Gb", descriptor = "Lec;")
    public static class32 field2238 = field2233;

    @OriginalMember(owner = "client!o", name = "zb", descriptor = "Lec;")
    private static class32 field2231 = class73.method594("Unable to find ", true);

    @OriginalMember(owner = "client!o", name = "Ib", descriptor = "Lec;")
    public static class32 field2240 = field2231;

    @OriginalMember(owner = "client!o", name = "Mb", descriptor = "Lec;")
    private static class32 field2244 = class73.method594(" has logged out)3", true);

    @OriginalMember(owner = "client!o", name = "wb", descriptor = "Lec;")
    public static class32 field2228 = field2244;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!o", name = "jb", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!o", name = "lb", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!o", name = "mb", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!o", name = "tb", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!o", name = "ub", descriptor = "I")
    public int field2226;

    @OriginalMember(owner = "client!o", name = "vb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!o", name = "Hb", descriptor = "Lea;")
    public static class30 field2239;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "[I")
    private int[] field2192;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "[I")
    private int[] field2205;

    @OriginalMember(owner = "client!o", name = "kb", descriptor = "[I")
    public int[] field2216;

    @OriginalMember(owner = "client!o", name = "Fb", descriptor = "[Loe;")
    public static class102[] field2237;

    @OriginalMember(owner = "client!o", name = "Db", descriptor = "[Lh;")
    public static class49[] field2235;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "[S")
    private short[] field2195;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "[S")
    private short[] field2199;

    @OriginalMember(owner = "client!o", name = "qb", descriptor = "[S")
    private short[] field2222;

    @OriginalMember(owner = "client!o", name = "yb", descriptor = "[S")
    private short[] field2230;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)I")
    public static final int method753(int arg0, int arg1, int arg2) {
        int var3 = arg2 + arg0 * 57;
        field2212++;
        if (arg1 > -65) {
            field2234 = null;
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Lp;")
    public final class104 method754(int arg0) {
        field2189++;
        if (this.field2216 != null) {
            class97 var2 = this.method759(-92);
            return var2 == null ? null : var2.method754(-91);
        } else if (this.field2205 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field2205.length; var4++) {
                if (!class19.field363.method213(this.field2205[var4], true, 0)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class104[] var5 = new class104[this.field2205.length];
            for (int var6 = 0; var6 < this.field2205.length; var6++) {
                var5[var6] = class104.method842(class19.field363, this.field2205[var6], 0);
            }
            class104 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class104(var5, var5.length);
            }
            if (arg0 > -7) {
                return null;
            }
            if (this.field2230 != null) {
                for (int var8 = 0; var8 < this.field2230.length; var8++) {
                    var7.method835(this.field2230[var8], this.field2222[var8]);
                }
            }
            if (this.field2195 != null) {
                for (int var9 = 0; var9 < this.field2195.length; var9++) {
                    var7.method855(this.field2195[var9], this.field2199[var9]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BILge;)V")
    public static final void method755(byte arg0, int arg1, class47 arg2) {
        field2227++;
        if (arg0 != 7) {
            field2242 = 47;
        }
        while (true) {
            class29 var3 = (class29) class112.field2629.method1213(arg0 + 86);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field535; var5++) {
                if (var3.field529[var5] != null) {
                    if (var3.field529[var5].field355 == 2) {
                        var3.field524[var5] = -5;
                    }
                    if (var3.field529[var5].field355 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field534[var5] != null) {
                    if (var3.field534[var5].field355 == 2) {
                        var3.field524[var5] = -6;
                    }
                    if (var3.field534[var5].field355 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method357(arg1, arg0 ^ 0xFFFFFF9F);
            arg2.method515((byte) 73, 0);
            int var6 = arg2.field1569;
            arg2.method531(false, var3.field518);
            for (int var7 = 0; var7 < var3.field535; var7++) {
                if (var3.field524[var7] == 0) {
                    try {
                        int var8 = var3.field532[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field529[var7].field352;
                            int var13 = var12.getInt(null);
                            arg2.method515((byte) 90, 0);
                            arg2.method531(false, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field529[var7].field352;
                            var11.setInt(null, var3.field526[var7]);
                            arg2.method515((byte) 62, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field529[var7].field352;
                            int var10 = var9.getModifiers();
                            arg2.method515((byte) 72, 0);
                            arg2.method531(false, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field534[var7].field352;
                            byte[][] var17 = var3.field533[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method515((byte) 71, 0);
                            } else if (var21 instanceof Number) {
                                arg2.method515((byte) 76, 1);
                                arg2.method542(((Number) var21).longValue(), (byte) 56);
                            } else if (var21 instanceof class32) {
                                arg2.method515((byte) 88, 2);
                                arg2.method522((class32) var21, (byte) 117);
                            } else {
                                arg2.method515((byte) 104, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field534[var7].field352;
                            int var15 = var14.getModifiers();
                            arg2.method515((byte) 74, 0);
                            arg2.method531(false, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method515((byte) 97, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method515((byte) 93, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method515((byte) 69, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method515((byte) 85, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method515((byte) 69, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method515((byte) 117, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method515((byte) 74, -16);
                    } catch (SecurityException var29) {
                        arg2.method515((byte) 84, -17);
                    } catch (IOException var30) {
                        arg2.method515((byte) 118, -18);
                    } catch (NullPointerException var31) {
                        arg2.method515((byte) 68, -19);
                    } catch (Exception var32) {
                        arg2.method515((byte) 119, -20);
                    } catch (Throwable var33) {
                        arg2.method515((byte) 125, -21);
                    }
                } else {
                    arg2.method515((byte) 67, var3.field524[var7]);
                }
            }
            arg2.method523((byte) 95, var6);
            arg2.method516(arg2.field1569 - var6, false);
            var3.method1093(0);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method756(int arg0, byte[] arg1) {
        field2215++;
        class66 var2 = new class66(arg1);
        int var3 = var2.method533(arg0 - 31280);
        int var4 = var2.method539(true);
        if (arg0 != 31535) {
            field2241 = null;
        }
        if (var4 < 0 || class36.field743 != 0 && class36.field743 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method558(var4, 0, false, var7);
            return var7;
        } else {
            int var5 = var2.method539(true);
            if (var5 < 0 || class36.field743 != 0 && class36.field743 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class122.method966(var6, var5, arg1, var4, 9);
            } else {
                class13.field217.method6(var6, (byte) -104, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z")
    public final boolean method757(int arg0) {
        field2217++;
        if (this.field2216 == null) {
            return true;
        }
        int var2 = -1;
        if (arg0 != -27678) {
            return false;
        }
        if (this.field2194 != -1) {
            var2 = class70.method578((byte) -98, this.field2194);
        } else if (this.field2188 != -1) {
            var2 = class27.field504[this.field2188];
        }
        return var2 >= 0 && var2 < this.field2216.length && this.field2216[var2] != -1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lec;ZILec;Lec;)V")
    public static final void method758(class32 arg0, boolean arg1, int arg2, class32 arg3, class32 arg4) {
        for (int var5 = 99; var5 > 0; var5--) {
            class17.field347[var5] = class17.field347[var5 - 1];
            class14.field245[var5] = class14.field245[var5 - 1];
            class36.field833[var5] = class36.field833[var5 - 1];
            class111.field2612[var5] = class111.field2612[var5 - 1];
        }
        class15.field319 = class115.field2769;
        field2218++;
        class14.field245[0] = arg0;
        class23.field423++;
        if (!arg1) {
            method762((byte) -56, -10);
        }
        class17.field347[0] = arg2;
        class36.field833[0] = arg3;
        class111.field2612[0] = arg4;
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)Lo;")
    public final class97 method759(int arg0) {
        int var2 = -1;
        field2207++;
        if (this.field2194 != -1) {
            var2 = class70.method578((byte) -98, this.field2194);
        } else if (this.field2188 != -1) {
            var2 = class27.field504[this.field2188];
        }
        int var3 = -122 % ((22 - arg0) / 63);
        return var2 < 0 || var2 >= this.field2216.length || this.field2216[var2] == -1 ? null : class17.method130(-92, this.field2216[var2]);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjd;)V")
    public final void method760(byte arg0, class66 arg1) {
        if (arg0 != -118) {
            method762((byte) -116, 102);
        }
        field2196++;
        while (true) {
            int var3 = arg1.method533(255);
            if (var3 == 0) {
                return;
            }
            this.method765(-128, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field2235 = null;
        field2234 = null;
        field2238 = null;
        field2233 = null;
        int var1 = 89 / ((-arg0 - 43) / 37);
        field2241 = null;
        field2237 = null;
        field2239 = null;
        field2240 = null;
        field2236 = null;
        field2244 = null;
        field2228 = null;
        field2231 = null;
        field2214 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lvc;")
    public static final class149 method762(byte arg0, int arg1) {
        class149 var2 = (class149) class92.field2109.method486(-28825, (long) arg1);
        field2201++;
        if (arg0 <= 81) {
            field2232 = 39;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field1829.method206(12, arg1, -75);
        class149 var4 = new class149();
        if (var3 != null) {
            var4.method1109(new class66(var3), (byte) 117);
        }
        var4.method1117(0);
        class92.field2109.method485((long) arg1, (byte) -123, var4);
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lvc;ILvc;BI)Lod;")
    public final class101 method763(class149 arg0, int arg1, class149 arg2, byte arg3, int arg4) {
        field2209++;
        if (this.field2216 != null) {
            class97 var6 = this.method759(101);
            return var6 == null ? null : var6.method763(arg0, arg1, arg2, (byte) 74, arg4);
        }
        int var7 = -8 % ((13 - arg3) / 51);
        class101 var8 = (class101) class143.field3271.method486(-28825, (long) this.field2226);
        if (var8 == null) {
            boolean var9 = false;
            for (int var10 = 0; var10 < this.field2192.length; var10++) {
                if (!class19.field363.method213(this.field2192[var10], true, 0)) {
                    var9 = true;
                }
            }
            if (var9) {
                return null;
            }
            class104[] var11 = new class104[this.field2192.length];
            for (int var12 = 0; var12 < this.field2192.length; var12++) {
                var11[var12] = class104.method842(class19.field363, this.field2192[var12], 0);
            }
            class104 var13;
            if (var11.length == 1) {
                var13 = var11[0];
            } else {
                var13 = new class104(var11, var11.length);
            }
            if (this.field2230 != null) {
                for (int var14 = 0; var14 < this.field2230.length; var14++) {
                    var13.method835(this.field2230[var14], this.field2222[var14]);
                }
            }
            if (this.field2195 != null) {
                for (int var15 = 0; var15 < this.field2195.length; var15++) {
                    var13.method855(this.field2195[var15], this.field2199[var15]);
                }
            }
            var8 = var13.method849(this.field2193 + 64, this.field2224 + 850, -30, -50, -30);
            class143.field3271.method485((long) this.field2226, (byte) -122, var8);
        }
        class101 var16;
        if (arg2 != null && arg0 != null) {
            var16 = arg2.method1116(arg4, arg0, var8, 0, arg1);
        } else if (arg2 != null) {
            var16 = arg2.method1118(var8, arg1, 0);
        } else if (arg0 == null) {
            var16 = var8.method801(true);
        } else {
            var16 = arg0.method1118(var8, arg4, 0);
        }
        if (this.field2208 != 128 || this.field2229 != 128) {
            var16.method807(this.field2208, this.field2229, this.field2208);
        }
        return var16;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public final void method764(byte arg0) {
        field2202++;
        if (arg0 <= 31) {
            method753(96, -98, 118);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjd;I)V")
    private final void method765(int arg0, class66 arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg1.method533(255);
            this.field2192 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2192[var5] = arg1.method532(0);
            }
        } else if (arg2 == 2) {
            this.field2206 = arg1.method556(1347418632);
        } else if (arg2 == 12) {
            this.field2198 = arg1.method533(255);
        } else if (arg2 == 13) {
            this.field2197 = arg1.method532(0);
        } else if (arg2 == 14) {
            this.field2204 = arg1.method532(0);
        } else if (arg2 == 15) {
            this.field2211 = arg1.method532(0);
        } else if (arg2 == 16) {
            this.field2187 = arg1.method532(0);
        } else if (arg2 == 17) {
            this.field2204 = arg1.method532(0);
            this.field2203 = arg1.method532(0);
            this.field2221 = arg1.method532(0);
            this.field2213 = arg1.method532(0);
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field2191[arg2 - 30] = arg1.method556(1347418632);
            if (this.field2191[arg2 - 30].method271((byte) 121, class159.field3657)) {
                this.field2191[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var12 = arg1.method533(255);
            this.field2230 = new short[var12];
            this.field2222 = new short[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2230[var13] = (short) arg1.method532(0);
                this.field2222[var13] = (short) arg1.method532(0);
            }
        } else if (arg2 == 41) {
            int var10 = arg1.method533(255);
            this.field2195 = new short[var10];
            this.field2199 = new short[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2195[var11] = (short) arg1.method532(0);
                this.field2199[var11] = (short) arg1.method532(0);
            }
        } else if (arg2 == 60) {
            int var6 = arg1.method533(255);
            this.field2205 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2205[var7] = arg1.method532(0);
            }
        } else if (arg2 == 93) {
            this.field2223 = false;
        } else if (arg2 == 95) {
            this.field2200 = arg1.method532(0);
        } else if (arg2 == 97) {
            this.field2208 = arg1.method532(0);
        } else if (arg2 == 98) {
            this.field2229 = arg1.method532(0);
        } else if (arg2 == 99) {
            this.field2245 = true;
        } else if (arg2 == 100) {
            this.field2193 = arg1.method545((byte) 94);
        } else if (arg2 == 101) {
            this.field2224 = arg1.method545((byte) 105) * 5;
        } else if (arg2 == 102) {
            this.field2219 = arg1.method532(0);
        } else if (arg2 == 103) {
            this.field2220 = arg1.method532(0);
        } else if (arg2 == 106) {
            this.field2194 = arg1.method532(0);
            if (this.field2194 == 65535) {
                this.field2194 = -1;
            }
            this.field2188 = arg1.method532(0);
            if (this.field2188 == 65535) {
                this.field2188 = -1;
            }
            int var8 = arg1.method533(255);
            this.field2216 = new int[var8 + 1];
            for (int var9 = 0; var9 <= var8; var9++) {
                this.field2216[var9] = arg1.method532(0);
                if (this.field2216[var9] == 65535) {
                    this.field2216[var9] = -1;
                }
            }
        } else if (arg2 == 107) {
            this.field2190 = false;
        } else if (arg2 == 109) {
            this.field2243 = false;
        }
        field2225++;
        if (arg0 >= -126) {
            method762((byte) -30, -75);
        }
    }
}

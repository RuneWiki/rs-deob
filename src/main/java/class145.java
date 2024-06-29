import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class145 extends class513 {

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public int field2007 = 0;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "Lsba;")
    private class556 field2005;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public int field2000;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "[I")
    private int[] field2010;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "Lpga;")
    private class492 field2017;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "F")
    public float field1998;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field2004 = -1;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "Llk;")
    private class251 field2014;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2008;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2002;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
    public final void method943(int arg0, int arg1) {
        field2013++;
        this.field2008.method2551();
        this.field2014 = this.field2017.method638((byte) -123, false);
        this.field2014.method1593(this.field2002, arg1, arg0 * 4, 1340);
        this.field2008 = null;
        this.field2002 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([III)V")
    public final void method944(int[] arg0, int arg1, int arg2) {
        field2016++;
        if (arg1 != 1) {
            this.method946((byte) 114, -40);
        }
        class212 var4 = this.field2017.method2909(true, this.field2007 * 3);
        Buffer var5 = var4.method1401(true, 55);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field2017.method2917(var5, false);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method2541()) {
            label125: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                int var12 = this.field2010[var11];
                short[] var13 = this.field2005.field7873[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label125;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method2554(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                int var21 = this.field2010[var20];
                short[] var22 = this.field2005.field7873[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label100;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    var6.method2544(var26);
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method2551();
        if (!var4.method1400(false) || var7 <= 0) {
            return;
        }
        this.field2017.method2951(true, (this.field2005.field7858 & 0x7) != 0, (this.field2005.field7858 & 0x8) != 0, this.field2009);
        if (this.field2017.field6898) {
            this.field2017.method2186(Integer.MAX_VALUE, this.field2018, this.field2000, this.field2012);
        }
        class173 var19 = this.field2017.method2872((byte) -111);
        var19.method1091(1.0F / this.field1998, 1.0F, 1.0F / this.field1998, arg1);
        this.field2017.method2925(class643.field9115, (byte) 126);
        this.field2017.method564(1, this.field2014, false);
        this.field2017.method565(false, this.field2005.field7882);
        this.field2017.method612(class756.field10497, 0, var8, true, var9 + 1 - var8, var4, var7);
        this.field2017.method2928(false);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBI)V")
    public final void method945(int arg0, int arg1, byte arg2, int arg3) {
        field2003++;
        if (arg2 == 108) {
            this.field2010[this.field2005.field4344 * arg1 + arg3] = class747.method4153(this.field2010[this.field2005.field4344 * arg1 + arg3], 0x1 << arg0);
            this.field2007++;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V")
    public final void method946(byte arg0, int arg1) {
        this.field2008.method2555(arg1 * 4 + 3);
        field2011++;
        this.field2008.method2542(-1);
        int var3 = 3 % ((29 - arg0) / 60);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBFI)V")
    public final void method947(int arg0, int arg1, byte arg2, float arg3, int arg4) {
        field1999++;
        if (arg2 <= 40) {
            this.field2017 = null;
        }
        if (this.field2009 != -1) {
            class468 var6 = this.field2017.field7694.method91(this.field2009, -22805);
            int var7 = var6.field6381 & 0xFF;
            if (var7 != 0 && var6.field6386 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg0 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg0 = ((var8 & 0xFF00FF) * var7 + ((arg0 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg0 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field6399 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg0 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg0 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg0 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg0 = ((var12 & 0x2F00FF00) << 8) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg3 != 1.0F) {
            int var15 = arg0 >> 16 & 0xFF;
            int var16 = (arg0 & 0xFFB8) >> 8;
            int var17 = arg0 & 0xFF;
            int var18 = (int) ((float) var15 * arg3);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var19 = (int) ((float) var16 * arg3);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg3);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg0 = var19 << 8 | var18 << 16 | var20;
        }
        this.field2008.method2555(arg4 * 4);
        if (this.field2017.field6886 == 0) {
            this.field2008.method2542((byte) arg0);
            this.field2008.method2542((byte) (arg0 >> 8));
            this.field2008.method2542((byte) (arg0 >> 16));
        } else {
            this.field2008.method2542((byte) (arg0 >> 16));
            this.field2008.method2542((byte) (arg0 >> 8));
            this.field2008.method2542((byte) arg0);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
    public final void method948(int arg0, byte arg1) {
        field2006++;
        this.field2002 = this.field2017.method2924((byte) -60, arg0 * 4, true);
        this.field2008 = new Stream(this.field2002, 0, arg0 * 4);
        if (arg1 != 11) {
            this.field2009 = -17;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lsba;IIIII)V")
    public class145(class556 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2005 = arg0;
        this.field2000 = arg4;
        this.field2010 = new int[this.field2005.field4348 * this.field2005.field4344];
        this.field2009 = arg1;
        this.field2012 = arg5;
        this.field2017 = this.field2005.field7842;
        this.field2018 = arg3;
        this.field1998 = arg2;
    }
}

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class417 extends class187 {

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field5993 = 0;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field5996 = 0;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field6000 = 2;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field5999;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field6001;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ltq;ZI)V")
    private final void method2585(class250 arg0, boolean arg1, int arg2) {
        field5992++;
        if (arg2 == 2) {
            this.field5993 = arg0.method1374(-2);
        }
        if (!arg1) {
            this.field5993 = -57;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILvm;)V")
    public static final void method2586(int arg0, class322 arg1) {
        field5999++;
        int var2 = -92 % ((-arg0 - 57) / 62);
        if (class359.field5068.method819(false) == 0) {
            return;
        }
        if (class101.field1182 == 0 || class101.field1182 == 2) {
            for (class30 var5 = (class30) class359.field5068.method814((byte) 90); var5 != null; var5 = (class30) class359.field5068.method827(118)) {
                class173.method907(var5.field294, arg1, class115.field1436, var5.field288, var5.field299, var5.field289 ? class427.field6264.field2017 : null, var5.field297, 122, false, arg1, false, var5.field290);
                var5.method1967(-1);
            }
            class84.method458((byte) -120);
            return;
        }
        if (class36.field368 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class36.field368 = class88.method486(class293.field3985, class159.field2055, (byte) 33, 0, var3, 0);
            class221.field2967 = class36.field368.method1601(class243.method1305(class199.field2662, 0, class229.field3155, true), class241.method1291(class72.field797, class229.field3155, 0), true);
        }
        for (class30 var4 = (class30) class359.field5068.method814((byte) 90); var4 != null; var4 = (class30) class359.field5068.method827(-126)) {
            class173.method907(var4.field294, class36.field368, class221.field2967, var4.field288, var4.field299, var4.field289 ? class427.field6264.field2017 : null, var4.field297, 91, false, arg1, false, var4.field290);
            var4.method1967(-1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILam;I)Ljp;")
    public static final class402 method2587(int arg0, class286 arg1, int arg2) {
        field5998++;
        byte[] var3 = arg1.method1699(arg2, 91);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -16 % ((arg0 - 12) / 59);
            return new class402(var3);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ltq;B)V")
    public final void method2588(class250 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                if (arg1 > -123) {
                    this.field5993 = 38;
                }
                field5995++;
                return;
            }
            this.method2585(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBII)V")
    public static final void method2589(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5994++;
        int var5 = 61 % ((69 - arg2) / 51);
        int var6 = 0;
        int var7 = arg0;
        int var8 = -arg0;
        int var9 = -1;
        int var10 = class104.method556(class322.field4306, 2048, arg4 + arg0, class310.field4183);
        int var11 = class104.method556(class322.field4306, 2048, arg4 - arg0, class310.field4183);
        class296.method1740(var11, class153.field1932[arg3], (byte) 81, arg1, var10);
        while (var7 > var6) {
            var9 += 2;
            var8 += var9;
            if (var8 > 0) {
                var7--;
                var8 -= var7 << 1;
                int var12 = arg3 - var7;
                int var13 = arg3 + var7;
                if (var13 >= class335.field4462 && class6.field42 >= var12) {
                    int var14 = class104.method556(class322.field4306, 2048, arg4 + var6, class310.field4183);
                    int var15 = class104.method556(class322.field4306, 2048, arg4 - var6, class310.field4183);
                    if (var13 <= class6.field42) {
                        class296.method1740(var15, class153.field1932[var13], (byte) 81, arg1, var14);
                    }
                    if (class335.field4462 <= var12) {
                        class296.method1740(var15, class153.field1932[var12], (byte) 81, arg1, var14);
                    }
                }
            }
            var6++;
            int var16 = arg3 - var6;
            int var17 = arg3 + var6;
            if (var17 >= class335.field4462 && var16 <= class6.field42) {
                int var18 = class104.method556(class322.field4306, 2048, arg4 + var7, class310.field4183);
                int var19 = class104.method556(class322.field4306, 2048, arg4 - var7, class310.field4183);
                if (var17 <= class6.field42) {
                    class296.method1740(var19, class153.field1932[var17], (byte) 81, arg1, var18);
                }
                if (var16 >= class335.field4462) {
                    class296.method1740(var19, class153.field1932[var16], (byte) 81, arg1, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lvm;IBIIIIII)V")
    public static final void method2590(class322 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5997++;
        int var9 = -16 % ((1 - arg2) / 41);
        class285 var10 = (class285) class173.method906(arg1, arg5, arg7);
        if (var10 != null) {
            class225 var11 = class281.method1655((byte) -28, var10.method356(10397));
            int var12 = var10.method351((byte) 103) & 0x3;
            int var13 = var10.method339(96);
            if (var11.field2986 == -1) {
                int var14 = arg6;
                if (var11.field3027 > 0) {
                    var14 = arg8;
                }
                if (var13 == 0 || var13 == 2) {
                    if (var12 == 0) {
                        arg0.method1861(arg4, var14, true, 4, arg3);
                    } else if (var12 == 1) {
                        arg0.method1857(arg4, var14, -110, 4, arg3);
                    } else if (var12 == 2) {
                        arg0.method1861(arg4, var14, true, 4, arg3 + 3);
                    } else if (var12 == 3) {
                        arg0.method1857(arg4 + 3, var14, 82, 4, arg3);
                    }
                }
                if (var13 == 3) {
                    if (var12 == 0) {
                        arg0.method1860(arg4, -3272, 1, arg3, 1, var14);
                    } else if (var12 == 1) {
                        arg0.method1860(arg4, -3272, 1, arg3 + 3, 1, var14);
                    } else if (var12 == 2) {
                        arg0.method1860(arg4 + 3, -3272, 1, arg3 + 3, 1, var14);
                    } else if (var12 == 3) {
                        arg0.method1860(arg4 + 3, -3272, 1, arg3, 1, var14);
                    }
                }
                if (var13 == 2) {
                    if (var12 == 0) {
                        arg0.method1857(arg4, var14, 75, 4, arg3);
                    } else if (var12 == 1) {
                        arg0.method1861(arg4, var14, true, 4, arg3 + 3);
                    } else if (var12 == 2) {
                        arg0.method1857(arg4 + 3, var14, 127, 4, arg3);
                    } else if (var12 == 3) {
                        arg0.method1861(arg4, var14, true, 4, arg3);
                    }
                }
            } else {
                class360.method2202(arg0, arg3, var12, arg4, 1, var11);
            }
        }
        class285 var15 = (class285) class165.method878(arg1, arg5, arg7, field6001 == null ? (field6001 = method2591("io")) : field6001);
        if (var15 != null) {
            class225 var16 = class281.method1655((byte) -28, var15.method356(10397));
            int var17 = var15.method351((byte) 103) & 0x3;
            int var18 = var15.method339(55);
            if (var16.field2986 != -1) {
                class360.method2202(arg0, arg3, var17, arg4, 1, var16);
            } else if (var18 == 9) {
                int var19 = -1118482;
                if (var16.field3027 > 0) {
                    var19 = -1179648;
                }
                if (var17 == 0 || var17 == 2) {
                    arg0.method1859(arg4 + 3, 23059, arg3, var19, arg3 + 3, arg4);
                } else {
                    arg0.method1859(arg4, 23059, arg3, var19, arg3 + 3, arg4 + 3);
                }
            }
        }
        class285 var20 = (class285) class275.method1514(arg1, arg5, arg7);
        if (var20 == null) {
            return;
        }
        class225 var21 = class281.method1655((byte) -28, var20.method356(10397));
        int var22 = var20.method351((byte) 103) & 0x3;
        if (var21.field2986 != -1) {
            class360.method2202(arg0, arg3, var22, arg4, 1, var21);
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2591(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

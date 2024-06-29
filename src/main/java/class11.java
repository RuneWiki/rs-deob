import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class11 {

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public int field159 = -1;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field160 = new String[] { method80(method79("[yWA3")), method80(method79("C|\u0015h")), method80(method79("V'W*f")), method80(method79("[yWG3")), method80(method79("[yWF3")), method80(method79("[yW@3")), method80(method79("\u0017)")), method80(method79("[yWE3")) };

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field146 = 1;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    public static int field155 = 0;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "Liha;")
    public static class449 field153;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Ldfa;")
    private class477 field141;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "Ljava/lang/String;")
    private String field145;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Ljava/lang/String;")
    private String field148;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "[I")
    private int[] field135;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "[I")
    private int[] field136;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "[I")
    private int[] field139;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "[I")
    private int[] field142;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "[I")
    private int[] field144;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "[I")
    private int[] field147;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "[I")
    private int[] field149;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "[I")
    private int[] field158;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field154;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field156;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "[[I")
    private int[][] field137;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "[[I")
    private int[][] field140;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "[[I")
    private int[][] field152;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method74(String arg0, byte arg1) {
        try {
            if (class789.field11405 == null) {
                class744.method5387(1);
            }
            field151++;
            class584.field8427.setTime(new Date(class614.method4531(-51)));
            int var2 = 27 / ((-arg1 - 79) / 47);
            int var3 = class584.field8427.get(11);
            int var4 = class584.field8427.get(12);
            int var5 = class584.field8427.get(13);
            String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
            String[] var7 = class793.method5716('\n', arg0, -116);
            for (int var8 = 0; var8 < var7.length; var8++) {
                for (int var9 = class648.field9211; var9 > 0; var9--) {
                    class789.field11405[var9] = class789.field11405[var9 - 1];
                }
                class789.field11405[0] = var6 + field160[6] + var7[var8];
                if (class513.field7523 != null) {
                    try {
                        class513.field7523.write(class141.method1223(5779, class789.field11405[0] + "\n"));
                    } catch (IOException var11) {
                    }
                }
                if (class648.field9211 < class789.field11405.length - 1) {
                    class648.field9211++;
                    if (class462.field6742 > 0) {
                        class462.field6742++;
                    }
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field160[5] + (arg0 == null ? field160[1] : field160[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public final void method75(int arg0) {
        try {
            if (arg0 <= 118) {
                method74(null, (byte) 41);
            }
            field138++;
            if (this.field148 == null) {
                this.field148 = this.field145;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field160[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjc;I)V")
    private final void method76(int arg0, class711 arg1, int arg2) {
        try {
            field143++;
            if (arg0 == 1) {
                this.field145 = arg1.method5096((byte) 33);
            } else if (arg0 == 2) {
                this.field148 = arg1.method5096((byte) 94);
            } else if (arg0 == 3) {
                int var22 = arg1.method5128(0);
                this.field140 = new int[var22][3];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field140[var23][0] = arg1.method5116((byte) -113);
                    this.field140[var23][1] = arg1.method5113(18443);
                    this.field140[var23][2] = arg1.method5113(18443);
                }
            } else if (arg0 == 4) {
                int var20 = arg1.method5128(0);
                this.field152 = new int[var20][3];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field152[var21][0] = arg1.method5116((byte) -106);
                    this.field152[var21][1] = arg1.method5113(18443);
                    this.field152[var21][2] = arg1.method5113(18443);
                }
            } else if (arg0 == 5) {
                arg1.method5116((byte) -121);
            } else if (arg0 == 6) {
                arg1.method5128(0);
            } else if (arg0 == 7) {
                arg1.method5128(0);
            } else if (arg0 != 8) {
                if (arg0 == 9) {
                    arg1.method5128(0);
                } else if (arg0 == 10) {
                    int var18 = arg1.method5128(0);
                    this.field158 = new int[var18];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field158[var19] = arg1.method5113(18443);
                    }
                } else if (arg0 == 12) {
                    arg1.method5113(18443);
                } else if (arg0 == 13) {
                    int var16 = arg1.method5128(0);
                    this.field142 = new int[var16];
                    for (int var17 = 0; var17 < var16; var17++) {
                        this.field142[var17] = arg1.method5116((byte) -109);
                    }
                } else if (arg0 == 14) {
                    int var4 = arg1.method5128(0);
                    this.field137 = new int[var4][2];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field137[var5][0] = arg1.method5128(0);
                        this.field137[var5][1] = arg1.method5128(0);
                    }
                } else if (arg0 == 15) {
                    arg1.method5116((byte) -118);
                } else if (arg0 == 17) {
                    this.field159 = arg1.method5116((byte) -118);
                } else if (arg0 == 18) {
                    int var14 = arg1.method5128(0);
                    this.field154 = new String[var14];
                    this.field147 = new int[var14];
                    this.field136 = new int[var14];
                    this.field144 = new int[var14];
                    for (int var15 = 0; var15 < var14; var15++) {
                        this.field147[var15] = arg1.method5113(18443);
                        this.field144[var15] = arg1.method5113(18443);
                        this.field136[var15] = arg1.method5113(18443);
                        this.field154[var15] = arg1.method5144(-16414);
                    }
                } else if (arg0 == 19) {
                    int var12 = arg1.method5128(0);
                    this.field156 = new String[var12];
                    this.field139 = new int[var12];
                    this.field149 = new int[var12];
                    this.field135 = new int[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field149[var13] = arg1.method5113(18443);
                        this.field135[var13] = arg1.method5113(18443);
                        this.field139[var13] = arg1.method5113(18443);
                        this.field156[var13] = arg1.method5144(-16414);
                    }
                } else if (arg0 == 249) {
                    int var6 = arg1.method5128(0);
                    if (this.field141 == null) {
                        int var7 = class788.method5671(1282334120, var6);
                        this.field141 = new class477(var7);
                    }
                    for (int var8 = 0; var8 < var6; var8++) {
                        boolean var9 = arg1.method5128(0) == 1;
                        int var10 = arg1.method5085(true);
                        class578 var11;
                        if (var9) {
                            var11 = new class482(arg1.method5144(-16414));
                        } else {
                            var11 = new class529(arg1.method5113(18443));
                        }
                        this.field141.method3691(var11, (long) var10, -1);
                    }
                }
            }
            int var24 = -4 / ((-arg2 - 12) / 37);
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field160[0] + arg0 + ',' + (arg1 == null ? field160[1] : field160[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
    public static void method77(int arg0) {
        try {
            field153 = null;
            if (arg0 != -250) {
                field155 = 126;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field160[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjc;)V")
    public final void method78(int arg0, class711 arg1) {
        try {
            field157++;
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    if (arg0 > -2) {
                        this.field159 = -77;
                        return;
                    } else {
                        return;
                    }
                }
                this.method76(var3, arg1, -122);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field160[4] + arg0 + ',' + (arg1 == null ? field160[1] : field160[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method79(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method80(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

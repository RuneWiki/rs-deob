import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class556 {

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "[F")
    private float[] field8088 = new float[16];

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "Lfca;")
    private class318 field8089 = new class318(786336);

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    private int field8100 = class626.method4593(3, 1600);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "[[Lts;")
    private class123[][] field8103 = new class123[64][768];

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "[[Lts;")
    private class123[][] field8102 = new class123[1600][64];

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "[I")
    private int[] field8105 = new int[8191];

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    private int field8106 = 0;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "[I")
    private int[] field8104 = new int[64];

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "[I")
    private int[] field8107 = new int[1600];

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8108 = new String[] { method4168(method4167("\\a\u001f\\|")), method4168(method4167("R>\u001f5)")), method4168(method4167("I:]\u001e")), method4168(method4167("O._\u0016mB")), method4168(method4167("A&_\u0013mN5T")), method4168(method4167("M.G\u0013/K._\u0015/d#P\u0001rk P\u0016dU")), method4168(method4167("T*E3bD*B\u0001hE#T")), method4168(method4167("R>\u001f0)")), method4168(method4167("I.E\u001bwB\u0003X\u0010sF=X\u0017r")), method4168(method4167("M.G\u0013/K._\u0015/U*W\u001edD;\u001f3bD*B\u0001hE#T=cM*R\u0006")), method4168(method4167("I.\\\u0017")), method4168(method4167("R>\u001f3)")), method4168(method4167("R>\u001f6)")), method4168(method4167("R>\u001f7)")), method4168(method4167("R>\u001f4)")), method4168(method4167("R>\u001f1)")) };

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Z")
    public static boolean field8095 = false;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Lso;")
    private class316 field8097;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "Lso;")
    private class316 field8099;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "Lso;")
    private class316 field8101;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Laj;")
    private class94 field8098;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lml;I)V", line = 4)
    public final void method4160(class194 arg0, int arg1) {
        try {
            field8091++;
            this.field8098 = arg0.method1649(24, 196584, (byte) 67, true, null);
            this.field8099 = new class316(this.field8098, 5126, 2, arg1);
            this.field8097 = new class316(this.field8098, 5126, 3, 8);
            this.field8101 = new class316(this.field8098, 5121, 4, 20);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8108[15] + (arg0 == null ? field8108[2] : field8108[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lkia;IILml;)V", line = 17)
    public final void method4161(class788 arg0, int arg1, int arg2, class194 arg3) {
        try {
            field8090++;
            if (arg3.field2786 != null) {
                if (arg2 >= 0) {
                    this.method4165((byte) 122, arg3, arg2);
                } else {
                    this.method4166(16385, arg3);
                }
                float var5 = arg3.field2786.field1000;
                float var6 = arg3.field2786.field1032;
                float var7 = arg3.field2786.field1001;
                float var8 = arg3.field2786.field995;
                try {
                    int var9 = 0;
                    int var10 = Integer.MAX_VALUE;
                    int var11 = 0;
                    class592 var12 = arg0.field11376.field5728;
                    for (class592 var13 = var12.field8523; var13 != var12; var13 = var13.field8523) {
                        class123 var14 = (class123) var13;
                        int var15 = (int) ((float) (var14.field1557 >> 12) * var7 + (float) (var14.field1551 >> 12) * var6 + (float) (var14.field1550 >> 12) * var5 + var8);
                        this.field8105[var9++] = var15;
                        if (var11 < var15) {
                            var11 = var15;
                        }
                        if (var15 < var10) {
                            var10 = var15;
                        }
                    }
                    int var16 = -10 / ((arg1 - 11) / 37);
                    int var17 = var11 - var10;
                    int var18;
                    if ((var17 + 2) <= 1600) {
                        var17 += 2;
                        var18 = 0;
                    } else {
                        var18 = class626.method4593(3, var17) + 1 - this.field8100;
                        var17 = (var17 >> var18) + 2;
                    }
                    class592 var19 = var12.field8523;
                    int var20 = 0;
                    int var21 = -2;
                    boolean var22 = true;
                    boolean var23 = true;
                    while (var12 != var19) {
                        this.field8106 = 0;
                        for (int var24 = 0; var24 < var17; var24++) {
                            this.field8107[var24] = 0;
                        }
                        for (int var25 = 0; var25 < 64; var25++) {
                            this.field8104[var25] = 0;
                        }
                        while (var12 != var19) {
                            class123 var26 = (class123) var19;
                            if (var23) {
                                var23 = false;
                                var22 = var26.field1552;
                                var21 = var26.field1549;
                            }
                            if (var20 > 0 && (var26.field1549 != var21 || var26.field1552 != var22)) {
                                var23 = true;
                                break;
                            }
                            int var27 = this.field8105[var20++] - var10 >> var18;
                            if (var27 < 1600) {
                                if (this.field8107[var27] < 64) {
                                    this.field8102[var27][this.field8107[var27]++] = var26;
                                } else {
                                    label127: {
                                        if (this.field8107[var27] == 64) {
                                            if (this.field8106 == 64) {
                                                break label127;
                                            }
                                            this.field8107[var27] += this.field8106++ + 1;
                                        }
                                        this.field8103[this.field8107[var27] - 65][this.field8104[this.field8107[var27] - 64 - 1]++] = var26;
                                    }
                                }
                            }
                            var19 = var19.field8523;
                        }
                        if (var21 >= 0) {
                            arg3.method1625(83, var21);
                        } else {
                            arg3.method1625(52, -1);
                        }
                        if (var22 && class381.field5552 != arg3.field2893) {
                            arg3.method127(class381.field5552);
                        } else if (arg3.field2893 != 1.0F) {
                            arg3.method127(1.0F);
                        }
                        this.method4163(arg3, var17, 20);
                    }
                } catch (Exception var29) {
                }
                this.method4164(arg3, -84);
            }
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field8108[11] + (arg0 == null ? field8108[2] : field8108[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8108[2] : field8108[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Z", line = 181)
    public static final boolean method4162(int arg0) {
        try {
            field8096++;
            Hashtable var1 = new Hashtable();
            Enumeration var2 = class336.field4865.keys();
            while (var2.hasMoreElements()) {
                Object var3 = var2.nextElement();
                var1.put(var3, class336.field4865.get(var3));
            }
            try {
                Class var4 = Class.forName(field8108[9]);
                Class var5 = Class.forName(field8108[5]);
                Field var6 = var5.getDeclaredField(field8108[8]);
                Method var7 = var4.getDeclaredMethod(field8108[6], Boolean.TYPE);
                var7.invoke(var6, Boolean.TRUE);
                if (arg0 != 1558512524) {
                    field8095 = true;
                }
                try {
                    Enumeration var8 = class336.field4865.keys();
                    while (var8.hasMoreElements()) {
                        String var9 = (String) var8.nextElement();
                        try {
                            File var10 = (File) class231.field3344.get(var9);
                            Class var11 = (Class) class336.field4865.get(var9);
                            Vector var12 = (Vector) var6.get(var11.getClassLoader());
                            for (int var13 = 0; var12.size() > var13; var13++) {
                                try {
                                    Object var14 = var12.elementAt(var13);
                                    Field var15 = var14.getClass().getDeclaredField(field8108[10]);
                                    var7.invoke(var15, Boolean.TRUE);
                                    try {
                                        String var16 = (String) var15.get(var14);
                                        if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                            Field var17 = var14.getClass().getDeclaredField(field8108[3]);
                                            Method var18 = var14.getClass().getDeclaredMethod(field8108[4]);
                                            var7.invoke(var17, Boolean.TRUE);
                                            var7.invoke(var18, Boolean.TRUE);
                                            try {
                                                var18.invoke(var14);
                                                var17.set(var14, Integer.valueOf(0));
                                                var1.remove(var9);
                                            } catch (Throwable var20) {
                                            }
                                            var7.invoke(var18, Boolean.FALSE);
                                            var7.invoke(var17, Boolean.FALSE);
                                        }
                                    } catch (Throwable var21) {
                                    }
                                    var7.invoke(var15, Boolean.FALSE);
                                } catch (Throwable var22) {
                                }
                            }
                        } catch (Throwable var23) {
                        }
                    }
                } catch (Throwable var24) {
                }
                var7.invoke(var6, Boolean.FALSE);
            } catch (Throwable var25) {
            }
            class336.field4865 = var1;
            return class336.field4865.isEmpty();
        } catch (RuntimeException var26) {
            throw class665.method4799(var26, field8108[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lml;II)V", line = 278)
    private final void method4163(class194 arg0, int arg1, int arg2) {
        try {
            if (arg2 == 20) {
                OpenGL.glGetFloatv(2982, this.field8088, 0);
                field8092++;
                float var4 = this.field8088[0];
                float var5 = this.field8088[4];
                float var6 = this.field8088[8];
                float var7 = this.field8088[1];
                float var8 = this.field8088[5];
                float var9 = this.field8088[9];
                float var10 = var4 + var7;
                float var11 = var5 + var8;
                float var12 = var6 + var9;
                float var13 = var4 - var7;
                float var14 = var5 - var8;
                float var15 = var6 - var9;
                float var16 = var7 - var4;
                float var17 = var8 - var5;
                float var18 = var9 - var6;
                this.field8089.field9945 = 0;
                if (arg0.field2842) {
                    for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                        int var45 = this.field8107[var44] > 64 ? 64 : this.field8107[var44];
                        if (var45 > 0) {
                            for (int var46 = var45 - 1; var46 >= 0; var46--) {
                                class123 var47 = this.field8102[var44][var46];
                                int var48 = var47.field1547;
                                byte var49 = (byte) (var48 >> 16);
                                byte var50 = (byte) (var48 >> 8);
                                byte var51 = (byte) var48;
                                byte var52 = (byte) (var48 >>> 24);
                                float var53 = (float) (var47.field1550 >> 12);
                                float var54 = (float) (var47.field1551 >> 12);
                                float var55 = (float) (var47.field1557 >> 12);
                                int var56 = var47.field1558 >> 12;
                                this.field8089.method2524(0.0F, true);
                                this.field8089.method2524(0.0F, true);
                                this.field8089.method2524((float) (-var56) * var10 + var53, true);
                                this.field8089.method2524((float) (-var56) * var11 + var54, true);
                                this.field8089.method2524((float) (-var56) * var12 + var55, true);
                                this.field8089.method5114(255, var49);
                                this.field8089.method5114(255, var50);
                                this.field8089.method5114(arg2 ^ 0xEB, var51);
                                this.field8089.method5114(255, var52);
                                this.field8089.method2524(1.0F, true);
                                this.field8089.method2524(0.0F, true);
                                this.field8089.method2524((float) var56 * var13 + var53, true);
                                this.field8089.method2524((float) var56 * var14 + var54, true);
                                this.field8089.method2524((float) var56 * var15 + var55, true);
                                this.field8089.method5114(255, var49);
                                this.field8089.method5114(255, var50);
                                this.field8089.method5114(arg2 + 235, var51);
                                this.field8089.method5114(arg2 ^ 0xEB, var52);
                                this.field8089.method2524(1.0F, true);
                                this.field8089.method2524(1.0F, true);
                                this.field8089.method2524((float) var56 * var10 + var53, true);
                                this.field8089.method2524((float) var56 * var11 + var54, true);
                                this.field8089.method2524((float) var56 * var12 + var55, true);
                                this.field8089.method5114(255, var49);
                                this.field8089.method5114(255, var50);
                                this.field8089.method5114(255, var51);
                                this.field8089.method5114(255, var52);
                                this.field8089.method2524(0.0F, true);
                                this.field8089.method2524(1.0F, true);
                                this.field8089.method2524((float) var56 * var16 + var53, true);
                                this.field8089.method2524((float) var56 * var17 + var54, true);
                                this.field8089.method2524((float) var56 * var18 + var55, true);
                                this.field8089.method5114(255, var49);
                                this.field8089.method5114(255, var50);
                                this.field8089.method5114(arg2 ^ 0xEB, var51);
                                this.field8089.method5114(255, var52);
                            }
                            if (this.field8107[var44] > 64) {
                                int var57 = this.field8107[var44] - 1 - 64;
                                for (int var58 = this.field8104[var57] - 1; var58 >= 0; var58--) {
                                    class123 var59 = this.field8103[var57][var58];
                                    int var60 = var59.field1547;
                                    byte var61 = (byte) (var60 >> 16);
                                    byte var62 = (byte) (var60 >> 8);
                                    byte var63 = (byte) var60;
                                    byte var64 = (byte) (var60 >>> 24);
                                    float var65 = (float) (var59.field1550 >> 12);
                                    float var66 = (float) (var59.field1551 >> 12);
                                    float var67 = (float) (var59.field1557 >> 12);
                                    int var68 = var59.field1558 >> 12;
                                    this.field8089.method2524(0.0F, true);
                                    this.field8089.method2524(0.0F, true);
                                    this.field8089.method2524((float) (-var68) * var10 + var65, true);
                                    this.field8089.method2524((float) (-var68) * var11 + var66, true);
                                    this.field8089.method2524((float) (-var68) * var12 + var67, true);
                                    this.field8089.method5114(255, var61);
                                    this.field8089.method5114(255, var62);
                                    this.field8089.method5114(255, var63);
                                    this.field8089.method5114(255, var64);
                                    this.field8089.method2524(1.0F, true);
                                    this.field8089.method2524(0.0F, true);
                                    this.field8089.method2524((float) var68 * var13 + var65, true);
                                    this.field8089.method2524((float) var68 * var14 + var66, true);
                                    this.field8089.method2524((float) var68 * var15 + var67, true);
                                    this.field8089.method5114(255, var61);
                                    this.field8089.method5114(255, var62);
                                    this.field8089.method5114(255, var63);
                                    this.field8089.method5114(255, var64);
                                    this.field8089.method2524(1.0F, true);
                                    this.field8089.method2524(1.0F, true);
                                    this.field8089.method2524((float) var68 * var10 + var65, true);
                                    this.field8089.method2524((float) var68 * var11 + var66, true);
                                    this.field8089.method2524((float) var68 * var12 + var67, true);
                                    this.field8089.method5114(255, var61);
                                    this.field8089.method5114(arg2 + 235, var62);
                                    this.field8089.method5114(255, var63);
                                    this.field8089.method5114(arg2 ^ 0xEB, var64);
                                    this.field8089.method2524(0.0F, true);
                                    this.field8089.method2524(1.0F, true);
                                    this.field8089.method2524((float) var68 * var16 + var65, true);
                                    this.field8089.method2524((float) var68 * var17 + var66, true);
                                    this.field8089.method2524((float) var68 * var18 + var67, true);
                                    this.field8089.method5114(255, var61);
                                    this.field8089.method5114(255, var62);
                                    this.field8089.method5114(arg2 + 235, var63);
                                    this.field8089.method5114(255, var64);
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                        int var20 = this.field8107[var19] <= 64 ? this.field8107[var19] : 64;
                        if (var20 > 0) {
                            for (int var21 = var20 - 1; var21 >= 0; var21--) {
                                class123 var22 = this.field8102[var19][var21];
                                int var23 = var22.field1547;
                                byte var24 = (byte) (var23 >> 16);
                                byte var25 = (byte) (var23 >> 8);
                                byte var26 = (byte) var23;
                                byte var27 = (byte) (var23 >>> 24);
                                float var28 = (float) (var22.field1550 >> 12);
                                float var29 = (float) (var22.field1551 >> 12);
                                float var30 = (float) (var22.field1557 >> 12);
                                int var31 = var22.field1558 >> 12;
                                this.field8089.method2527(arg2 ^ 0x994C2CC, 0.0F);
                                this.field8089.method2527(arg2 ^ 0x994C2CC, 0.0F);
                                this.field8089.method2527(arg2 ^ 0x994C2CC, (float) (-var31) * var10 + var28);
                                this.field8089.method2527(arg2 ^ 0x994C2CC, (float) (-var31) * var11 + var29);
                                this.field8089.method2527(160744152, (float) (-var31) * var12 + var30);
                                this.field8089.method5114(arg2 ^ 0xEB, var24);
                                this.field8089.method5114(255, var25);
                                this.field8089.method5114(arg2 + 235, var26);
                                this.field8089.method5114(255, var27);
                                this.field8089.method2527(arg2 ^ 0x994C2CC, 1.0F);
                                this.field8089.method2527(160744152, 0.0F);
                                this.field8089.method2527(160744152, (float) var31 * var13 + var28);
                                this.field8089.method2527(160744152, (float) var31 * var14 + var29);
                                this.field8089.method2527(160744152, (float) var31 * var15 + var30);
                                this.field8089.method5114(arg2 + 235, var24);
                                this.field8089.method5114(arg2 ^ 0xEB, var25);
                                this.field8089.method5114(255, var26);
                                this.field8089.method5114(255, var27);
                                this.field8089.method2527(160744152, 1.0F);
                                this.field8089.method2527(160744152, 1.0F);
                                this.field8089.method2527(160744152, (float) var31 * var10 + var28);
                                this.field8089.method2527(arg2 + 160744132, (float) var31 * var11 + var29);
                                this.field8089.method2527(arg2 + 160744132, (float) var31 * var12 + var30);
                                this.field8089.method5114(255, var24);
                                this.field8089.method5114(255, var25);
                                this.field8089.method5114(255, var26);
                                this.field8089.method5114(arg2 + 235, var27);
                                this.field8089.method2527(160744152, 0.0F);
                                this.field8089.method2527(160744152, 1.0F);
                                this.field8089.method2527(160744152, (float) var31 * var16 + var28);
                                this.field8089.method2527(160744152, (float) var31 * var17 + var29);
                                this.field8089.method2527(160744152, (float) var31 * var18 + var30);
                                this.field8089.method5114(arg2 + 235, var24);
                                this.field8089.method5114(255, var25);
                                this.field8089.method5114(255, var26);
                                this.field8089.method5114(255, var27);
                            }
                            if (this.field8107[var19] > 64) {
                                int var32 = this.field8107[var19] - 64 - 1;
                                for (int var33 = this.field8104[var32] - 1; var33 >= 0; var33--) {
                                    class123 var34 = this.field8103[var32][var33];
                                    int var35 = var34.field1547;
                                    byte var36 = (byte) (var35 >> 16);
                                    byte var37 = (byte) (var35 >> 8);
                                    byte var38 = (byte) var35;
                                    byte var39 = (byte) (var35 >>> 24);
                                    float var40 = (float) (var34.field1550 >> 12);
                                    float var41 = (float) (var34.field1551 >> 12);
                                    float var42 = (float) (var34.field1557 >> 12);
                                    int var43 = var34.field1558 >> 12;
                                    this.field8089.method2527(160744152, 0.0F);
                                    this.field8089.method2527(arg2 + 160744132, 0.0F);
                                    this.field8089.method2527(160744152, (float) (-var43) * var10 + var40);
                                    this.field8089.method2527(arg2 ^ 0x994C2CC, (float) (-var43) * var11 + var41);
                                    this.field8089.method2527(160744152, (float) (-var43) * var12 + var42);
                                    this.field8089.method5114(arg2 ^ 0xEB, var36);
                                    this.field8089.method5114(255, var37);
                                    this.field8089.method5114(arg2 ^ 0xEB, var38);
                                    this.field8089.method5114(arg2 + 235, var39);
                                    this.field8089.method2527(arg2 ^ 0x994C2CC, 1.0F);
                                    this.field8089.method2527(arg2 ^ 0x994C2CC, 0.0F);
                                    this.field8089.method2527(160744152, (float) var43 * var13 + var40);
                                    this.field8089.method2527(160744152, (float) var43 * var14 + var41);
                                    this.field8089.method2527(160744152, (float) var43 * var15 + var42);
                                    this.field8089.method5114(arg2 + 235, var36);
                                    this.field8089.method5114(255, var37);
                                    this.field8089.method5114(255, var38);
                                    this.field8089.method5114(255, var39);
                                    this.field8089.method2527(160744152, 1.0F);
                                    this.field8089.method2527(160744152, 1.0F);
                                    this.field8089.method2527(160744152, (float) var43 * var10 + var40);
                                    this.field8089.method2527(160744152, (float) var43 * var11 + var41);
                                    this.field8089.method2527(160744152, (float) var43 * var12 + var42);
                                    this.field8089.method5114(255, var36);
                                    this.field8089.method5114(arg2 ^ 0xEB, var37);
                                    this.field8089.method5114(255, var38);
                                    this.field8089.method5114(255, var39);
                                    this.field8089.method2527(160744152, 0.0F);
                                    this.field8089.method2527(160744152, 1.0F);
                                    this.field8089.method2527(arg2 ^ 0x994C2CC, (float) var43 * var16 + var40);
                                    this.field8089.method2527(arg2 ^ 0x994C2CC, (float) var43 * var17 + var41);
                                    this.field8089.method2527(160744152, (float) var43 * var18 + var42);
                                    this.field8089.method5114(255, var36);
                                    this.field8089.method5114(255, var37);
                                    this.field8089.method5114(255, var38);
                                    this.field8089.method5114(255, var39);
                                }
                            }
                        }
                    }
                }
                if (this.field8089.field9945 != 0) {
                    this.field8098.method943(this.field8089.field9945, 24, this.field8089.field9996, (byte) 118);
                    arg0.method1653(-3461, this.field8101, this.field8099, null, this.field8097);
                    arg0.method1623((byte) 7, 7, this.field8089.field9945 / 24, 0);
                }
            }
        } catch (RuntimeException var70) {
            throw class665.method4799(var70, field8108[12] + (arg0 == null ? field8108[2] : field8108[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lml;I)V", line = 632)
    private final void method4164(class194 arg0, int arg1) {
        try {
            field8093++;
            arg0.method1632(true, true);
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            if (arg1 > -74) {
                this.field8088 = null;
            }
            if (class381.field5552 != arg0.field2893) {
                arg0.method127(class381.field5552);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8108[1] + (arg0 == null ? field8108[2] : field8108[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLml;I)V", line = 652)
    private final void method4165(byte arg0, class194 arg1, int arg2) {
        try {
            field8094++;
            class381.field5552 = arg1.field2893;
            arg1.method1652(-4, (float) arg2);
            arg1.method1686(41);
            OpenGL.glDisable(16384);
            if (arg0 > 16) {
                OpenGL.glDisable(16385);
                arg1.method1632(false, true);
                OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8108[13] + arg0 + ',' + (arg1 == null ? field8108[2] : field8108[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILml;)V", line = 669)
    private final void method4166(int arg0, class194 arg1) {
        try {
            field8087++;
            class381.field5552 = arg1.field2893;
            arg1.method1636(1);
            OpenGL.glDisable(16384);
            OpenGL.glDisable(arg0);
            arg1.method1632(false, true);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8108[14] + arg0 + ',' + (arg1 == null ? field8108[2] : field8108[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4167(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4168(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

import jagex3.jagmisc.jagmisc;
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

@OriginalClass("client!nn")
public class class361 extends class513 {

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    private int field4616;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "Z")
    private boolean field4613;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    private int field4629;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    private int field4623;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    private int field4617;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    private int field4626;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "Z")
    private boolean field4624;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    private int field4628;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    private int field4625;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    private int field4614;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    private int field4612;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "Ljava/lang/String;")
    private String field4611;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "Ljava/lang/String;")
    private String field4615;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "Ljava/lang/String;")
    private String field4621;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "Ljava/lang/String;")
    private String field4620;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    private int field4605;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    private int field4607;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    private int field4608;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    private int field4618;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    private int field4627;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    private int field4630;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lvj;B)V", line = 8)
    public final void method2033(class26 arg0, byte arg1) {
        field4619++;
        arg0.method184(5, -108);
        arg0.method184(this.field4616, -60);
        arg0.method184(this.field4613 ? 1 : 0, -73);
        arg0.method184(this.field4629, -106);
        arg0.method184(this.field4623, -67);
        arg0.method184(this.field4617, -95);
        arg0.method184(this.field4626, -36);
        arg0.method184(this.field4614, -36);
        arg0.method184(this.field4624 ? 1 : 0, -39);
        arg0.method147((byte) 53, this.field4628);
        arg0.method184(this.field4625, -72);
        arg0.method176(this.field4612, (byte) 127);
        int var3 = 100 % ((28 - arg1) / 53);
        arg0.method147((byte) 53, this.field4607);
        arg0.method184(this.field4627, -36);
        arg0.method184(this.field4608, -87);
        arg0.method184(this.field4618, -40);
        arg0.method185(this.field4621, -323608624);
        arg0.method185(this.field4611, -323608624);
        arg0.method185(this.field4615, -323608624);
        arg0.method185(this.field4620, -323608624);
        arg0.method184(this.field4605, -46);
        arg0.method147((byte) 53, this.field4630);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lwn;I)V", line = 46)
    public static final void method2034(class583 arg0, int arg1) {
        field4622++;
        class503 var2 = (class503) class136.field1828.method3118((byte) 73);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field7026; var4++) {
            if (var2.field7032[var4] != null) {
                if (var2.field7032[var4].field5975 == 2) {
                    var2.field7029[var4] = -5;
                }
                if (var2.field7032[var4].field5975 == 0) {
                    var3 = true;
                }
            }
            if (var2.field7024[var4] != null) {
                if (var2.field7024[var4].field5975 == 2) {
                    var2.field7029[var4] = -6;
                }
                if (var2.field7024[var4].field5975 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field330;
        arg0.method199(true, var2.field7027);
        for (int var6 = 0; var6 < var2.field7026; var6++) {
            if (var2.field7029[var6] == 0) {
                try {
                    int var7 = var2.field7031[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field7032[var6].field5973;
                        int var9 = var8.getInt(null);
                        arg0.method184(0, -79);
                        arg0.method199(true, var9);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field7032[var6].field5973;
                        var10.setInt(null, var2.field7023[var6]);
                        arg0.method184(0, -100);
                    } else if (var7 == 2) {
                        Field var11 = (Field) var2.field7032[var6].field5973;
                        int var12 = var11.getModifiers();
                        arg0.method184(0, -30);
                        arg0.method199(true, var12);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field7024[var6].field5973;
                        byte[][] var16 = var2.field7025[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg0.method184(0, -117);
                        } else if (var20 instanceof Number) {
                            arg0.method184(1, -51);
                            arg0.method156(arg1 + 1351, ((Number) var20).longValue());
                        } else if ((var20 instanceof String)) {
                            arg0.method184(2, arg1 + 1345);
                            arg0.method187((String) var20, (byte) -73);
                        } else {
                            arg0.method184(4, arg1 + 1360);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field7024[var6].field5973;
                        int var14 = var13.getModifiers();
                        arg0.method184(0, -98);
                        arg0.method199(true, var14);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method184(-10, -97);
                } catch (InvalidClassException var22) {
                    arg0.method184(-11, -35);
                } catch (StreamCorruptedException var23) {
                    arg0.method184(-12, -105);
                } catch (OptionalDataException var24) {
                    arg0.method184(-13, arg1 ^ 0x544);
                } catch (IllegalAccessException var25) {
                    arg0.method184(-14, arg1 + 1339);
                } catch (IllegalArgumentException var26) {
                    arg0.method184(-15, -39);
                } catch (InvocationTargetException var27) {
                    arg0.method184(-16, -76);
                } catch (SecurityException var28) {
                    arg0.method184(-17, -70);
                } catch (IOException var29) {
                    arg0.method184(-18, -91);
                } catch (NullPointerException var30) {
                    arg0.method184(-19, arg1 + 1343);
                } catch (Exception var31) {
                    arg0.method184(-20, arg1 ^ 0x51D);
                } catch (Throwable var32) {
                    arg0.method184(-21, -27);
                }
            } else {
                arg0.method184(var2.field7029[var6], -41);
            }
        }
        if (arg1 != -1406) {
            method2035(-24);
        }
        arg0.method177(var5, 17237);
        var2.method3065(-17363);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 232)
    public static final void method2035(int arg0) {
        if (class96.field1401 != null) {
            if (class264.field3595) {
                class71.method450((byte) -41);
            }
            class365.field4690.method1876(arg0 ^ 0xFFFFE164);
            class466.method2780();
            class446.method2659(-1);
            class713.method4017((byte) -104);
            class404.method2455((byte) 111);
            class747.method4155(-128);
            if (class67.field932 != null) {
                class67.field932.method3551(0);
            }
            class706.method3973(12201);
            class294.method1723(true);
            class331.method1924(-24265);
            class622.method3641(true);
            class4.method12(false, true);
            for (int var1 = 0; var1 < 2048; var1++) {
                class655 var5 = class40.field563[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field8418.length; var6++) {
                        var5.field8418[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class287.field3776; var2++) {
                class55 var3 = class312.field4003[var2].field204;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field8418.length; var4++) {
                        var3.field8418[var4] = null;
                    }
                }
            }
            class383.field5374 = null;
            class123.field1685 = null;
            class96.field1401.method3253(-6102);
            class96.field1401 = null;
        }
        if (arg0 != -7910) {
            method2034(null, 59);
        }
        field4609++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 316)
    private final void method2036(boolean arg0) {
        if (this.field4621.length() > 40) {
            this.field4621 = this.field4621.substring(0, 40);
        }
        field4606++;
        if (this.field4611.length() > 40) {
            this.field4611 = this.field4611.substring(0, 40);
        }
        if (arg0) {
            return;
        }
        if (this.field4615.length() > 10) {
            this.field4615 = this.field4615.substring(0, 10);
        }
        if (this.field4620.length() > 10) {
            this.field4620 = this.field4620.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)I", line = 344)
    public final int method2037(int arg0) {
        field4610++;
        byte var2 = 23;
        int var3 = var2 + class259.method1614(this.field4621, (byte) 83);
        int var4 = var3 + class259.method1614(this.field4611, (byte) 38);
        if (arg0 > -9) {
            method2035(-90);
        }
        int var5 = var4 + class259.method1614(this.field4615, (byte) 62);
        return var5 + class259.method1614(this.field4620, (byte) 108);
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 367)
    public class361() {
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(ZLmr;)V", line = 369)
    public class361(boolean arg0, class613 arg1) {
        if (arg0) {
            if (class613.field8710.startsWith("win")) {
                this.field4616 = 1;
            } else if (class613.field8710.startsWith("mac")) {
                this.field4616 = 2;
            } else if (class613.field8710.startsWith("linux")) {
                this.field4616 = 3;
            } else {
                this.field4616 = 4;
            }
            if (class613.field8722.startsWith("amd64") || class613.field8722.startsWith("x86_64")) {
                this.field4613 = true;
            } else {
                this.field4613 = false;
            }
            if (this.field4616 == 1) {
                if (class613.field8725.indexOf("4.0") != -1) {
                    this.field4629 = 1;
                } else if (class613.field8725.indexOf("4.1") != -1) {
                    this.field4629 = 2;
                } else if (class613.field8725.indexOf("4.9") != -1) {
                    this.field4629 = 3;
                } else if (class613.field8725.indexOf("5.0") != -1) {
                    this.field4629 = 4;
                } else if (class613.field8725.indexOf("5.1") != -1) {
                    this.field4629 = 5;
                } else if (class613.field8725.indexOf("6.0") != -1) {
                    this.field4629 = 6;
                } else if (class613.field8725.indexOf("6.1") != -1) {
                    this.field4629 = 7;
                }
            } else if (this.field4616 == 2) {
                if (class613.field8725.indexOf("10.4") != -1) {
                    this.field4629 = 20;
                } else if (class613.field8725.indexOf("10.5") != -1) {
                    this.field4629 = 21;
                } else if (class613.field8725.indexOf("10.6") != -1) {
                    this.field4629 = 22;
                }
            }
            if (class613.field8724.toLowerCase().indexOf("sun") != -1) {
                this.field4623 = 1;
            } else if (class613.field8724.toLowerCase().indexOf("microsoft") != -1) {
                this.field4623 = 2;
            } else if (class613.field8724.toLowerCase().indexOf("apple") == -1) {
                this.field4623 = 4;
            } else {
                this.field4623 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class613.field8723.length()) {
                    char var5 = class613.field8723.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var15) {
            }
            this.field4617 = var4;
            int var6 = 0;
            int var7 = class613.field8723.indexOf(46, 2) + 1;
            try {
                while (var7 < class613.field8723.length()) {
                    char var8 = class613.field8723.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6 = var6 * 10 + var8 - 48;
                    var7++;
                }
            } catch (Exception var14) {
            }
            this.field4626 = var6;
            int var9 = class613.field8723.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class613.field8723.length()) {
                    char var11 = class613.field8723.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10 = var10 * 10 + var11 - 48;
                    var9++;
                }
            } catch (Exception var13) {
            }
            if (arg1.field8732) {
                this.field4624 = false;
            } else {
                this.field4624 = true;
            }
            this.field4628 = class674.field9497;
            if (this.field4617 > 3) {
                this.field4625 = class749.field10435;
            } else {
                this.field4625 = 0;
            }
            this.field4614 = var10;
            try {
                this.field4612 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field4612 = 0;
            }
        }
        if (this.field4611 == null) {
            this.field4611 = "";
        }
        if (this.field4615 == null) {
            this.field4615 = "";
        }
        if (this.field4621 == null) {
            this.field4621 = "";
        }
        if (this.field4620 == null) {
            this.field4620 = "";
        }
        this.method2036(false);
    }
}

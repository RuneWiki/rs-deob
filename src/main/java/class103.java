import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public abstract class class103 implements class216 {

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    private int field1502 = -1;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    private int field1501 = 0;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Z")
    private boolean field1518;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "Ltia;")
    public class278 field1503;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1522 = new String[] { method984(method983("\u001bw\u001dL\u0014")), method984(method983("\u001ct_f")), method984(method983("\u001bw\u001d6U\u001chG4\u0014")), method984(method983("\t/\u001d$A")), method984(method983("\u001bw\u001dlU\u001c`_cF\u0017)")), method984(method983("\u001bw\u001dG\u0014")), method984(method983("\u001bw\u001dE\u0014")), method984(method983("\u001bw\u001dF\u0014")), method984(method983("3StB\u001d")), method984(method983("\u001bw\u001d@\u0014")), method984(method983("\u001bw\u001dK\u0014")), method984(method983("\u001bw\u001dI\u0014")), method984(method983("\u001bw\u001dD\u0014")), method984(method983("\u001bw\u001dZ\u0014")), method984(method983("\u001bw\u001dA\u0014")) };

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lpe;")
    public static class636 field1513 = new class636(4, 1, 1, 1);

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1520;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILjaclib/memory/Source;I)Z", line = 4)
    public final boolean method973(int arg0, Source arg1, int arg2) {
        try {
            if (arg2 != -1) {
                this.field1516 = 108;
            }
            field1505++;
            if (arg0 <= this.field1507) {
                if (this.field1502 <= 0) {
                    throw new RuntimeException(field1522[8]);
                }
                OpenGL.glBindBufferARB(this.field1515, this.field1502);
                OpenGL.glBufferSubDataARBa(this.field1515, 0, this.field1516, arg1.getAddress());
                this.field1503.field4132 += arg0 - this.field1516;
            } else {
                this.method982((byte) 67);
                if (this.field1502 <= 0) {
                    throw new RuntimeException(field1522[8]);
                }
                OpenGL.glBindBufferARB(this.field1515, this.field1502);
                OpenGL.glBufferDataARBa(this.field1515, arg0, arg1.getAddress(), this.field1518 ? 35040 : 35044);
                this.field1503.field4132 += arg0 - this.field1516;
                this.field1507 = arg0;
            }
            this.field1516 = arg0;
            return true;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1522[9] + arg0 + ',' + (arg1 == null ? field1522[1] : field1522[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "finalize", descriptor = "()V", line = 45)
    protected final void finalize() throws Throwable {
        try {
            field1512++;
            this.method981(1328);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1522[4] + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(B)V", line = 63)
    public final void method974(byte arg0) {
        try {
            field1511++;
            if (arg0 > -118) {
                this.method980(-96, false);
            }
            if (this.field1503.field4550) {
                OpenGL.glBindBufferARB(this.field1515, this.field1502);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1522[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)I", line = 78)
    public int method975(boolean arg0) {
        try {
            if (arg0) {
                return -125;
            } else {
                field1510++;
                return this.field1516;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1522[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V", line = 90)
    public static void method976(byte arg0) {
        try {
            if (arg0 != 46) {
                method976((byte) -15);
            }
            field1513 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1522[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILjaggl/MapBuffer;)Z", line = 101)
    public final boolean method977(int arg0, MapBuffer arg1) {
        try {
            field1509++;
            if (arg0 > -71) {
                this.method978((byte) 3, false, null);
            }
            boolean var3 = true;
            if (this.field1501 != 0) {
                if (this.field1502 > 0) {
                    OpenGL.glBindBufferARB(this.field1515, this.field1502);
                    if (this.field1501 == 1) {
                        OpenGL.glBufferSubDataARBa(this.field1515, 0, this.field1507, this.field1503.field4094.getAddress());
                    } else {
                        var3 = arg1.method4766();
                    }
                }
                this.field1501 = 0;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1522[12] + arg0 + ',' + (arg1 == null ? field1522[1] : field1522[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BZLjaggl/MapBuffer;)Ljaclib/memory/Buffer;", line = 135)
    public final Buffer method978(byte arg0, boolean arg1, MapBuffer arg2) {
        try {
            if (arg0 > -3) {
                return null;
            }
            field1504++;
            if (this.field1501 == 0) {
                this.method982((byte) 34);
                if (this.field1502 <= 0) {
                    this.field1501 = 2;
                    return this.field1520;
                }
                OpenGL.glBindBufferARB(this.field1515, this.field1502);
                if (arg1) {
                    OpenGL.glBufferDataARBub(this.field1515, this.field1507, null, 0, this.field1518 ? 35040 : 35044);
                    if (this.field1503.field4094.field10094 >= this.field1516) {
                        this.field1501 = 1;
                        return this.field1503.field4094;
                    }
                }
                if (!arg2.method4765() && arg2.method4764(this.field1515, this.field1516, 35001)) {
                    this.field1501 = 2;
                    return arg2;
                }
            }
            return null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1522[14] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1522[1] : field1522[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)J", line = 179)
    public final long method979(byte arg0) {
        try {
            field1508++;
            if (arg0 <= 86) {
                this.method978((byte) -32, true, null);
            }
            return this.field1502 == 0 ? this.field1520.getAddress() : 0L;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1522[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V", line = 191)
    public void method980(int arg0, boolean arg1) {
        try {
            if (arg0 > this.field1507) {
                this.method982((byte) 67);
                if (this.field1502 <= 0) {
                    this.field1520 = this.field1503.method2216(false, arg0, (byte) -85);
                } else {
                    OpenGL.glBindBufferARB(this.field1515, this.field1502);
                    OpenGL.glBufferDataARBub(this.field1515, arg0, null, 0, this.field1518 ? 35040 : 35044);
                    this.field1503.field4132 += arg0 - this.field1507;
                }
                this.field1507 = arg0;
            }
            field1514++;
            this.field1516 = arg0;
            if (arg1) {
                this.method981(97);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1522[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 220)
    public void method981(int arg0) {
        try {
            if (this.field1502 > 0) {
                this.field1503.method2389(arg0 - 1206, this.field1502, this.field1516);
                this.field1502 = -1;
            }
            if (arg0 != 1328) {
                this.method980(46, true);
            }
            field1517++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1522[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)V", line = 236)
    private final void method982(byte arg0) {
        try {
            int var2 = -127 / ((-arg0 - 23) / 48);
            field1506++;
            if (this.field1502 < 0) {
                if (this.field1503.field4550) {
                    OpenGL.glGenBuffersARB(1, class309.field5039, 0);
                    this.field1502 = class309.field5039[0];
                    OpenGL.glBindBufferARB(this.field1515, this.field1502);
                } else {
                    this.field1502 = 0;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1522[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ltia;IZ)V", line = 275)
    public class103(class278 arg0, int arg1, boolean arg2) {
        try {
            this.field1518 = arg2;
            this.field1515 = arg1;
            this.field1503 = arg0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1522[2] + (arg0 == null ? field1522[1] : field1522[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method983(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method984(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class92 {

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    private int field1418 = 0;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    private int field1431 = 1;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    private int field1425 = 0;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    private int field1433 = 1;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lfr;")
    private class497 field1424 = new class497();

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Z")
    private boolean field1434 = false;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Z")
    private boolean field1435 = true;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "Z")
    private boolean field1436 = true;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "Z")
    private boolean field1437 = true;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Z")
    private boolean field1442 = true;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "[Lud;")
    private class94[] field1441 = new class94[2];

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    private int field1443 = 0;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    private int field1444 = -1;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Lvd;")
    private class258 field1426;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Les;")
    private class476 field1421;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Les;")
    private class476 field1422;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Les;")
    private class476 field1419;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "Lnt;")
    private class375 field1438;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "Lnt;")
    private class375 field1439;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "Lud;")
    private class94 field1440;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Z")
    private boolean field1427;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)Z", line = 5)
    public final boolean method720(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1420++;
        if (this.field1422 == null || this.field1424.method2954((byte) -118)) {
            return false;
        }
        if (this.field1431 != arg0 || this.field1433 != arg1) {
            this.field1433 = arg1;
            this.field1431 = arg0;
            for (class115 var6 = this.field1424.method2957(arg2 ^ 0xFFFFFFC2); var6 != this.field1424.field7365; var6 = var6.field1741) {
                ((class180) var6).method846(this.field1433, -70, this.field1431);
            }
            this.field1437 = true;
            this.field1436 = true;
            this.field1435 = true;
        }
        if (!this.method726(-111)) {
            if (arg2 != 0) {
                method725(true, (byte) 67, 22);
            }
            return false;
        }
        this.field1418 = arg3;
        this.field1427 = true;
        this.field1425 = arg4;
        this.field1426.method1568(this.field1422, 115);
        this.field1422.method2834(-1, 0);
        this.field1426.method1611(18113, this.field1433 - (this.field1422.method2828(-4399) + this.field1425), -this.field1418);
        return true;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 49)
    public final void method721(byte arg0) {
        field1414++;
        if (!this.field1427) {
            return;
        }
        if (this.field1419 != null) {
            this.field1426.method1551(this.field1419, (byte) 123);
            int var2 = 16384;
            this.field1426.method1587(-128, this.field1421);
            this.field1419.method2837(0, (byte) 88);
            this.field1421.method2834(-1, 0);
            if (this.field1434) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1431, this.field1433, 0, 0, this.field1431, this.field1433, var2, 9728);
            this.field1426.method1621((byte) 105, this.field1419);
            this.field1426.method1567(this.field1421, (byte) -36);
        }
        this.field1426.method1561((byte) 120);
        this.field1426.method1594(0, 256);
        this.field1426.method1582(1, true);
        this.field1426.method94();
        int var3 = 0;
        int var4 = 1;
        if (arg0 > -7) {
            this.method720(0, 5, 21, 92, -56);
        }
        class180 var6;
        for (class180 var5 = (class180) this.field1424.method2957(110); var5 != null; var5 = var6) {
            var6 = (class180) this.field1424.method2947(24);
            int var7 = var5.method1231((byte) -27);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method855(this.field1440, (byte) 15, var8, this.field1441[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field1426.method1554(this.field1421, 12644);
                    this.field1426.method1611(18113, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1433);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1418, this.field1425);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1418, this.field1433 + this.field1425);
                    OpenGL.glTexCoord2f((float) this.field1431, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1418 + this.field1431, this.field1425 - -this.field1433);
                    OpenGL.glTexCoord2f((float) this.field1431, (float) this.field1433);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1431 + this.field1418, this.field1425);
                    OpenGL.glEnd();
                } else {
                    this.field1421.method2834(-1, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1433);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field1433);
                    OpenGL.glTexCoord2f((float) this.field1431, (float) this.field1433);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1431, this.field1433);
                    OpenGL.glTexCoord2f((float) this.field1431, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1431, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var5.method847(var8, 114);
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field1427 = false;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V", line = 158)
    public static final void method722(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4592 != null) {
            var3.field4592 = null;
        }
        if (var3.field4586 != null) {
            var3.field4586 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lid;B)V", line = 172)
    public final void method723(class180 arg0, byte arg1) {
        field1415++;
        arg0.field2670 = false;
        arg0.method849((byte) -3);
        arg0.method876((byte) -96);
        this.method727((byte) -59);
        if (arg1 != 65) {
            this.field1444 = -57;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)V", line = 186)
    public static final void method724(int arg0, int arg1) {
        field1429++;
        class115.field1738 = arg1;
        class452.field6647.method2293(false);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZBI)Ljava/lang/String;", line = 198)
    public static final String method725(boolean arg0, byte arg1, int arg2) {
        field1428++;
        if (arg0 && arg2 >= 0) {
            if (arg1 != -55) {
                method725(false, (byte) 15, -42);
            }
            return class100.method765(arg0, 10, 0, arg2);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Z", line = 214)
    private final boolean method726(int arg0) {
        field1416++;
        if (this.field1436) {
            if (this.field1439 != null) {
                this.field1439.method2227((byte) 48);
                this.field1439 = null;
            }
            if (this.field1440 != null) {
                this.field1440.method1696(0);
                this.field1440 = null;
            }
            if (this.field1419 != null) {
                this.field1439 = new class375(this.field1426, 6402, this.field1431, this.field1433, this.field1426.field3696);
            }
            if (this.field1434) {
                this.field1440 = new class94(this.field1426, 34037, 6402, this.field1431, this.field1433);
            } else if (this.field1439 == null) {
                this.field1439 = new class375(this.field1426, 6402, this.field1431, this.field1433);
            }
            this.field1442 = true;
            this.field1435 = true;
            this.field1436 = false;
        }
        if (this.field1437) {
            if (this.field1438 != null) {
                this.field1438.method2227((byte) 71);
                this.field1438 = null;
            }
            if (this.field1441[0] != null) {
                this.field1441[0].method1696(0);
                this.field1441[0] = null;
            }
            if (this.field1441[1] != null) {
                this.field1441[1].method1696(0);
                this.field1441[1] = null;
            }
            if (this.field1419 != null) {
                this.field1438 = new class375(this.field1426, this.field1444, this.field1431, this.field1433, this.field1426.field3696);
            }
            this.field1441[0] = new class94(this.field1426, 34037, this.field1444, this.field1431, this.field1433);
            this.field1441[1] = this.field1443 <= 1 ? null : new class94(this.field1426, 34037, this.field1444, this.field1431, this.field1433);
            this.field1442 = true;
            this.field1435 = true;
            this.field1437 = false;
        }
        if (this.field1435) {
            if (this.field1419 == null) {
                this.field1426.method1568(this.field1421, 89);
                this.field1421.method2833(0, (byte) 98);
                this.field1421.method2833(1, (byte) -111);
                this.field1421.method2833(8, (byte) 109);
                this.field1421.method2830(0, -36, this.field1441[0]);
                if (this.field1443 > 1) {
                    this.field1421.method2830(1, -77, this.field1441[1]);
                }
                if (this.field1434) {
                    this.field1421.method2830(8, 116, this.field1440);
                } else {
                    this.field1421.method2831(8, this.field1439, 1);
                }
                this.field1426.method1554(this.field1421, 12644);
            } else {
                this.field1426.method1568(this.field1421, 106);
                this.field1421.method2833(0, (byte) -99);
                this.field1421.method2833(1, (byte) -39);
                this.field1421.method2833(8, (byte) 116);
                this.field1421.method2830(0, -52, this.field1441[0]);
                if (this.field1443 > 1) {
                    this.field1421.method2830(1, 119, this.field1441[1]);
                }
                if (this.field1434) {
                    this.field1421.method2830(8, 122, this.field1440);
                }
                this.field1426.method1554(this.field1421, 12644);
                this.field1426.method1568(this.field1419, 96);
                this.field1419.method2833(0, (byte) 75);
                this.field1419.method2833(8, (byte) 93);
                this.field1419.method2831(0, this.field1438, 1);
                this.field1419.method2831(8, this.field1439, 1);
                this.field1426.method1554(this.field1419, 12644);
            }
            this.field1442 = true;
            this.field1435 = false;
        }
        if (this.field1442) {
            this.field1426.method1568(this.field1422, 117);
            this.field1442 = !this.field1422.method2832((byte) -110);
            this.field1426.method1554(this.field1422, 12644);
        }
        int var2 = 92 % ((-arg0 - 61) / 49);
        return !this.field1442;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V", line = 343)
    private final void method727(byte arg0) {
        field1417++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class180 var5 = (class180) this.field1424.method2957(114); var5 != null; var5 = (class180) this.field1424.method2947(-110)) {
            int var10 = var5.method848(-98);
            var4 += var5.method1231((byte) -27);
            if (var3 < var10) {
                var3 = var10;
            }
            var2 |= var5.method1230(false);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1444 != var6) {
            this.field1437 = true;
            this.field1444 = var6;
        }
        int var7 = this.field1443 <= 2 ? this.field1443 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        int var9 = 76 / ((arg0 - 52) / 62);
        this.field1443 = var4;
        if (var2 != this.field1434) {
            this.field1434 = var2;
            this.field1436 = true;
        }
        if (var7 != var8) {
            this.field1435 = this.field1437 = true;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lid;B)Z", line = 406)
    public final boolean method728(class180 arg0, byte arg1) {
        if (arg1 != -7) {
            return true;
        }
        field1432++;
        if (this.field1422 != null) {
            if (arg0.method850(100) || arg0.method852((byte) -39)) {
                this.field1424.method2958(arg0, (byte) 115);
                this.method727((byte) -116);
                if (this.method726(-122)) {
                    if (this.field1431 != -1 && this.field1433 != -1) {
                        arg0.method846(this.field1433, arg1 - 100, this.field1431);
                    }
                    arg0.field2670 = true;
                    return true;
                }
            }
            this.method723(arg0, (byte) 65);
        }
        return false;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V", line = 440)
    public final void method729(int arg0) {
        this.field1438 = null;
        this.field1440 = null;
        this.field1422 = this.field1419 = this.field1421 = null;
        this.field1441 = null;
        this.field1439 = null;
        field1423++;
        if (!this.field1424.method2954((byte) 75)) {
            for (class115 var2 = this.field1424.method2957(-48); var2 != this.field1424.field7365; var2 = var2.field1741) {
                ((class180) var2).method849((byte) -3);
            }
        }
        this.field1431 = this.field1433 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lvd;)V", line = 536)
    public class92(class258 arg0) {
        this.field1426 = arg0;
        if (this.field1426.field3812 && this.field1426.field3744) {
            this.field1422 = this.field1421 = new class476(this.field1426);
            if (this.field1426.field3696 > 1 && this.field1426.field3794 && this.field1426.field3758) {
                this.field1422 = this.field1419 = new class476(this.field1426);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Z", line = 473)
    public final boolean method730(byte arg0) {
        if (arg0 == 38) {
            field1430++;
            return this.field1422 != null;
        } else {
            return false;
        }
    }
}

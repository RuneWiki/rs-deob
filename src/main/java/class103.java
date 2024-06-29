import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class103 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    private int field1435 = 0;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    private int field1445 = 1;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    private int field1449 = 1;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    private int field1446 = 0;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lada;")
    private class164 field1451 = new class164();

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "[Law;")
    private class76[] field1456 = new class76[2];

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "Z")
    private boolean field1459 = true;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Z")
    private boolean field1458 = false;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    private int field1457 = 0;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    private int field1465 = -1;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
    private boolean field1460 = true;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "Z")
    private boolean field1463 = true;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "Z")
    private boolean field1467 = true;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lwh;")
    private class148 field1447;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Liha;")
    private class30 field1438;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Liha;")
    private class30 field1442;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Liha;")
    private class30 field1452;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1437 = 0;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Lcs;")
    public static class342 field1450;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "Laea;")
    private class51 field1464;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Laea;")
    private class51 field1466;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "Law;")
    private class76 field1461;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Z")
    private boolean field1439;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Luga;I)Z", line = 5)
    public final boolean method780(class209 arg0, int arg1) {
        field1444++;
        if (arg1 >= -19) {
            this.field1464 = null;
        }
        if (this.field1442 != null) {
            if (arg0.method1409(0) || arg0.method1407(-120)) {
                this.field1451.method1203(arg0, (byte) -40);
                this.method783(-78);
                if (this.method786((byte) 116)) {
                    if (this.field1449 != -1 && this.field1445 != -1) {
                        arg0.method1418(this.field1445, this.field1449, 48);
                    }
                    arg0.field3062 = true;
                    return true;
                }
            }
            this.method784(arg0, -62);
        }
        return false;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lwh;)V", line = 574)
    public class103(class148 arg0) {
        this.field1447 = arg0;
        if (this.field1447.field2205 && this.field1447.field2264) {
            this.field1442 = this.field1438 = new class30(this.field1447);
            if (this.field1447.field2158 > 1 && this.field1447.field2301 && this.field1447.field2254) {
                this.field1442 = this.field1452 = new class30(this.field1447);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIB)Z", line = 49)
    public final boolean method781(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1443++;
        if (this.field1442 == null || this.field1451.method1197(0)) {
            return false;
        }
        if (this.field1449 != arg2 || this.field1445 != arg3) {
            this.field1449 = arg2;
            this.field1445 = arg3;
            for (class184 var6 = this.field1451.method1195(0); var6 != this.field1451.field2590; var6 = var6.field2812) {
                ((class209) var6).method1418(this.field1445, this.field1449, arg4 ^ 0x70);
            }
            this.field1467 = true;
            this.field1459 = true;
            this.field1463 = true;
        }
        if (arg4 != 92) {
            this.method781(104, -53, 67, -33, (byte) 91);
        }
        if (!this.method786((byte) 58)) {
            return false;
        }
        this.field1435 = arg1;
        this.field1439 = true;
        this.field1446 = arg0;
        this.field1447.method1098(this.field1442, 495185768);
        this.field1442.method150(0, true);
        this.field1447.method1093(16686, -this.field1435, this.field1446 + this.field1445 - this.field1447.field2007);
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 110)
    public final void method782(byte arg0) {
        this.field1466 = null;
        int var2 = -24 / ((-arg0 - 22) / 35);
        this.field1461 = null;
        this.field1456 = null;
        field1462++;
        this.field1442 = this.field1452 = this.field1438 = null;
        this.field1464 = null;
        if (!this.field1451.method1197(0)) {
            for (class184 var3 = this.field1451.method1195(0); var3 != this.field1451.field2590; var3 = var3.field2812) {
                ((class209) var3).method1408((byte) -87);
            }
        }
        this.field1449 = this.field1445 = 1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 139)
    private final void method783(int arg0) {
        field1455++;
        boolean var2 = false;
        int var3 = 0;
        if (arg0 >= -44) {
            this.field1439 = false;
        }
        int var4 = 0;
        for (class209 var5 = (class209) this.field1451.method1195(0); var5 != null; var5 = (class209) this.field1451.method1201(2)) {
            int var9 = var5.method1419(93);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method1415((byte) 99);
            var2 |= var5.method1411((byte) -62);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1465 != var6) {
            this.field1463 = true;
            this.field1465 = var6;
        }
        int var7 = this.field1457 > 2 ? 2 : this.field1457;
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field1459 = this.field1463 = true;
        }
        this.field1457 = var4;
        if (this.field1458 != var2) {
            this.field1467 = true;
            this.field1458 = var2;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Luga;I)V", line = 200)
    public final void method784(class209 arg0, int arg1) {
        field1454++;
        arg0.field3062 = false;
        arg0.method1408((byte) -62);
        int var3 = 64 % ((arg1 - 6) / 42);
        arg0.method1304((byte) 7);
        this.method783(-126);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIZI)V", line = 213)
    public static final void method785(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            method789(39);
        }
        if (arg2 >= arg1) {
            class238.method1577(arg4, class664.field9322[arg0], arg2, arg1, (byte) -24);
        } else {
            class238.method1577(arg4, class664.field9322[arg0], arg1, arg2, (byte) -6);
        }
        field1453++;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)Z", line = 233)
    private final boolean method786(byte arg0) {
        if (this.field1467) {
            if (this.field1466 != null) {
                this.field1466.method370((byte) 110);
                this.field1466 = null;
            }
            if (this.field1461 != null) {
                this.field1461.method1351(95);
                this.field1461 = null;
            }
            if (this.field1452 != null) {
                this.field1466 = new class51(this.field1447, 6402, this.field1449, this.field1445, this.field1447.field2158);
            }
            if (this.field1458) {
                this.field1461 = new class76(this.field1447, 34037, 6402, this.field1449, this.field1445);
            } else if (this.field1466 == null) {
                this.field1466 = new class51(this.field1447, 6402, this.field1449, this.field1445);
            }
            this.field1459 = true;
            this.field1467 = false;
            this.field1460 = true;
        }
        field1440++;
        if (this.field1463) {
            if (this.field1464 != null) {
                this.field1464.method370((byte) 114);
                this.field1464 = null;
            }
            if (this.field1456[0] != null) {
                this.field1456[0].method1351(84);
                this.field1456[0] = null;
            }
            if (this.field1456[1] != null) {
                this.field1456[1].method1351(113);
                this.field1456[1] = null;
            }
            if (this.field1452 != null) {
                this.field1464 = new class51(this.field1447, this.field1465, this.field1449, this.field1445, this.field1447.field2158);
            }
            this.field1456[0] = new class76(this.field1447, 34037, this.field1465, this.field1449, this.field1445);
            this.field1456[1] = this.field1457 > 1 ? new class76(this.field1447, 34037, this.field1465, this.field1449, this.field1445) : null;
            this.field1459 = true;
            this.field1463 = false;
            this.field1460 = true;
        }
        if (this.field1459) {
            if (this.field1452 == null) {
                this.field1447.method1098(this.field1438, 495185768);
                this.field1438.method157(0, -210);
                this.field1438.method157(1, -210);
                this.field1438.method157(8, -210);
                this.field1438.method151(0, this.field1456[0], 60);
                if (this.field1457 > 1) {
                    this.field1438.method151(1, this.field1456[1], 67);
                }
                if (this.field1458) {
                    this.field1438.method151(8, this.field1461, 121);
                } else {
                    this.field1438.method155(this.field1466, 0, 8);
                }
                this.field1447.method1059(this.field1438, 515);
            } else {
                this.field1447.method1098(this.field1438, 495185768);
                this.field1438.method157(0, -210);
                this.field1438.method157(1, -210);
                this.field1438.method157(8, -210);
                this.field1438.method151(0, this.field1456[0], 123);
                if (this.field1457 > 1) {
                    this.field1438.method151(1, this.field1456[1], 72);
                }
                if (this.field1458) {
                    this.field1438.method151(8, this.field1461, 59);
                }
                this.field1447.method1059(this.field1438, 515);
                this.field1447.method1098(this.field1452, 495185768);
                this.field1452.method157(0, -210);
                this.field1452.method157(8, -210);
                this.field1452.method155(this.field1464, 0, 0);
                this.field1452.method155(this.field1466, 0, 8);
                this.field1447.method1059(this.field1452, 515);
            }
            this.field1460 = true;
            this.field1459 = false;
        }
        if (this.field1460) {
            this.field1447.method1098(this.field1442, 495185768);
            this.field1460 = !this.field1442.method154(239);
            this.field1447.method1059(this.field1442, 515);
        }
        if (arg0 <= 8) {
            this.method783(-60);
        }
        return !this.field1460;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 361)
    public final void method787(int arg0) {
        field1436++;
        if (!this.field1439) {
            return;
        }
        if (this.field1452 != null) {
            this.field1447.method1031(this.field1452, 962);
            int var2 = 16384;
            this.field1447.method1069(this.field1438, (byte) -118);
            this.field1452.method144(0, (byte) 72);
            this.field1438.method150(0, true);
            if (this.field1458) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1449, this.field1445, 0, 0, this.field1449, this.field1445, var2, 9728);
            this.field1447.method1080(true, this.field1452);
            this.field1447.method1042(-6109, this.field1438);
        }
        this.field1447.method1067(-2);
        this.field1447.method1039(false, 0);
        this.field1447.method1066(arg0, 260);
        this.field1447.method469();
        int var3 = 0;
        int var4 = 1;
        class209 var6;
        for (class209 var5 = (class209) this.field1451.method1195(0); var5 != null; var5 = var6) {
            var6 = (class209) this.field1451.method1201(arg0 + 1);
            int var7 = var5.method1415((byte) 99);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1417(-127, var8, this.field1456[var3], this.field1461);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field1447.method1059(this.field1438, 515);
                    this.field1447.method1093(16686, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1445);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1435, this.field1446);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1435, this.field1446 + this.field1445);
                    OpenGL.glTexCoord2f((float) this.field1449, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1435 + this.field1449, this.field1446 - -this.field1445);
                    OpenGL.glTexCoord2f((float) this.field1449, (float) this.field1445);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1449 + this.field1435, this.field1446);
                    OpenGL.glEnd();
                } else {
                    this.field1438.method150(var4, true);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1445);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field1445);
                    OpenGL.glTexCoord2f((float) this.field1449, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1449, this.field1445);
                    OpenGL.glTexCoord2f((float) this.field1449, (float) this.field1445);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1449, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method1414(var8, true);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field1439 = false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Z", line = 464)
    public final boolean method788(boolean arg0) {
        field1448++;
        if (arg0) {
            this.field1438 = null;
        }
        return this.field1442 != null;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V", line = 479)
    public static void method789(int arg0) {
        if (arg0 != 1) {
            method789(-71);
        }
        field1450 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILao;I)V", line = 518)
    public static final void method790(int arg0, class288 arg1, int arg2) {
        field1441++;
        if (arg0 != -25839) {
            method785(-86, -94, 68, false, -49);
        }
        if (class107.field1497 >= 50 || arg1 == null || arg1.field4090 == null || arg1.field4090.length <= arg2 || arg1.field4090[arg2] == null) {
            return;
        }
        int var3 = arg1.field4090[arg2][0];
        int var4 = var3 >> 8;
        if (arg1.field4090[arg2].length > 1) {
            int var5 = (int) ((double) arg1.field4090[arg2].length * Math.random());
            if (var5 > 0) {
                var4 = arg1.field4090[arg2][var5];
            }
        }
        int var6 = (var3 & 0xF5) >> 5;
        int var7 = 256;
        if (arg1.field4092 != null && arg1.field4093 != null) {
            var7 = class320.method2027(arg1.field4093[arg2], arg1.field4092[arg2], (byte) -9);
        }
        if (arg1.field4091) {
            class176.method1258(50, var7, false, 0, var4, 255, var6);
        } else {
            class258.method1683(var7, 255, var4, (byte) -110, var6, 0);
        }
    }
}

import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class133 implements class173 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field1958 = -1;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Z")
    private boolean field1962 = false;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1957 = null;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lug;")
    public static class253 field1961;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 5)
    public static void method977(int arg0) {
        if (arg0 < 29) {
            field1961 = (class253) null;
        }
        field1957 = null;
        field1961 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()I", line = 17)
    public final int method352() {
        field1960++;
        return 4;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 35)
    public final void method353(int arg0) {
        field1959++;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 369)
    public class133() {
        if (class109.field1491) {
            GL var1 = class109.field1456;
            this.field1958 = var1.glGenLists(2);
            var1.glNewList(this.field1958, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 34165);
            var1.glTexEnvi(8960, 34178, 34168);
            var1.glTexEnvi(8960, 34162, 7681);
            var1.glTexEnvi(8960, 34184, 34167);
            var1.glTexGeni(8192, 9472, 34066);
            var1.glTexGeni(8193, 9472, 34066);
            var1.glTexGeni(8194, 9472, 34066);
            var1.glEnable(3168);
            var1.glEnable(3169);
            var1.glEnable(3170);
            var1.glEnable(34067);
            var1.glActiveTexture(33984);
            var1.glEndList();
            var1.glNewList(this.field1958 + 1, 4864);
            var1.glActiveTexture(33985);
            var1.glTexEnvi(8960, 34161, 8448);
            var1.glTexEnvi(8960, 34178, 34166);
            var1.glTexEnvi(8960, 34162, 8448);
            var1.glTexEnvi(8960, 34184, 5890);
            var1.glDisable(3168);
            var1.glDisable(3169);
            var1.glDisable(3170);
            var1.glDisable(34067);
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            var1.glEndList();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 47)
    public final void method355() {
        field1956++;
        GL var1 = class109.field1456;
        if (this.field1962) {
            var1.glCallList(this.field1958 + 1);
            this.field1962 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)Llc;", line = 67)
    public static final class294 method978(int arg0, int arg1, byte arg2) {
        field1953++;
        for (class294 var3 = (class294) class283.field4383.method2174(256); var3 != null; var3 = (class294) class283.field4383.method2164((byte) 102)) {
            if (var3.field4554 && var3.method2046(0, arg1, arg0)) {
                return var3;
            }
        }
        int var4 = -73 / ((arg2 - 28) / 38);
        return null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V", line = 90)
    public final void method354() {
        field1955++;
        GL var1 = class109.field1456;
        class109.method756(1);
        if (class33.field491 == null || this.field1958 < 0 || !class220.field3482) {
            var1.glTexEnvi(8960, 34184, 34167);
            return;
        }
        var1.glCallList(this.field1958);
        var1.glActiveTexture(33985);
        class33.field491.method633();
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glRotatef(-((float) class179.field2918 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class339.field5296 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glScalef(-1.0F, 1.0F, 1.0F);
        var1.glMatrixMode(5888);
        var1.glActiveTexture(33984);
        this.field1962 = true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZZI)V", line = 117)
    public static final void method979(int arg0, boolean arg1, boolean arg2, int arg3) {
        field1954++;
        int var10002;
        for (int var4 = 0; var4 < class79.field1083; var4++) {
            class212 var5 = class59.field870[class85.field1157[var4]];
            if (var5 != null && var5.method1546((byte) 96) && var5.field3346.method1204(0)) {
                int var6 = var5.method2099((byte) 123);
                if (arg1) {
                    if (!var5.field3346.field2562) {
                        continue;
                    }
                } else if (var5.field3346.field2578 != arg2 || arg3 != 0 && arg3 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field4698 & 0x7F) == 64 && (var5.field4731 & 0x7F) == 64) {
                        int var7 = var5.field4698 >> 7;
                        int var8 = var5.field4731 >> 7;
                        if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                            var10002 = class235.field3675[var7][var8]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field4698 & 0x7F) == 0 && (var5.field4731 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4698 & 0x7F) == 64 && (var5.field4731 & 0x7F) == 64)) {
                    int var9 = var5.field4698 - (var6 * 64) >> 7;
                    int var10 = var5.field4731 - (var6 * 64) >> 7;
                    int var11 = var9 + var5.method2099((byte) 123);
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var12 = var10 + var5.method2099((byte) 123);
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    for (int var13 = var9; var13 < var11; var13++) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            var10002 = class235.field3675[var13][var14]++;
                        }
                    }
                }
            }
        }
        label209: for (int var15 = 0; var15 < class79.field1083; var15++) {
            long var16 = (long) class85.field1157[var15] << 32 | 0x20000000L;
            class212 var18 = class59.field870[class85.field1157[var15]];
            if (var18 != null && var18.method1546((byte) 96) && var18.field3346.method1204(arg0 ^ 0x608B)) {
                int var19 = var18.method2099((byte) 123);
                if (arg1) {
                    if (!var18.field3346.field2562) {
                        continue;
                    }
                } else if (var18.field3346.field2578 != arg2 || arg3 != 0 && arg3 != var19) {
                    continue;
                }
                var18.field4659 = true;
                if (var19 == 1) {
                    if ((var18.field4698 & 0x7F) == 64 && (var18.field4731 & 0x7F) == 64) {
                        int var20 = var18.field4698 >> 7;
                        int var21 = var18.field4731 >> 7;
                        if (var20 < 0 || var20 >= 104 || var21 < 0 || var21 >= 104) {
                            continue;
                        }
                        if (class235.field3675[var20][var21] > 1) {
                            var10002 = class235.field3675[var20][var21]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var18.field4698 & 0x7F) == 0 && (var18.field4731 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var18.field4698 & 0x7F) == 64 && (var18.field4731 & 0x7F) == 64) {
                    int var22 = var18.field4698 - (var19 * 64) >> 7;
                    int var23 = var18.field4731 - (var19 * 64) >> 7;
                    int var24 = var19 + var22;
                    boolean var25 = true;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    int var26 = var19 + var23;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var26 > 104) {
                        var26 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    for (int var27 = var22; var27 < var24; var27++) {
                        for (int var28 = var23; var28 < var26; var28++) {
                            if (class235.field3675[var27][var28] <= 1) {
                                var25 = false;
                                break;
                            }
                        }
                    }
                    if (var25) {
                        int var29 = var22;
                        while (true) {
                            if (var29 >= var24) {
                                continue label209;
                            }
                            for (int var30 = var23; var30 < var26; var30++) {
                                var10002 = class235.field3675[var29][var30]--;
                            }
                            var29++;
                        }
                    }
                }
                var18.field4659 = false;
                if (!var18.field3346.field2584) {
                    var16 |= Long.MIN_VALUE;
                }
                var18.field4747 = class320.method2245((byte) -96, var18.field4731, class154.field2392, var18.field4698);
                class6.method94(class154.field2392, var18.field4698, var18.field4731, var18.field4747, (var19 - 1) * 64 + 60, var18, var18.field4715, var16, var18.field4686);
            }
        }
        if (arg0 != 24715) {
            field1957 = (String) null;
        }
    }
}

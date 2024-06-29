import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class45 implements class220 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    private int field612 = -1;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
    private boolean field616 = false;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field610 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[S")
    public static short[] field613 = new short[256];

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
    public static String field619 = "Hidden";

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "[Z")
    public static boolean[] field620 = new boolean[100];

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ljava/lang/String;")
    public static String field621 = " more options";

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V", line = 8)
    public final void method300() {
        GL var1 = class186.field2990;
        class186.method1299(1);
        if (class240.field3793 == null || this.field612 < 0 || !class269.field4250) {
            var1.glTexEnvi(8960, 34184, 34167);
        } else {
            var1.glCallList(this.field612);
            var1.glActiveTexture(33985);
            class240.field3793.method1083();
            var1.glMatrixMode(5890);
            var1.glLoadIdentity();
            var1.glRotatef(-((float) class92.field1419 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
            var1.glRotatef(-((float) class114.field1723 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
            var1.glScalef(-1.0F, 1.0F, 1.0F);
            var1.glMatrixMode(5888);
            var1.glActiveTexture(33984);
            this.field616 = true;
        }
        field611++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 34)
    public final void method301(int arg0) {
        field617++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BJ)V", line = 44)
    public static final void method302(byte arg0, long arg1) {
        int var3 = 40 % ((68 - arg0) / 56);
        field618++;
        if (class282.field4461 == 1 || class282.field4461 == 5) {
            class163.method1131(arg1, (byte) -7);
        } else if (class282.field4461 == 2) {
            class254.method1790(1);
        } else {
            class118.method821((byte) 54);
        }
        if (!class19.field274) {
            class50.field686[0] = 1003;
            if (class121.field1848 != 0) {
                class323.field5055 = class157.field2426;
                class18.field256 = class16.field211;
            } else if (class303.field4727 == 0) {
                class18.field256 = class164.field2672;
                class323.field5055 = class4.field35;
            } else {
                class18.field256 = class221.field3521;
                class323.field5055 = class144.field2158;
            }
            class56.field746[0] = class239.field3778;
            class126.field1887 = 1;
            class284.field4478[0] = class24.field343;
            class147.field2199[0] = "";
        }
        if (class246.field3904 != -1) {
            class173.method1181((byte) -110, class246.field3904);
        }
        for (int var4 = 0; var4 < class140.field2086; var4++) {
            if (class284.field4485[var4]) {
                class237.field3748[var4] = true;
            }
            class314.field4894[var4] = class284.field4485[var4];
            class284.field4485[var4] = false;
        }
        class139.field2078 = -1;
        if (class186.field2991) {
            class26.field383 = true;
        }
        class215.field3475 = null;
        class290.field4576 = null;
        class318.field4928 = class48.field648;
        class90.field1378 = -1;
        if (class246.field3904 != -1) {
            class140.field2086 = 0;
            class264.method1886((byte) 70);
        }
        if (class186.field2991) {
            class344.method2372();
        } else {
            class216.method1590();
        }
        class21.method139(119);
        if (class19.field274) {
            if (class119.field1827) {
                class193.method1412(2);
            } else {
                class249.method1765(99);
            }
        } else if (class215.field3475 != null) {
            class56.method401(class215.field3475, -8875, class39.field525, class128.field1904);
        } else if (class139.field2078 != -1) {
            class56.method401((class160) null, -8875, class90.field1378, class139.field2078);
        }
        int var5 = class19.field274 ? -1 : class188.method1326(-1);
        if (var5 == -1) {
            var5 = class24.field345;
        }
        class222.method1620(var5, -1);
        if (class274.field4351 == 1) {
            class274.field4351 = 2;
        }
        if (class26.field375 == 1) {
            class26.field375 = 2;
        }
        if (class330.field5148 == 3) {
            for (int var6 = 0; var6 < class140.field2086; var6++) {
                if (class314.field4894[var6]) {
                    if (class186.field2991) {
                        class344.method2378(class192.field3135[var6], class48.field647[var6], class283.field4466[var6], class210.field3433[var6], 16711935, 128);
                    } else {
                        class216.method1584(class192.field3135[var6], class48.field647[var6], class283.field4466[var6], class210.field3433[var6], 16711935, 128);
                    }
                } else if (class237.field3748[var6]) {
                    if (class186.field2991) {
                        class344.method2378(class192.field3135[var6], class48.field647[var6], class283.field4466[var6], class210.field3433[var6], 16711680, 128);
                    } else {
                        class216.method1584(class192.field3135[var6], class48.field647[var6], class283.field4466[var6], class210.field3433[var6], 16711680, 128);
                    }
                }
            }
        }
        class313.method2177((byte) 7, class274.field4353, class13.field159.field1944, class148.field2209, class13.field159.field1980);
        class274.field4353 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 281)
    public class45() {
        if (class186.field3023) {
            GL var1 = class186.field2990;
            this.field612 = var1.glGenLists(2);
            var1.glNewList(this.field612, 4864);
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
            var1.glNewList(this.field612 + 1, 4864);
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

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()V", line = 202)
    public final void method303() {
        GL var1 = class186.field2990;
        field614++;
        if (this.field616) {
            var1.glCallList(this.field612 + 1);
            this.field616 = false;
        } else {
            var1.glTexEnvi(8960, 34184, 5890);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()I", line = 222)
    public final int method304() {
        field609++;
        return 4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 239)
    public static void method305(byte arg0) {
        if (arg0 != 86) {
            method306(-102, 77);
        }
        field619 = null;
        field613 = null;
        field621 = null;
        field620 = null;
        field610 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 260)
    public static final int method306(int arg0, int arg1) {
        field615++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg1 != -502316351) {
            field621 = (String) null;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }
}

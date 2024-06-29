import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class237 implements class335 {

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "Lpia;")
    public static class94 field2813 = new class94(27, 15);

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "Lso;")
    public static class468 field2824 = new class468(9, 4);

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "Z")
    public static boolean field2827 = false;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "Z")
    public static volatile boolean field2828 = true;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "Lsn;")
    public static class629 field2829;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "Z")
    public boolean field2822;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)V")
    public static final void method1399(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 548447816) {
            field2828 = true;
        }
        if (arg3 == 1012) {
            class133.method853(class207.field2435, arg0, arg1);
        } else if (arg3 == 1001) {
            class133.method853(class652.field9306, arg0, arg1);
        } else if (arg3 == 1008) {
            class133.method853(class343.field4456, arg0, arg1);
        } else if (arg3 == 1007) {
            class133.method853(class738.field10315, arg0, arg1);
        } else if (arg3 == 1006) {
            class133.method853(class181.field2140, arg0, arg1);
        }
        field2823++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lai;[Let;I)Ljfa;")
    public static final class288 method1400(class597 arg0, class592[] arg1, int arg2) {
        field2821++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field8342 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field8342);
        }
        if (arg2 >= -106) {
            field2826 = -78;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class376.field4855, 0);
        if (class376.field4855[0] == 0) {
            if (class376.field4855[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class376.field4855, 1);
            if (class376.field4855[1] > 1) {
                byte[] var7 = new byte[class376.field4855[1]];
                OpenGL.glGetInfoLogARB(var4, class376.field4855[1], class376.field4855, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class376.field4855[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field8342);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class288(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)V")
    public static void method1401(boolean arg0) {
        if (arg0) {
            field2824 = null;
            field2829 = null;
            field2813 = null;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)J")
    public final long method1402(int arg0) {
        if (arg0 != 23607) {
            return -53L;
        }
        field2820++;
        long[] var2 = class471.field6753;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field2825 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field2816 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field2816 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field2817 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field2817 >> 16) ^ var11) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field2817 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field2817 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field2819 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field2818 >> 24) ^ var19) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field2818 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field2818 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field2818 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field2814) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field2822 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lon;Z)Z")
    public final boolean method1403(class335 arg0, boolean arg1) {
        field2815++;
        if (!(arg0 instanceof class237)) {
            return false;
        }
        class237 var3 = (class237) arg0;
        if (!arg1) {
            method1400(null, null, 46);
        }
        if (this.field2825 != var3.field2825) {
            return false;
        } else if (this.field2816 != var3.field2816) {
            return false;
        } else if (this.field2817 != var3.field2817) {
            return false;
        } else if (this.field2819 != var3.field2819) {
            return false;
        } else if (this.field2818 != var3.field2818) {
            return false;
        } else if (this.field2814 == var3.field2814) {
            return var3.field2822 == this.field2822;
        } else {
            return false;
        }
    }
}

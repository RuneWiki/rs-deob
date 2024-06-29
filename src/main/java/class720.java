import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class720 {

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "Lpca;")
    private class714 field10001 = new class714(64);

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Lfp;")
    private class323 field9998;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field9991;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "F")
    public static float field9993 = 0.0F;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field9997;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "[I")
    public static int[] field10000;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field9999;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)Lsca;")
    public final class44 method4042(int arg0, byte arg1) {
        field9996++;
        class714 var3 = this.field10001;
        class44 var4;
        synchronized (this.field10001) {
            var4 = (class44) this.field10001.method4022((long) arg0, (byte) 87);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field9998;
        byte[] var7;
        synchronized (this.field9998) {
            int var6 = 73 % ((59 - arg1) / 36);
            var7 = this.field9998.method2100(arg0, (byte) 112, 16);
        }
        class44 var8 = new class44();
        if (var7 != null) {
            var8.method295(new class675(var7), (byte) -117);
        }
        class714 var9 = this.field10001;
        synchronized (this.field10001) {
            this.field10001.method4018((byte) 125, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V")
    public final void method4043(byte arg0, int arg1) {
        field9995++;
        class714 var3 = this.field10001;
        synchronized (this.field10001) {
            if (arg0 != -31) {
                this.field10001 = null;
            }
            this.field10001.method4016(arg1, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILfha;[Lpl;)Lrd;")
    public static final class336 method4044(int arg0, class378 arg1, class649[] arg2) {
        field9988++;
        int var3 = 0;
        if (arg0 > -126) {
            method4048(99, -115, -3, 127L);
        }
        while (var3 < arg2.length) {
            if (arg2[var3] == null || arg2[var3].field8918 <= 0L) {
                return null;
            }
            var3++;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field8918);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class421.field5933, 0);
        if (class421.field5933[0] == 0) {
            if (class421.field5933[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class421.field5933, 1);
            if (class421.field5933[1] > 1) {
                byte[] var7 = new byte[class421.field5933[1]];
                OpenGL.glGetInfoLogARB(var4, class421.field5933[1], class421.field5933, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class421.field5933[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field8918);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class336(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method4045(int arg0) {
        field10000 = null;
        field9999 = null;
        if (arg0 != 15) {
            method4048(-85, 117, -3, 63L);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public final void method4046(int arg0) {
        field9997++;
        class714 var2 = this.field10001;
        synchronized (this.field10001) {
            this.field10001.method4023((byte) -127);
        }
        if (arg0 != 15) {
            method4047(-113);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)[Lfv;")
    public static final class120[] method4047(int arg0) {
        if (arg0 != 25992) {
            field10000 = null;
        }
        field9992++;
        return new class120[] { class29.field380, class638.field8770, class211.field2786 };
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIJ)V")
    public static final void method4048(int arg0, int arg1, int arg2, long arg3) {
        if (arg2 <= 88) {
            method4047(67);
        }
        field9989++;
        int var5 = ((int) arg3 & 0x7C93A) >> 14;
        int var6 = ((int) arg3 & 0x308BFB) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class174.method1113(var5, 0, 1, 0, 0, var6, arg1, true, arg0);
            return;
        }
        class10 var8 = class612.field8588.method558((byte) 124, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field225;
            var9 = var8.field230;
        } else {
            var9 = var8.field225;
            var10 = var8.field230;
        }
        int var11 = var8.field182;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class174.method1113(0, var11, 1, var10, var9, 0, arg1, true, arg0);
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
    public final void method4049(int arg0) {
        class714 var2 = this.field10001;
        synchronized (this.field10001) {
            this.field10001.method4024(arg0 ^ arg0);
        }
        field9990++;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lsaa;ILfp;)V")
    public class720(class326 arg0, int arg1, class323 arg2) {
        this.field9998 = arg2;
        if (this.field9998 == null) {
            this.field9991 = 0;
        } else {
            this.field9991 = this.field9998.method2084(16, 0);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class67 {

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Z")
    public boolean field824 = false;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lpca;")
    private class714 field813 = new class714(64);

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Lpca;")
    public class714 field826 = new class714(500);

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "Lpca;")
    public class714 field827 = new class714(30);

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Lpca;")
    public class714 field828 = new class714(50);

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Z")
    public boolean field818;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lfp;")
    private class323 field819;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lfp;")
    public class323 field811;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[Z")
    public static boolean[] field815 = new boolean[8];

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lqfa;")
    public static class98 field812 = new class98(68, 0);

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field825 = -1;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lqfa;")
    public static class98 field823 = new class98(37, 8);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public int field829;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V", line = 9)
    public final void method550(int arg0, boolean arg1) {
        field814++;
        if (this.field824 == arg1) {
            return;
        }
        this.field824 = arg1;
        if (arg0 != 0) {
            this.field811 = null;
        }
        this.method555((byte) 73);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IZ)V", line = 26)
    public final void method551(int arg0, boolean arg1) {
        field820++;
        if (arg1 == this.field818) {
            return;
        }
        this.field818 = arg1;
        this.method555((byte) 73);
        if (arg0 != 8) {
            this.method552(19, -81);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V", line = 43)
    public final void method552(int arg0, int arg1) {
        field809++;
        class714 var3 = this.field813;
        synchronized (this.field813) {
            this.field813.method4016(arg0, (byte) -73);
        }
        class714 var4 = this.field826;
        synchronized (this.field826) {
            this.field826.method4016(arg0, (byte) -73);
        }
        if (arg1 != 8) {
            this.method553((byte) 9);
        }
        class714 var5 = this.field827;
        synchronized (this.field827) {
            this.field827.method4016(arg0, (byte) -73);
        }
        class714 var6 = this.field828;
        synchronized (this.field828) {
            this.field828.method4016(arg0, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 67)
    public final void method553(byte arg0) {
        class714 var2 = this.field813;
        synchronized (this.field813) {
            this.field813.method4024(0);
            if (arg0 != 26) {
                field825 = 30;
            }
        }
        field821++;
        class714 var3 = this.field826;
        synchronized (this.field826) {
            this.field826.method4024(arg0 - 26);
        }
        class714 var4 = this.field827;
        synchronized (this.field827) {
            this.field827.method4024(arg0 ^ 0x1A);
        }
        class714 var5 = this.field828;
        synchronized (this.field828) {
            this.field828.method4024(0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)V", line = 90)
    public static final void method554(byte arg0, int arg1) {
        if (arg0 > -116) {
            field825 = 77;
        }
        field807++;
        class714 var2 = class689.field9415;
        synchronized (class689.field9415) {
            class689.field9415.method4016(arg1, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 109)
    public final void method555(byte arg0) {
        field816++;
        class714 var2 = this.field813;
        synchronized (this.field813) {
            this.field813.method4023((byte) -127);
        }
        class714 var3 = this.field826;
        synchronized (this.field826) {
            this.field826.method4023((byte) -128);
        }
        class714 var4 = this.field827;
        synchronized (this.field827) {
            this.field827.method4023((byte) -124);
            if (arg0 != 73) {
                this.method558((byte) 63, 14);
            }
        }
        class714 var5 = this.field828;
        synchronized (this.field828) {
            this.field828.method4023((byte) -128);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 131)
    public final void method556(int arg0, int arg1) {
        this.field829 = arg1;
        field808++;
        class714 var3 = this.field826;
        synchronized (this.field826) {
            this.field826.method4023((byte) -127);
        }
        class714 var4 = this.field827;
        synchronized (this.field827) {
            this.field827.method4023((byte) -16);
        }
        class714 var5 = this.field828;
        synchronized (this.field828) {
            this.field828.method4023((byte) -125);
        }
        if (arg0 < 54) {
            this.field811 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)V", line = 151)
    public final void method557(int arg0, int arg1) {
        this.field813 = new class714(arg0);
        int var3 = 95 % ((arg1 - 60) / 57);
        field817++;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)Lhba;", line = 171)
    public final class10 method558(byte arg0, int arg1) {
        field810++;
        class714 var3 = this.field813;
        class10 var4;
        synchronized (this.field813) {
            var4 = (class10) this.field813.method4022((long) arg1, (byte) 124);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field819;
        byte[] var7;
        synchronized (this.field819) {
            int var6 = -83 / ((arg0 - 74) / 34);
            var7 = this.field819.method2100(class331.method2160(arg1, (byte) 11), (byte) 112, class52.method318(0, arg1));
        }
        class10 var8 = new class10();
        var8.field236 = arg1;
        var8.field157 = this;
        if (var7 != null) {
            var8.method65(new class675(var7), (byte) -45);
        }
        var8.method70(5);
        if (var8.field167) {
            var8.field228 = 0;
            var8.field161 = false;
        }
        if (!this.field818 && var8.field218) {
            var8.field142 = null;
            var8.field219 = null;
        }
        class714 var9 = this.field813;
        synchronized (this.field813) {
            this.field813.method4018((byte) 126, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 228)
    public static void method559(boolean arg0) {
        if (!arg0) {
            field815 = null;
            field812 = null;
            field823 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lsaa;IZLfp;Lfp;)V", line = 258)
    public class67(class326 arg0, int arg1, boolean arg2, class323 arg3, class323 arg4) {
        this.field818 = arg2;
        this.field819 = arg3;
        this.field811 = arg4;
        if (this.field819 != null) {
            int var6 = this.field819.method2098((byte) 20) - 1;
            this.field819.method2084(var6, 0);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class366 {

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    private int field4721 = -1;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    private int field4722 = 0;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "Lfh;")
    private class653 field4712 = new class653();

    @OriginalMember(owner = "client!uia", name = "r", descriptor = "Z")
    public boolean field4728 = false;

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    private int field4723;

    @OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
    private int field4725;

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "[[I")
    private int[][] field4719;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "[Llb;")
    private class545[] field4713;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "[I")
    public static int[] field4714 = new int[1];

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "Z")
    public static boolean field4718 = true;

    @OriginalMember(owner = "client!uia", name = "q", descriptor = "I")
    public static int field4727 = -1;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!uia", name = "p", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!uia", name = "n", descriptor = "Lhu;")
    public static class134 field4724;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "([BB)[B", line = 4)
    public static final byte[] method2113(byte[] arg0, byte arg1) {
        field4717++;
        class461 var2 = new class461(arg0);
        if (arg1 != -46) {
            field4714 = null;
        }
        int var3 = var2.method2600((byte) -128);
        int var4 = var2.method2622(-539564808);
        if (var4 < 0 || class27.field485 != 0 && var4 > class27.field485) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2573(var5, (byte) -77, var4, 0);
            return var5;
        } else {
            int var6 = var2.method2622(arg1 - 539564762);
            if (var6 < 0 || class27.field485 != 0 && var6 > class27.field485) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class371.method2137(var7, var6, arg0, var4, 9);
            } else {
                class329 var8 = class707.field9796;
                synchronized (class707.field9796) {
                    class707.field9796.method1909(var2, var7, 21283);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V", line = 66)
    public static void method2114(byte arg0) {
        if (arg0 != 61) {
            method2114((byte) 112);
        }
        field4714 = null;
        field4724 = null;
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)[[I", line = 78)
    public final int[][] method2115(int arg0) {
        field4716++;
        if (this.field4725 != this.field4723) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4723; var2++) {
            this.field4713[var2] = class499.field7034;
        }
        if (arg0 != -14453) {
            field4711 = -48;
        }
        return this.field4719;
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(III)V", line = 222)
    public class366(int arg0, int arg1, int arg2) {
        this.field4723 = arg0;
        this.field4725 = arg1;
        this.field4719 = new int[this.field4723][arg2];
        this.field4713 = new class545[this.field4725];
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IB)[I", line = 128)
    public final int[] method2116(int arg0, byte arg1) {
        field4726++;
        if (arg1 <= 44) {
            field4711 = -89;
        }
        if (this.field4725 == this.field4723) {
            this.field4728 = this.field4713[arg0] == null;
            this.field4713[arg0] = class499.field7034;
            return this.field4719[arg0];
        } else if (this.field4723 == 1) {
            this.field4728 = this.field4721 != arg0;
            this.field4721 = arg0;
            return this.field4719[0];
        } else {
            class545 var3 = this.field4713[arg0];
            if (var3 == null) {
                this.field4728 = true;
                if (this.field4722 >= this.field4723) {
                    class545 var4 = (class545) this.field4712.method3658(-8718);
                    var3 = new class545(arg0, var4.field7599);
                    this.field4713[var4.field7601] = null;
                    var4.method1175(-2);
                } else {
                    var3 = new class545(arg0, this.field4722);
                    this.field4722++;
                }
                this.field4713[arg0] = var3;
            } else {
                this.field4728 = false;
            }
            this.field4712.method3659(false, var3);
            return this.field4719[var3.field7599];
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V", line = 200)
    public final void method2117(int arg0) {
        for (int var2 = arg0; var2 < this.field4723; var2++) {
            this.field4719[var2] = null;
        }
        field4720++;
        this.field4719 = null;
        this.field4713 = null;
        this.field4712.method3668(0);
        this.field4712 = null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Z")
    public boolean field318 = true;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field324 = new Object();

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public int field325 = 0;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "[I")
    public int[] field326 = new int[500];

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[I")
    public int[] field328 = new int[500];

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
    public static int[] field319 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field323 = 0;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Z")
    public static boolean field327 = false;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field320;

    @OriginalMember(owner = "client!lj", name = "run", descriptor = "()V")
    public final void run() {
        field316++;
        while (this.field318) {
            Object var1 = this.field324;
            synchronized (this.field324) {
                if (this.field325 < 500) {
                    this.field328[this.field325] = class91.field1438;
                    this.field326[this.field325] = class203.field3065;
                    this.field325++;
                }
            }
            class250.method1643(1, 50L);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BB)[B")
    public static final byte[] method163(byte[] arg0, byte arg1) {
        field322++;
        class248 var2 = new class248(arg0);
        if (arg1 >= -106) {
            method163((byte[]) null, (byte) 20);
        }
        int var3 = var2.method1593((byte) 27);
        int var4 = var2.method1576(-17672);
        if (var4 < 0 || !(class59.field949 == 0 || class59.field949 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1579(28172, var5, 0, var4);
            return var5;
        } else {
            int var6 = var2.method1576(-17672);
            if (var6 < 0 || !(class59.field949 == 0 || var6 <= class59.field949)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class138.method848(var7, var6, arg0, var4, 9);
            } else {
                class295.field4680.method1400(true, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method164(byte arg0) {
        field319 = null;
        field320 = null;
        if (arg0 != -49) {
            method164((byte) -49);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static final void method165(int arg0) {
        if (arg0 != -3166) {
            method163((byte[]) null, (byte) -85);
        }
        field315++;
        class241.field3604.method1775(27147);
    }
}

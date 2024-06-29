import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class28 extends class297 {

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    private int field452 = 3216;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    private int field454 = 3216;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "[I")
    private int[] field451 = new int[3];

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    private int field458 = 4096;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field455 = new String[8];

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "Lpk;")
    public static class120 field456;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "[Lwd;")
    public static class88[] field445;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 10)
    public static void method244(int arg0) {
        int var1 = 21 / ((arg0 - 27) / 51);
        field456 = null;
        field445 = null;
        field455 = null;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 21)
    private final void method245(byte arg0) {
        field448++;
        double var2 = Math.cos((double) ((float) this.field452 / 4096.0F));
        if (arg0 != -91) {
            method244(-31);
        }
        this.field451[0] = (int) (var2 * Math.sin((double) ((float) this.field454 / 4096.0F)) * 4096.0D);
        this.field451[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field454 / 4096.0F)));
        this.field451[2] = (int) (Math.sin((double) ((float) this.field452 / 4096.0F)) * 4096.0D);
        int var4 = this.field451[2] * this.field451[2] >> 12;
        int var5 = this.field451[1] * this.field451[1] >> 12;
        int var6 = this.field451[0] * this.field451[0] >> 12;
        int var7 = (int) (Math.sqrt((double) (var6 + var5 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field451[0] = (this.field451[0] << 12) / var7;
            this.field451[2] = (this.field451[2] << 12) / var7;
            this.field451[1] = (this.field451[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIILhn;I)V", line = 51)
    public static final void method246(boolean arg0, int arg1, int arg2, int arg3, class38 arg4, int arg5) {
        field446++;
        if (class113.field1828 >= 50 || arg4 == null || arg4.field582 == null || arg2 >= arg4.field582.length || arg4.field582[arg2] == null) {
            return;
        }
        int var6 = arg4.field582[arg2][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xFF) >> 5;
        int var9 = var6 & 0x1F;
        if (arg4.field582[arg2].length > 1) {
            int var10 = (int) (Math.random() * (double) arg4.field582[arg2].length);
            if (var10 > 0) {
                var7 = arg4.field582[arg2][var10];
            }
        }
        if (var9 == 0) {
            if (arg0) {
                class188.method1360(var8, 0, 255, var7, -1);
            }
        } else if (class22.field398 != 0) {
            int var11 = (arg3 - 64) / 128;
            int var12 = (arg5 - 64) / 128;
            class90.field1445[class113.field1828] = var7;
            client.field4120[class113.field1828] = var8;
            class200.field3068[class113.field1828] = 0;
            class226.field3502[class113.field1828] = null;
            class180.field2869[class113.field1828] = arg1;
            class308.field4878[class113.field1828] = (var11 << 16) + (var12 << 8) + var9;
            class113.field1828++;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)[I", line = 104)
    public final int[] method173(int arg0, boolean arg1) {
        field457++;
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int var4 = class149.field2426 * this.field458 >> 12;
            int[] var5 = this.method2109(arg0 - 1 & class175.field2801, (byte) 59, 0);
            int[] var6 = this.method2109(arg0, (byte) 108, 0);
            int[] var7 = this.method2109(class175.field2801 & arg0 + 1, (byte) 56, 0);
            for (int var8 = 0; var8 < class31.field491; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class257.field3813] - var6[class257.field3813 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class323.field5053[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field451[2] * var15 >> 12;
                int var18 = this.field451[0] * var14 >> 12;
                int var19 = this.field451[1] * var16 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return arg1 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 247)
    public class28() {
        super(1, true);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 189)
    public final void method247(byte arg0) {
        field447++;
        if (arg0 != 68) {
            method244(37);
        }
        this.method245((byte) -91);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILaj;)V", line = 201)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field450++;
        if (arg1 != 255) {
            this.field452 = 30;
        }
        if (arg0 == 0) {
            this.field458 = arg2.method56(arg1 ^ 0x4C63);
        } else if (arg0 == 1) {
            this.field454 = arg2.method56(arg1 + 19357);
        } else if (arg0 == 2) {
            this.field452 = arg2.method56(19612);
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V", line = 252)
    public static final void method248(int arg0) {
        if (arg0 <= 53) {
            field445 = (class88[]) null;
        }
        field449++;
        Container var1;
        if (class244.field3646 != null) {
            var1 = class244.field3646;
        } else if (class139.field2247 == null) {
            var1 = class92.field1484.field1037;
        } else {
            var1 = class139.field2247;
        }
        class1.field46 = var1.getSize().width;
        class294.field4625 = var1.getSize().height;
        if (class139.field2247 == var1) {
            Insets var2 = class139.field2247.getInsets();
            class294.field4625 -= var2.top + var2.bottom;
            class1.field46 -= var2.right + var2.left;
        }
        if (class101.method823(-41) < 2) {
            class142.field2301 = 0;
            class211.field3314 = 765;
            class299.field4789 = (class1.field46 - 765) / 2;
            class338.field5219 = 503;
        } else {
            class299.field4789 = 0;
            class338.field5219 = class294.field4625;
            class211.field3314 = class1.field46;
            class142.field2301 = 0;
        }
        if (class162.field2623) {
            class162.method1220(class211.field3314, class338.field5219);
        }
        class334.field5197.setSize(class211.field3314, class338.field5219);
        if (class139.field2247 == var1) {
            Insets var3 = class139.field2247.getInsets();
            class334.field5197.setLocation(class299.field4789 + var3.left, class142.field2301 + var3.top);
        } else {
            class334.field5197.setLocation(class299.field4789, class142.field2301);
        }
        if (class168.field2707 != -1) {
            class281.method1978(-1681, true);
        }
        class310.method2192(-87);
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V", line = 316)
    public static final void method249(int arg0) {
        field460++;
        if (!class315.field4977) {
            return;
        }
        class266 var1 = class77.method604(class201.field3076, class22.field392, arg0 ^ 0x284B);
        if (var1 != null && var1.field4013 != null) {
            class150 var2 = new class150();
            var2.field2450 = var1.field4013;
            var2.field2458 = var1;
            class172.method1280(var2, (byte) 12);
        }
        class220.field3430 = arg0;
        class315.field4977 = false;
        class280.method1971((byte) 101, var1);
    }
}

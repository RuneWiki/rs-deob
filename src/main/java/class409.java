import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class409 extends Canvas {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field6127;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Z")
    public static boolean field6126 = false;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "[Lso;")
    public static class311[] field6130;

    @OriginalMember(owner = "client!ik", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void update(Graphics arg0) {
        this.field6127.update(arg0);
        field6128++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 12)
    public static void method2662(byte arg0) {
        if (arg0 != 38) {
            field6126 = false;
        }
        field6130 = null;
    }

    @OriginalMember(owner = "client!ik", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 22)
    public final void paint(Graphics arg0) {
        this.field6127.paint(arg0);
        field6131++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)Z", line = 38)
    public static final boolean method2663(boolean arg0) {
        for (int var1 = class57.field821; var1 < class137.field1817; var1++) {
            class10[][] var2 = class343.field5032[var1];
            for (int var3 = -class27.field480; var3 <= 0; var3++) {
                int var4 = class308.field4398 + var3;
                int var5 = class308.field4398 - var3;
                if (var4 >= class398.field5961 || var5 < class110.field1519) {
                    for (int var6 = -class27.field480; var6 <= 0; var6++) {
                        int var7 = class383.field5729 + var6;
                        int var8 = class383.field5729 - var6;
                        if (var4 >= class398.field5961) {
                            if (var7 >= class349.field5181) {
                                class10 var9 = var2[var4][var7];
                                if (var9 != null && var9.field105) {
                                    class444.field6471 = arg0;
                                    class30.field514.method264((byte) 121, var9);
                                    class30.field514.method271(-42);
                                }
                            }
                            if (var8 < class265.field3905) {
                                class10 var10 = var2[var4][var8];
                                if (var10 != null && var10.field105) {
                                    class444.field6471 = arg0;
                                    class30.field514.method264((byte) 121, var10);
                                    class30.field514.method271(-85);
                                }
                            }
                        }
                        if (var5 < class110.field1519) {
                            if (var7 >= class349.field5181) {
                                class10 var11 = var2[var5][var7];
                                if (var11 != null && var11.field105) {
                                    class444.field6471 = arg0;
                                    class30.field514.method264((byte) 121, var11);
                                    class30.field514.method271(114);
                                }
                            }
                            if (var8 < class265.field3905) {
                                class10 var12 = var2[var5][var8];
                                if (var12 != null && var12.field105) {
                                    class444.field6471 = arg0;
                                    class30.field514.method264((byte) 121, var12);
                                    class30.field514.method271(124);
                                }
                            }
                        }
                        if (class16.field181 == 0) {
                            if (class164.field2130) {
                                class30.field514.method273(24, (byte) -127);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 146)
    public class409(Component arg0) {
        this.field6127 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 159)
    public static final void method2664(int arg0) {
        class436.field6400.method212(-95);
        field6129++;
        int var1 = -94 / ((arg0 - 37) / 42);
    }
}

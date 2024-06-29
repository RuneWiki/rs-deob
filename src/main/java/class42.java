import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class42 extends Canvas {

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field514;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Ljava/lang/String;")
    public static String field515 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lhb;")
    public static class318 field507 = new class318(100);

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lhb;")
    public static class318 field516 = new class318(64);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(JZ)V", line = 4)
    public static final void method279(long arg0, boolean arg1) {
        field509++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class247.field3687; var3++) {
            if (class212.field3220[var3] == arg0) {
                class106.field1655++;
                class247.field3687--;
                for (int var4 = var3; var4 < class247.field3687; var4++) {
                    class212.field3220[var4] = class212.field3220[var4 + 1];
                    class205.field3097[var4] = class205.field3097[var4 + 1];
                }
                class315.field4761 = class225.field3423;
                class234.field3507.method28(95, arg1);
                class234.field3507.method1816(arg0, 21054);
                break;
            }
        }
        if (arg1) {
            field506 = -9;
        }
    }

    @OriginalMember(owner = "client!ra", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 47)
    public final void paint(Graphics arg0) {
        this.field514.paint(arg0);
        field510++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 56)
    public static final void method280(int arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class190.field2829 - 1); var2++) {
                if (class201.field2998[var2] < 1000 && class201.field2998[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class180.field2686[var2];
                    class180.field2686[var2] = class180.field2686[var2 + 1];
                    class180.field2686[var2 + 1] = var3;
                    String var4 = class307.field4677[var2];
                    class307.field4677[var2] = class307.field4677[var2 + 1];
                    class307.field4677[var2 + 1] = var4;
                    int var5 = class193.field2893[var2];
                    class193.field2893[var2] = class193.field2893[var2 + 1];
                    class193.field2893[var2 + 1] = var5;
                    int var6 = class178.field2633[var2];
                    class178.field2633[var2] = class178.field2633[var2 + 1];
                    class178.field2633[var2 + 1] = var6;
                    int var7 = class155.field2322[var2];
                    class155.field2322[var2] = class155.field2322[var2 + 1];
                    class155.field2322[var2 + 1] = var7;
                    short var8 = class201.field2998[var2];
                    class201.field2998[var2] = class201.field2998[var2 + 1];
                    class201.field2998[var2 + 1] = var8;
                    long var9 = class13.field153[var2];
                    class13.field153[var2] = class13.field153[var2 + 1];
                    class13.field153[var2 + 1] = var9;
                }
            }
        }
        field512++;
        if (arg0 <= 45) {
            method281((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ra", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 120)
    public final void update(Graphics arg0) {
        this.field514.update(arg0);
        field505++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 134)
    public static void method281(byte arg0) {
        field516 = null;
        field515 = null;
        if (arg0 != -121) {
            field507 = (class318) null;
        }
        field507 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)I", line = 154)
    public static final int method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 15726) {
            return 84;
        }
        int var7 = arg4 & 0x3;
        field511++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg2;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg3;
        } else {
            return 8 - arg1 - arg2;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 186)
    public class42(Component arg0) {
        this.field514 = arg0;
    }
}

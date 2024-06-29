import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class411 extends Canvas {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field5889;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Llm;")
    public static class291 field5890 = new class291(16);

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "[I")
    public static int[] field5894 = new int[1000];

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field5897 = 0;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZ)Z", line = 3)
    public static boolean method2600(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jm", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 10)
    public final void update(Graphics arg0) {
        field5896++;
        this.field5889.update(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public class411(Component arg0) {
        this.field5889 = arg0;
    }

    @OriginalMember(owner = "client!jm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 39)
    public final void paint(Graphics arg0) {
        field5898++;
        this.field5889.paint(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)Z", line = 47)
    public static final boolean method2601(int arg0, int arg1) {
        field5895++;
        if (arg1 == 15 || arg1 == 12 || arg1 == 60 || arg1 == 2 || arg1 == 46) {
            return true;
        } else if (arg1 == 30 || arg1 == 1007) {
            return true;
        } else {
            if (arg0 != -3) {
                field5894 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 65)
    public static final void method2602(int arg0) {
        class15 var1 = class441.field6313;
        synchronized (class441.field6313) {
            class441.field6313.method102((byte) -105);
        }
        field5892++;
        class15 var2 = class293.field4241;
        synchronized (class293.field4241) {
            class293.field4241.method102((byte) -125);
        }
        if (arg0 < 120) {
            field5897 = 23;
        }
        class125 var3 = class356.field5154;
        synchronized (class356.field5154) {
            class356.field5154.method754(0);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 84)
    public static final void method2603(byte arg0) {
        field5893++;
        int var1 = class439.field6265.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class439.field6265[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class150.field2255; var4++) {
                    if (class379.field5391[var4] == class199.field2844[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class379.field5391[class150.field2255] = class199.field2844[var2];
                    var3 = class150.field2255++;
                }
                class130 var5 = new class130(class439.field6265[var2]);
                int var6 = 0;
                while (class439.field6265[var2].length > var5.field1880 && var6 < 511 && class229.field3396 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method798(false);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class199.field2844[var2] >> 8) * 64 + var10 - class306.field4459;
                    int var13 = (class199.field2844[var2] & 0xFF) * 64 + var11 - class342.field4959;
                    class346 var14 = class171.method1222(var5.method798(false), 127);
                    if (class442.field6317[var7] == null && (var14.field5042 & 0x1) > 0 && class40.field558 == var9 && var12 >= 0 && class80.field1034 > var14.field5008 + var12 && var13 >= 0 && class381.field5414 > (var14.field5008 + var13)) {
                        class442.field6317[var7] = new class446();
                        class442.field6317[var7].field4514 = var7;
                        class446 var15 = class442.field6317[var7];
                        class431.field6169[class229.field3396++] = var7;
                        var15.field4542 = class34.field434;
                        var15.method2781(var14, (byte) 120);
                        var15.method2095((byte) 64, var15.field6375.field5008);
                        var15.field4568 = var15.field6375.field5038 << 3;
                        if (var15.field4568 == 0) {
                            var15.method2092(0, 0);
                        } else {
                            var15.method2092((var15.field6375.field5017 + 4 & 0xE6E00007) << 11, 0);
                        }
                        var15.method2086(var12, (byte) -77, var9, true, var15.method773((byte) 68), var13);
                    }
                }
            }
        }
        if (arg0 != 58) {
            method2602(-13);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 176)
    public static void method2604(boolean arg0) {
        field5894 = null;
        field5890 = null;
        if (!arg0) {
            field5894 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Z", line = 188)
    public static final boolean method2605(byte arg0) {
        if (arg0 <= 71) {
            method2601(-6, -118);
        }
        field5891++;
        return class214.field3022 != 0 || class316.field4628 >= 2;
    }
}

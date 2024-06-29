import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class364 {

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    private int field5240;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!qu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5238++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)B")
    public static final byte method2230(int arg0, int arg1, int arg2) {
        field5239++;
        if (arg2 > -125) {
            method2231(99);
        }
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(II)V")
    public class364(int arg0, int arg1) {
        this.field5240 = arg0;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public static final void method2231(int arg0) {
        field5236++;
        if (arg0 != 255) {
            method2231(77);
        }
        int var1 = class184.field2800.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class184.field2800[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class213.field3131; var4++) {
                    if (class28.field254[var4] == class256.field3741[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class28.field254[class213.field3131] = class256.field3741[var2];
                    var3 = class213.field3131++;
                }
                class428 var5 = new class428(class184.field2800[var2]);
                int var6 = 0;
                while (var5.field6221 < class184.field2800[var2].length && var6 < 511 && class567.field8409 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2620(103);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FC2) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class256.field3741[var2] >> 8) * 64 + var10 - class584.field8677;
                    int var13 = (class256.field3741[var2] & 0xFF) * 64 + var11 - class424.field6061;
                    class429 var14 = class369.field5329.method1783(arg0 ^ 0xFFFFFF00, var5.method2620(126));
                    class234 var15 = (class234) class627.field9185.method1333((long) var7, false);
                    if (var15 == null && (var14.field6285 & 0x1) > 0 && class97.field1205 == var9 && var12 >= 0 && class35.field399 > var14.field6234 + var12 && var13 >= 0 && var14.field6234 + var13 < class382.field5586) {
                        class383 var16 = new class383();
                        var16.field1053 = var7;
                        class234 var17 = new class234(var16);
                        class627.field9185.method1341(var17, (byte) -93, (long) var7);
                        class579.field8530[class350.field5086++] = var17;
                        class25.field230[class567.field8409++] = var7;
                        var16.field1022 = class576.field8505;
                        var16.method2322(var14, -31902);
                        var16.method508(20060, var16.field5601.field6234);
                        var16.field1059 = var16.field5601.field6263 << 3;
                        var16.method502(var16.field5601.field6282 + 4 << 11 & 0x3AF7, true, false);
                        var16.method2321(var9, var13, var12, var16.method514(0), 0, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)I")
    public final int method2232(int arg0) {
        field5241++;
        if (arg0 > -112) {
            this.toString();
        }
        return this.field5240;
    }
}

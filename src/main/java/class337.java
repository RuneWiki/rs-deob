import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class337 {

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field4791 = 0;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Llg;")
    public static class237 field4789 = new class237(260);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "[I")
    public static int[] field4796 = new int[4096];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lon;")
    public static class184 field4795;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Ltq;")
    public static class376 field4792;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[[Z")
    public static boolean[][] field4793;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static void method2169(boolean arg0) {
        field4792 = null;
        field4796 = null;
        field4793 = null;
        field4789 = null;
        field4795 = null;
        if (!arg0) {
            field4792 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2170(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field4788++;
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLrd;)V")
    public static final void method2171(byte arg0, class185 arg1) {
        class23.field289 = 3;
        field4790++;
        class332.method2148((byte) 84, true);
        class414.field5947 = true;
        class388.field5479 = 0;
        class347.field4921 = 1;
        class332.field4706 = true;
        class355.field4999 = 127;
        class271.field3838 = true;
        class141.field1739 = 2;
        class18.field210 = true;
        class286.field4013 = true;
        class20.field265 = true;
        class408.field5877 = 0;
        class148.field1815 = 0;
        class374.field5256 = 0;
        class33.field381 = true;
        class272.field3859 = true;
        class94.field1134 = true;
        class401.field5730 = 127;
        class334.field4729 = 255;
        class254.field3656 = true;
        if (class268.field3812 < 96) {
            class366.method2339(0, true);
        } else {
            class366.method2339(2, true);
        }
        class140.field1735 = 0;
        if (arg0 <= 6) {
            return;
        }
        class222.field3117 = true;
        class156.field1916 = true;
        class433.field6227 = 0;
        class212.field3020 = false;
        class140.field1736 = 2;
        class374.field5254 = false;
        class223.field3135 = class180.field2471 == 1 ? 2 : 4;
        class77.field906 = false;
        class249.field3558 = 2;
        class287 var2 = null;
        try {
            class315 var3 = arg1.method1256((byte) -81);
            while (var3.field4498 == 0) {
                class150.method907(1L, (byte) -32);
            }
            if (var3.field4498 == 1) {
                var2 = (class287) var3.field4497;
                byte[] var4 = new byte[(int) var2.method1876(13136)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1875(var4.length - var5, -10022, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class369.method2352(-5707, new class236(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1877(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLjava/lang/String;Z)I")
    public static final int method2172(int arg0, boolean arg1, String arg2, boolean arg3) {
        field4787++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = arg3;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}

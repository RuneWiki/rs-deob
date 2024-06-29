import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class336 extends class379 {

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Llja;")
    public static class744 field4152 = new class744(55, 3);

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public int field4151;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "Lbn;")
    public class468 field4150;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "Llja;")
    public class744 field4158;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZZLkaa;B)V")
    public static final void method1989(boolean arg0, boolean arg1, class52 arg2, byte arg3) {
        field4155++;
        int var4 = arg2.field713;
        int var5 = (int) arg2.field4809;
        arg2.method2219(13630);
        if (arg0) {
            class553.method3245(var4, 48);
        }
        class526.method3145(-126, var4);
        if (arg3 <= 79) {
            method1991((byte) -55);
        }
        class620 var6 = class479.method2848(var5, (byte) -43);
        if (var6 != null) {
            class576.method3330(var6, -1);
        }
        class448.method2639((byte) -80);
        if (!arg1 && class131.field1615 != -1) {
            class314.method1853(class131.field1615, 1, -74);
        }
        class120 var7 = new class120(class728.field10205);
        for (class52 var8 = (class52) var7.method938(16); var8 != null; var8 = (class52) var7.method937(-1)) {
            if (!var8.method2221(8763)) {
                var8 = (class52) var7.method938(16);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field711 == 3) {
                int var9 = (int) var8.field4809;
                if ((var9 >>> 16) == var4) {
                    method1989(true, arg1, var8, (byte) 124);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Z")
    public static final boolean method1990(int arg0, int arg1) {
        field4154++;
        int var2 = -119 % ((27 - arg1) / 60);
        return arg0 == 49 || arg0 == 5 || arg0 == 1003 || arg0 == 45 || arg0 == 17;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V")
    public static void method1991(byte arg0) {
        int var1 = -54 % ((arg0 + 37) / 45);
        field4152 = null;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)V")
    public final void method1992(byte arg0) {
        field4156++;
        if (class137.field1724 < class313.field3859.length) {
            class313.field3859[class137.field1724++] = this;
            if (arg0 != 104) {
                this.field4153 = -98;
            }
        }
    }
}

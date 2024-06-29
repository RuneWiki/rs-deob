import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class285 extends class513 {

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Lnt;", line = 3)
    public static final class141 method1701(int arg0, int arg1, int arg2) {
        field3768++;
        class141 var3 = new class141();
        var3.field1940 = -1;
        var3.field1945 = arg2 + 5 + 1;
        var3.field1949 = -1;
        if (arg0 == -6169) {
            var3.field1960 = arg1 + 1 + 5;
            var3.field1944 = new int[var3.field1945][var3.field1960];
            var3.method922(-121);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZII)V", line = 25)
    public static final void method1702(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3769++;
        int var5 = class261.field3567;
        int var6 = class463.field6340;
        if (class264.field3595) {
            var5 += class468.method2788(arg2);
            var6 += class142.method934((byte) -88);
        }
        if (class352.field4547 == 1) {
            class21 var7 = class519.field7238[class751.field10443 / 100];
            var7.method101(var5 - 8, var6 + -8);
            class217.method1422(var5 + var7.method116() - 8, var7.method108() + var6 + -8, -112, var5 - 8, var6 - 8);
        }
        if (class352.field4547 == 2) {
            class21 var8 = class519.field7238[(class751.field10443 / 100) + 4];
            var8.method101(var5 - 8, var6 + -8);
            class217.method1422(var5 + var8.method116() - 8, var8.method108() + var6 + -8, -103, var5 - 8, var6 + -8);
        }
        class193.method1279(arg2);
        if (arg2) {
            method1702(124, 104, false, -61, -26);
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V", line = 63)
    public class285() {
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V", line = 65)
    public class285(int arg0) {
        this.field3770 = arg0;
    }
}

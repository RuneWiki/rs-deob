import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static final void method12(boolean arg0) {
        class153.field2157 = null;
        if (!arg0) {
            field32++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lfn;")
    public static final class617 method13(int arg0) {
        field33++;
        if (arg0 != -21191) {
            method13(105);
        }
        return class416.field6148;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method14(int arg0, int arg1, String arg2) {
        if (arg0 == 0) {
            class332.field4821 = class98.method701(class466.field6715, class28.field492, class410.field6110, 0, 1, class335.field4872.field9485 * 2);
            if (arg2 != null) {
                class332.field4821.method646(0);
                class606 var3 = class62.method385(0, false, class410.field6111, class283.field3785);
                class393 var4 = class332.field4821.method684(var3, class616.method3513(class595.field8616, class410.field6111, 0), true);
                class549.method3204(false);
                class453.method2656(0, var4, arg2, class332.field4821, true, var3);
            }
        } else {
            class98 var5 = null;
            if (arg2 != null) {
                var5 = class98.method701(class466.field6715, class28.field492, class410.field6110, 0, 1, 0);
                var5.method646(0);
                class606 var6 = class62.method385(0, false, class410.field6111, class283.field3785);
                class393 var7 = var5.method684(var6, class616.method3513(class595.field8616, class410.field6111, 0), true);
                class549.method3204(false);
                class453.method2656(0, var7, arg2, var5, true, var6);
            }
            try {
                class332.field4821 = class98.method701(class466.field6715, class28.field492, class410.field6110, arg0, 1, class335.field4872.field9485 * 2);
                if (arg2 != null) {
                    var5.method646(0);
                    class606 var8 = class62.method385(0, false, class410.field6111, class283.field3785);
                    class393 var9 = var5.method684(var8, class616.method3513(class595.field8616, class410.field6111, 0), true);
                    class549.method3204(false);
                    class453.method2656(0, var9, arg2, var5, true, var8);
                }
                if (class332.field4821.method686()) {
                    boolean var10 = true;
                    try {
                        var10 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class698 var11;
                    if (var10) {
                        var11 = class332.field4821.method622(146800640);
                    } else {
                        var11 = class332.field4821.method622(104857600);
                    }
                    class332.field4821.method648(var11);
                }
            } catch (Throwable var14) {
                arg0 = 0;
                class332.field4821 = class98.method701(class466.field6715, class28.field492, class410.field6110, 0, 1, 0);
            }
            if (var5 != null) {
                try {
                    var5.method623((byte) -110);
                } catch (Throwable var12) {
                }
            }
        }
        field34++;
        class62.field996 = arg0;
        if (arg1 != 25474) {
            return;
        }
        class117.method868(-94);
        class332.field4821.method659(32);
        class242.field3215 = class332.field4821.method717();
        class510.field7197 = class332.field4821.method717();
        class42.method240((byte) 30);
        class332.field4821.method612(!class335.field4872.field9484);
        if (class332.field4821.method674()) {
            class379.method2352(class335.field4872.field9473, arg1 - 25475);
        }
        class505.method2874(false, class72.field1144 >> 3, class668.field9444 >> 3, class332.field4821);
        class456.method2668(255);
        class326.field4730 = false;
        class139.field2021 = null;
        class239.field3144 = true;
    }
}

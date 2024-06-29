import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class29 extends class134 {

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public int field871 = 1000;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field876 = -1;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field880 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "Lwd;")
    public static class150 field885 = class2.method9(true, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field882 = -1;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "Lff;")
    public static class42 field884;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lwd;")
    public static final class150 method239(int arg0, int arg1) {
        field872++;
        if (arg0 != 1000) {
            field873 = -109;
        }
        return class144.method1085(10, false, (byte) 45, arg1);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)Lbe;")
    public class13 method12(boolean arg0) {
        if (!arg0) {
            method239(-67, -84);
        }
        field878++;
        return null;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
    public static final void method240(byte arg0) {
        class65.field1647 = 0;
        if (arg0 != -53) {
            field876 = -3;
        }
        class143.field3451.field3601 = 0;
        class73.field1839 = 0;
        class121.field2783.field3601 = 0;
        class76.field1870 = 0;
        class125.field2900 = 0;
        class142.field3442 = 0;
        class10.field234 = -1;
        class11.field277 = -1;
        class145.field3517 = false;
        class105.field2369 = -1;
        class42.field1105 = 0;
        field881++;
        class94.field2193 = -1;
        for (int var1 = 0; var1 < class137.field3217.length; var1++) {
            if (class137.field3217[var1] != null) {
                class137.field3217[var1].field2931 = -1;
            }
        }
        for (int var2 = 0; var2 < class37.field1013.length; var2++) {
            if (class37.field1013[var2] != null) {
                class37.field1013[var2].field2931 = -1;
            }
        }
        class16.method118(arg0 ^ 0xFFFFFFCB);
        class11.method66(30, false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIII)V")
    public void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field877++;
        class13 var10 = this.method12(true);
        if (var10 != null) {
            this.field871 = var10.field871;
            var10.method97(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(B)V")
    public static void method241(byte arg0) {
        field885 = null;
        if (arg0 != -69) {
            method239(-96, 14);
        }
        field880 = null;
        field884 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method242(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class116) {
            class116 var2 = (class116) arg1;
            arg1 = var2.field2664;
            var3 = var2.field2666 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        field874++;
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 != 27313) {
            method239(-114, 7);
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }
}

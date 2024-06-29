import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class139 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Lmv;")
    public static class295 field2024;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[Lsg;")
    public static class432[] field2021;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V", line = 5)
    public static final void method980(int arg0, int arg1, int arg2) {
        if (~class177.field2475 != arg0) {
            if (arg1 >= 0) {
                class58.field952[arg1] = arg2;
            } else {
                for (int var3 = 0; var3 < 16; var3++) {
                    class58.field952[var3] = arg2;
                }
            }
        }
        field2022++;
        class416.field6148.method3534(16, arg2, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 34)
    public static final void method981(int arg0) {
        if (arg0 == 0) {
            if (class281.field3735 == 2) {
                class466.field6718[0].method3954(class78.field1283[0]);
                class466.field6718[1].method3954(class78.field1283[1]);
            } else if (class281.field3735 == 3) {
                class466.field6718[0].method3954(class78.field1283[0]);
                class466.field6718[1].method3954(class78.field1283[1]);
                class466.field6718[2].method3954(class78.field1283[2]);
            } else {
                class466.field6718[0].method3954(class78.field1283[0]);
                class466.field6718[1].method3954(class78.field1283[1]);
                class466.field6718[2].method3954(class78.field1283[2]);
                class466.field6718[3].method3954(class78.field1283[3]);
            }
        } else if (arg0 == 1) {
            if (class281.field3735 == 2) {
                class466.field6718[0].method3954(class78.field1283[2]);
            } else if (class281.field3735 == 3) {
                class466.field6718[0].method3954(class78.field1283[3]);
                class466.field6718[1].method3954(class78.field1283[4]);
            } else {
                class466.field6718[0].method3954(class78.field1283[4]);
                class466.field6718[1].method3954(class78.field1283[5]);
                class466.field6718[2].method3954(class78.field1283[6]);
            }
        } else if (arg0 == 2) {
            if (class281.field3735 == 2) {
                class466.field6718[0].method3954(class78.field1283[3]);
                return;
            }
            if (class281.field3735 == 3) {
                class466.field6718[0].method3954(class78.field1283[5]);
                return;
            }
            class466.field6718[0].method3954(class78.field1283[7]);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(II)V", line = 103)
    public class139(int arg0, int arg1) {
        this.field2018 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "toString", descriptor = "()Ljava/lang/String;", line = 114)
    public final String toString() {
        field2020++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 122)
    public static void method982(byte arg0) {
        field2021 = null;
        if (arg0 < 74) {
            method982((byte) 61);
        }
        field2024 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 135)
    public static final String method983(int arg0, Throwable arg1) throws IOException {
        field2019++;
        String var3;
        if (arg1 instanceof class198) {
            class198 var2 = (class198) arg1;
            var3 = var2.field2706 + " | ";
            arg1 = var2.field2707;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 != -1) {
            method980(-38, -119, 20);
        }
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class177 extends class159 {

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field2755 = 0;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public int field2767 = -1;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "[I")
    public static int[] field2766 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2768 = "flash3:";

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "[I")
    public static int[] field2773 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lmi;")
    public static class227 field2753 = new class227(128);

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field2775 = -1;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public int field2772;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "[[I")
    public static int[][] field2752;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V", line = 16)
    public static void method1243(int arg0) {
        field2753 = null;
        field2752 = (int[][]) null;
        int var1 = 73 % ((arg0 + 6) / 59);
        field2773 = null;
        field2768 = null;
        field2766 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Li;", line = 34)
    public static final class24 method1244(int arg0, byte arg1) {
        field2758++;
        class24 var2 = (class24) class154.field2492.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class322.field5298.method1504(arg0, true, 30);
        if (arg1 != -2) {
            return (class24) null;
        }
        class24 var4 = new class24();
        if (var3 != null) {
            var4.method212(-61, new class313(var3), arg0);
        }
        class154.field2492.method642(var4, (long) arg0, -123);
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Lle;", line = 68)
    public static final class137 method1245(byte arg0) {
        field2764++;
        if (arg0 != 32) {
            return (class137) null;
        }
        byte[] var1 = class105.field1522[0];
        int var2 = class94.field1379[0] * class322.field5289[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class201.field3085[class235.method1623(255, var1[var4])];
        }
        class137 var5 = new class137(class300.field4961, class96.field1400, class18.field228[0], class28.field419[0], class322.field5289[0], class94.field1379[0], var3);
        class167.method1164(false);
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V", line = 111)
    public static final void method1246(long arg0, int arg1) {
        if (arg1 != -32644) {
            field2774 = -69;
        }
        field2765++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class227.method1546(arg1 ^ 0x7F83, arg0 - 1L);
            class227.method1546(-1, 1L);
        } else {
            class227.method1546(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 132)
    public static final void method1247(int arg0) {
        field2757++;
        class37.field557.method651(0);
        class216.field3325.method651(arg0 ^ arg0);
        class16.field206.method651(0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[Ljb;)V", line = 157)
    public static final void method1248(int arg0, class226[] arg1) {
        class352.field5605[arg0] = arg1;
    }
}

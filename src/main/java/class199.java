import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class199 extends class644 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Luv;")
    public static class3 field2599 = new class3(29, 3);

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
    public static int[] field2600 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2601 = new BigInteger("9d2807361d7f8f77c012d7e92f3f469beb8e3a64629d2016a3346d6967aaaec9704c0cce71e2ff6d606780d0083f67f04536b019c8301eac2615c1a94330a4f9341d9d0687ceeb8acf773914b76f2e208f5498809ca7e54e0dd4c14ea45c76bcf9c8962ddbce4899fb7909c0a9eab07cbb62f19054ffe4a13b36f1d0724acc9421af2ab7c80229bb97286b7e70c208e1873fba5d3a279b7ecb8afdd1423417d7251bb4f1977601dca1ca0ae4bfd4211e3f0a3ccc98f377a271fbb790d9c07ba2495bb1081230ac49369373887092a1e1c8f38ecaf4b172ca9e6600362a82ecdc89579a98e3efd35c39954f42383959a9a414bae5977c346bbd2f08440fad4914430b57d4baccac64d00fd6e9d4bede27ae5526a2afdd63887ed24699aeb9398d86ebba7858f8d24e3dbceb565a3aa3b54e62920be50d4646c15a040537ce989a67f69d60b383f15b910f7ce1693657e4e0eff2ec3cee2a31bd921f6f982a53456e3b10356e002bed4a8a5eeb88db388b971888e9e2f2f5231ed651f7a76fab68b17c083063a34c1a9c9d6e7b5064740f2ce0372fa5df4933c8f12b14b9535371f9506f3cb3fd0e1a285fadfbca542cf898635b6db51e68d614177c181e306f76d94bbbc96ae87bae4e9d8ec342d1a4740b8c3ed389a22238cbce898f04483fbfd94ceeb9498867c32852079d0688e23605b9520d47a02928beed77638674bbdd", 16);

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
    public static int[] field2604 = new int[1000];

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lbn;")
    public static class371 field2603 = new class371(12, 0, 1, 0);

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "F")
    public static float field2602;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[[[Lrg;")
    public static class563[][][] field2605;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method1270(int arg0) {
        field2599 = null;
        field2604 = null;
        field2600 = null;
        field2605 = null;
        field2601 = null;
        if (arg0 != 10893) {
            method1270(-57);
        }
        field2603 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)[Ljs;")
    public static final class251[] method1271(byte arg0) {
        if (arg0 < 26) {
            method1272((byte) -128);
        }
        field2597++;
        return new class251[] { class17.field184, class17.field185, class17.field186, class17.field187, class17.field188, class17.field189, class17.field190, class17.field191, class17.field192, class17.field193, class17.field194, class17.field195, class17.field196, class17.field197 };
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Lraa;")
    public static final class625 method1272(byte arg0) {
        field2598++;
        if (class614.field8834 == null || class31.field483 == null) {
            return null;
        }
        for (class625 var1 = (class625) class31.field483.method1670((byte) -98); var1 != null; var1 = (class625) class31.field483.method1670((byte) 127)) {
            class297 var2 = class614.field8823.method1544(36, var1.field9044);
            if (var2 != null && var2.field3897 && var2.method1822((byte) 45, class614.field8828)) {
                return var1;
            }
        }
        if (arg0 > -89) {
            method1270(-124);
        }
        return null;
    }
}

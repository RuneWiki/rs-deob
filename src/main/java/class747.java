import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class747 extends class500 {
   @OriginalMember(
      owner = "client!pca",
      name = "nc",
      descriptor = "I"
   )
   private int field10961;
   @OriginalMember(
      owner = "client!pca",
      name = "cc",
      descriptor = "Z"
   )
   private boolean field10995;
   @OriginalMember(
      owner = "client!pca",
      name = "yc",
      descriptor = "I"
   )
   private int field10962;
   @OriginalMember(
      owner = "client!pca",
      name = "M",
      descriptor = "I"
   )
   private int field10996;
   @OriginalMember(
      owner = "client!pca",
      name = "jb",
      descriptor = "Z"
   )
   private boolean field11033;
   @OriginalMember(
      owner = "client!pca",
      name = "ec",
      descriptor = "Z"
   )
   private boolean field11002;
   @OriginalMember(
      owner = "client!pca",
      name = "mc",
      descriptor = "Z"
   )
   private boolean field11028;
   @OriginalMember(
      owner = "client!pca",
      name = "dc",
      descriptor = "I"
   )
   private int field10997;
   @OriginalMember(
      owner = "client!pca",
      name = "gb",
      descriptor = "I"
   )
   private int field11010;
   @OriginalMember(
      owner = "client!pca",
      name = "Cb",
      descriptor = "Lea;"
   )
   private class573 field10973;
   @OriginalMember(
      owner = "client!pca",
      name = "wb",
      descriptor = "Lil;"
   )
   private class7 field11011;
   @OriginalMember(
      owner = "client!pca",
      name = "ob",
      descriptor = "Lil;"
   )
   private class7 field11001;
   @OriginalMember(
      owner = "client!pca",
      name = "J",
      descriptor = "Lil;"
   )
   private class7 field10958;
   @OriginalMember(
      owner = "client!pca",
      name = "Hb",
      descriptor = "Lil;"
   )
   private class7 field11043;
   @OriginalMember(
      owner = "client!pca",
      name = "y",
      descriptor = "Luia;"
   )
   private class385 field11063;
   @OriginalMember(
      owner = "client!pca",
      name = "Cc",
      descriptor = "I"
   )
   private int field11008;
   @OriginalMember(
      owner = "client!pca",
      name = "vb",
      descriptor = "I"
   )
   private int field10978;
   @OriginalMember(
      owner = "client!pca",
      name = "xb",
      descriptor = "[I"
   )
   private int[] field10986;
   @OriginalMember(
      owner = "client!pca",
      name = "qc",
      descriptor = "[I"
   )
   private int[] field10951;
   @OriginalMember(
      owner = "client!pca",
      name = "kc",
      descriptor = "[I"
   )
   private int[] field11021;
   @OriginalMember(
      owner = "client!pca",
      name = "xc",
      descriptor = "[S"
   )
   private short[] field10966;
   @OriginalMember(
      owner = "client!pca",
      name = "bc",
      descriptor = "[I"
   )
   private int[] field10987;
   @OriginalMember(
      owner = "client!pca",
      name = "Q",
      descriptor = "[Ltu;"
   )
   private class370[] field10964;
   @OriginalMember(
      owner = "client!pca",
      name = "jc",
      descriptor = "[Lvga;"
   )
   private class94[] field11045;
   @OriginalMember(
      owner = "client!pca",
      name = "Lb",
      descriptor = "I"
   )
   private int field11042;
   @OriginalMember(
      owner = "client!pca",
      name = "db",
      descriptor = "[Lnb;"
   )
   private class319[] field10984;
   @OriginalMember(
      owner = "client!pca",
      name = "pb",
      descriptor = "[Lrja;"
   )
   private class116[] field10994;
   @OriginalMember(
      owner = "client!pca",
      name = "fb",
      descriptor = "[B"
   )
   private byte[] field10955;
   @OriginalMember(
      owner = "client!pca",
      name = "Gc",
      descriptor = "[F"
   )
   private float[] field11016;
   @OriginalMember(
      owner = "client!pca",
      name = "Tb",
      descriptor = "[S"
   )
   private short[] field10979;
   @OriginalMember(
      owner = "client!pca",
      name = "A",
      descriptor = "[S"
   )
   private short[] field11031;
   @OriginalMember(
      owner = "client!pca",
      name = "Ec",
      descriptor = "[S"
   )
   private short[] field11012;
   @OriginalMember(
      owner = "client!pca",
      name = "W",
      descriptor = "S"
   )
   private short field11052;
   @OriginalMember(
      owner = "client!pca",
      name = "cb",
      descriptor = "[S"
   )
   private short[] field10949;
   @OriginalMember(
      owner = "client!pca",
      name = "Dc",
      descriptor = "[F"
   )
   private float[] field10998;
   @OriginalMember(
      owner = "client!pca",
      name = "N",
      descriptor = "[S"
   )
   private short[] field10989;
   @OriginalMember(
      owner = "client!pca",
      name = "Ab",
      descriptor = "[B"
   )
   private byte[] field10970;
   @OriginalMember(
      owner = "client!pca",
      name = "Mb",
      descriptor = "[S"
   )
   private short[] field11067;
   @OriginalMember(
      owner = "client!pca",
      name = "V",
      descriptor = "[S"
   )
   private short[] field11004;
   @OriginalMember(
      owner = "client!pca",
      name = "S",
      descriptor = "[S"
   )
   private short[] field10954;
   @OriginalMember(
      owner = "client!pca",
      name = "w",
      descriptor = "[S"
   )
   private short[] field11066;
   @OriginalMember(
      owner = "client!pca",
      name = "zb",
      descriptor = "[S"
   )
   private short[] field11048;
   @OriginalMember(
      owner = "client!pca",
      name = "Eb",
      descriptor = "S"
   )
   private short field11044;
   @OriginalMember(
      owner = "client!pca",
      name = "R",
      descriptor = "[I"
   )
   private int[] field11006;
   @OriginalMember(
      owner = "client!pca",
      name = "tc",
      descriptor = "[[I"
   )
   private int[][] field11005;
   @OriginalMember(
      owner = "client!pca",
      name = "t",
      descriptor = "[[I"
   )
   private int[][] field10982;
   @OriginalMember(
      owner = "client!pca",
      name = "oc",
      descriptor = "[[I"
   )
   private int[][] field11036;
   @OriginalMember(
      owner = "client!pca",
      name = "Lc",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11074 = new String[]{method5427(method5426("\n$\f](")), method5427(method5426("\u001f\u007fN\u001f")), method5427(method5426("\u0001iC]%Y")), method5427(method5426("\u0001iC]\u001f0\"")), method5427(method5426("\u0001iC]i\u0018dK\u0007kY")), method5427(method5426("\u0001iC]\u00053\"")), method5427(method5426("\u0001iC]\u0003Y")), method5427(method5426("\u0001iC]\u001b0\"")), method5427(method5426("\u0001iC]\u00043\"")), method5427(method5426("\u0001iC]\u00140\"")), method5427(method5426("\u0001iC]\u00120\"")), method5427(method5426("\u0001iC];\u0010\"")), method5427(method5426("\u0001iC]#Y")), method5427(method5426("\u0001iC] \u0010\"")), method5427(method5426("\u0001iC]\u0017Y")), method5427(method5426("\u0001iC]\"\u0010\"")), method5427(method5426("\u0001iC]&Y")), method5427(method5426("\u0001iC]4\u0010\"")), method5427(method5426("\u0001iC]4Y")), method5427(method5426("\u0001iC]\u001e0\"")), method5427(method5426("\u0001iC]\u00163\"")), method5427(method5426("\u0001iC]8\u0010\"")), method5427(method5426("\u0001iC]\u0013Y")), method5427(method5426("\u0001iC]\u00123\"")), method5427(method5426("\u0001iC]>Y")), method5427(method5426("\u0001iC]\u0016Y")), method5427(method5426("\u0001iC]\u0010Y")), method5427(method5426("\u0001iC]\u0004Y")), method5427(method5426("\u0001iC]\u0014Y")), method5427(method5426("\u0001iC]\u0007Y")), method5427(method5426("\u0001iC]\u0000Y")), method5427(method5426("\u0001iC]\u001c0\"")), method5427(method5426("\u0001iC]\u0006Y")), method5427(method5426("\u0001iC]\u00160\"")), method5427(method5426("\u0001iC]\u001dY")), method5427(method5426("\u0001iC]/\u0010\"")), method5427(method5426("\u0001iC]\u0011Y")), method5427(method5426("\u0001iC]\u0012Y")), method5427(method5426("\u0001iC]\u00100\"")), method5427(method5426("\u0001iC]1\u0010\"")), method5427(method5426("\u0001iC]\u0005Y")), method5427(method5426("\u0001iC]\u0018Y")), method5427(method5426("\u0001iC]\u001aY")), method5427(method5426("\u0001iC]\u001a3\"")), method5427(method5426("\u0001iC]\u001d0\"")), method5427(method5426("\u0001iC]3\u0010\"")), method5427(method5426("\u0001iC]7\u0010\"")), method5427(method5426("\u0001iC]\u00030\"")), method5427(method5426("\u0001iC]\u00180\"")), method5427(method5426("\u0001iC]\u0019Y")), method5427(method5426("\u0001iC]\u00020\"")), method5427(method5426("\u0001iC]\u00130\"")), method5427(method5426("\u0001iC]<\u0010\"")), method5427(method5426("\u0001iC]\u001fY")), method5427(method5426("\u0001iC]\u0002Y")), method5427(method5426("\u0001iC]\u001bY")), method5427(method5426("\u0001iC]\u00133\"")), method5427(method5426("\u0001iC]\u0001Y")), method5427(method5426("\u0001iC]\u00170\"")), method5427(method5426("\u0001iC]\u00190\"")), method5427(method5426("\u0001iC]\u001cY")), method5427(method5426("\u0001iC]\u00110\"")), method5427(method5426("\u0001iC]\u00070\"")), method5427(method5426("\u0001iC]'Y")), method5427(method5426("\u0001iC]\u001eY"))};
   @OriginalMember(
      owner = "client!pca",
      name = "T",
      descriptor = "I"
   )
   public static int field10992 = 2;
   @OriginalMember(
      owner = "client!pca",
      name = "Bb",
      descriptor = "Lek;"
   )
   public static class536 field10990 = new class536(85, -1);
   @OriginalMember(
      owner = "client!pca",
      name = "Z",
      descriptor = "B"
   )
   private byte field11027;
   @OriginalMember(
      owner = "client!pca",
      name = "Nb",
      descriptor = "F"
   )
   public static float field11056;
   @OriginalMember(
      owner = "client!pca",
      name = "E",
      descriptor = "I"
   )
   public static int field10950;
   @OriginalMember(
      owner = "client!pca",
      name = "bb",
      descriptor = "I"
   )
   public static int field10952;
   @OriginalMember(
      owner = "client!pca",
      name = "sb",
      descriptor = "I"
   )
   public static int field10953;
   @OriginalMember(
      owner = "client!pca",
      name = "Jc",
      descriptor = "I"
   )
   public static int field10956;
   @OriginalMember(
      owner = "client!pca",
      name = "kb",
      descriptor = "I"
   )
   public static int field10957;
   @OriginalMember(
      owner = "client!pca",
      name = "H",
      descriptor = "I"
   )
   public static int field10959;
   @OriginalMember(
      owner = "client!pca",
      name = "tb",
      descriptor = "I"
   )
   public static int field10960;
   @OriginalMember(
      owner = "client!pca",
      name = "Wb",
      descriptor = "I"
   )
   public static int field10963;
   @OriginalMember(
      owner = "client!pca",
      name = "gc",
      descriptor = "I"
   )
   public static int field10967;
   @OriginalMember(
      owner = "client!pca",
      name = "sc",
      descriptor = "I"
   )
   public static int field10968;
   @OriginalMember(
      owner = "client!pca",
      name = "Xb",
      descriptor = "I"
   )
   public static int field10969;
   @OriginalMember(
      owner = "client!pca",
      name = "Vb",
      descriptor = "I"
   )
   public static int field10972;
   @OriginalMember(
      owner = "client!pca",
      name = "v",
      descriptor = "I"
   )
   public static int field10976;
   @OriginalMember(
      owner = "client!pca",
      name = "P",
      descriptor = "I"
   )
   public static int field10977;
   @OriginalMember(
      owner = "client!pca",
      name = "pc",
      descriptor = "I"
   )
   public static int field10980;
   @OriginalMember(
      owner = "client!pca",
      name = "yb",
      descriptor = "I"
   )
   public static int field10981;
   @OriginalMember(
      owner = "client!pca",
      name = "mb",
      descriptor = "I"
   )
   public static int field10983;
   @OriginalMember(
      owner = "client!pca",
      name = "Qb",
      descriptor = "I"
   )
   public static int field10985;
   @OriginalMember(
      owner = "client!pca",
      name = "X",
      descriptor = "I"
   )
   public static int field10988;
   @OriginalMember(
      owner = "client!pca",
      name = "uc",
      descriptor = "I"
   )
   public static int field10991;
   @OriginalMember(
      owner = "client!pca",
      name = "Kc",
      descriptor = "I"
   )
   public static int field10993;
   @OriginalMember(
      owner = "client!pca",
      name = "wc",
      descriptor = "I"
   )
   public static int field10999;
   @OriginalMember(
      owner = "client!pca",
      name = "Pb",
      descriptor = "I"
   )
   public static int field11003;
   @OriginalMember(
      owner = "client!pca",
      name = "Bc",
      descriptor = "I"
   )
   public static int field11007;
   @OriginalMember(
      owner = "client!pca",
      name = "Rb",
      descriptor = "I"
   )
   public static int field11009;
   @OriginalMember(
      owner = "client!pca",
      name = "B",
      descriptor = "I"
   )
   public static int field11013;
   @OriginalMember(
      owner = "client!pca",
      name = "U",
      descriptor = "I"
   )
   public static int field11014;
   @OriginalMember(
      owner = "client!pca",
      name = "Zb",
      descriptor = "I"
   )
   public static int field11015;
   @OriginalMember(
      owner = "client!pca",
      name = "Ic",
      descriptor = "I"
   )
   public static int field11017;
   @OriginalMember(
      owner = "client!pca",
      name = "r",
      descriptor = "I"
   )
   public static int field11018;
   @OriginalMember(
      owner = "client!pca",
      name = "I",
      descriptor = "I"
   )
   public static int field11022;
   @OriginalMember(
      owner = "client!pca",
      name = "hc",
      descriptor = "I"
   )
   public static int field11023;
   @OriginalMember(
      owner = "client!pca",
      name = "Gb",
      descriptor = "I"
   )
   public static int field11024;
   @OriginalMember(
      owner = "client!pca",
      name = "O",
      descriptor = "I"
   )
   public static int field11025;
   @OriginalMember(
      owner = "client!pca",
      name = "q",
      descriptor = "I"
   )
   public static int field11026;
   @OriginalMember(
      owner = "client!pca",
      name = "ib",
      descriptor = "I"
   )
   public static int field11030;
   @OriginalMember(
      owner = "client!pca",
      name = "x",
      descriptor = "I"
   )
   public static int field11032;
   @OriginalMember(
      owner = "client!pca",
      name = "Kb",
      descriptor = "I"
   )
   public static int field11034;
   @OriginalMember(
      owner = "client!pca",
      name = "F",
      descriptor = "I"
   )
   public static int field11035;
   @OriginalMember(
      owner = "client!pca",
      name = "Ob",
      descriptor = "I"
   )
   public static int field11037;
   @OriginalMember(
      owner = "client!pca",
      name = "Jb",
      descriptor = "I"
   )
   public static int field11038;
   @OriginalMember(
      owner = "client!pca",
      name = "Ib",
      descriptor = "I"
   )
   public static int field11039;
   @OriginalMember(
      owner = "client!pca",
      name = "K",
      descriptor = "I"
   )
   public static int field11040;
   @OriginalMember(
      owner = "client!pca",
      name = "Hc",
      descriptor = "I"
   )
   public static int field11041;
   @OriginalMember(
      owner = "client!pca",
      name = "ab",
      descriptor = "I"
   )
   public static int field11046;
   @OriginalMember(
      owner = "client!pca",
      name = "C",
      descriptor = "I"
   )
   public static int field11049;
   @OriginalMember(
      owner = "client!pca",
      name = "G",
      descriptor = "I"
   )
   public static int field11050;
   @OriginalMember(
      owner = "client!pca",
      name = "ac",
      descriptor = "I"
   )
   public static int field11051;
   @OriginalMember(
      owner = "client!pca",
      name = "lc",
      descriptor = "I"
   )
   public static int field11053;
   @OriginalMember(
      owner = "client!pca",
      name = "qb",
      descriptor = "I"
   )
   public static int field11054;
   @OriginalMember(
      owner = "client!pca",
      name = "Ub",
      descriptor = "I"
   )
   public static int field11055;
   @OriginalMember(
      owner = "client!pca",
      name = "L",
      descriptor = "I"
   )
   public static int field11057;
   @OriginalMember(
      owner = "client!pca",
      name = "rb",
      descriptor = "I"
   )
   public static int field11058;
   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "I"
   )
   public static int field11060;
   @OriginalMember(
      owner = "client!pca",
      name = "lb",
      descriptor = "I"
   )
   public static int field11061;
   @OriginalMember(
      owner = "client!pca",
      name = "Yb",
      descriptor = "I"
   )
   public static int field11062;
   @OriginalMember(
      owner = "client!pca",
      name = "Y",
      descriptor = "I"
   )
   public static int field11064;
   @OriginalMember(
      owner = "client!pca",
      name = "Db",
      descriptor = "I"
   )
   public static int field11065;
   @OriginalMember(
      owner = "client!pca",
      name = "Sb",
      descriptor = "I"
   )
   public static int field11068;
   @OriginalMember(
      owner = "client!pca",
      name = "hb",
      descriptor = "I"
   )
   public static int field11070;
   @OriginalMember(
      owner = "client!pca",
      name = "D",
      descriptor = "I"
   )
   public static int field11073;
   @OriginalMember(
      owner = "client!pca",
      name = "eb",
      descriptor = "Llfa;"
   )
   private class126 field10971;
   @OriginalMember(
      owner = "client!pca",
      name = "Ac",
      descriptor = "Lws;"
   )
   private class379 field11069;
   @OriginalMember(
      owner = "client!pca",
      name = "rc",
      descriptor = "Lwr;"
   )
   private class485 field11047;
   @OriginalMember(
      owner = "client!pca",
      name = "ic",
      descriptor = "S"
   )
   private short field10965;
   @OriginalMember(
      owner = "client!pca",
      name = "zc",
      descriptor = "S"
   )
   private short field10974;
   @OriginalMember(
      owner = "client!pca",
      name = "nb",
      descriptor = "S"
   )
   private short field10975;
   @OriginalMember(
      owner = "client!pca",
      name = "Fb",
      descriptor = "S"
   )
   private short field11000;
   @OriginalMember(
      owner = "client!pca",
      name = "vc",
      descriptor = "S"
   )
   private short field11019;
   @OriginalMember(
      owner = "client!pca",
      name = "fc",
      descriptor = "S"
   )
   private short field11020;
   @OriginalMember(
      owner = "client!pca",
      name = "ub",
      descriptor = "S"
   )
   private short field11029;
   @OriginalMember(
      owner = "client!pca",
      name = "s",
      descriptor = "S"
   )
   private short field11071;
   @OriginalMember(
      owner = "client!pca",
      name = "u",
      descriptor = "[Lbg;"
   )
   public static class492[] field11072;
   @OriginalMember(
      owner = "client!pca",
      name = "Fc",
      descriptor = "[[[Z"
   )
   public static boolean[][][] field11059;

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lew;Lsb;I)V",
      line = 6
   )
   public final void method192(class521 arg0, class307 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field11026;
         if (this.field10962 != 0) {
            class507 var5 = this.field10973.field8379;
            if (!this.field10995) {
               this.method5412(true);
            }

            class507 var6;
            float var9;
            float var10;
            label141: {
               var6 = (class507)arg0;
               class728.field10672 = var5.field7401 * var6.field7392 + var5.field7386 * var6.field7402 + var5.field7383 * var6.field7393 + var5.field7392;
               class36.field518 = var5.field7401 * var6.field7386 + var5.field7386 * var6.field7400 + var5.field7383 * var6.field7395;
               float var7 = (float)this.field10974 * class36.field518 + class728.field10672;
               float var8 = (float)this.field10965 * class36.field518 + class728.field10672;
               if (!(var8 < var7)) {
                  var9 = (float)this.field11019 + var8;
                  var10 = var7 - (float)this.field11019;
                  if (!var4) {
                     break label141;
                  }
               }

               var9 = (float)this.field11019 + var7;
               var10 = (float)(-this.field11019) + var8;
            }

            if (!(var10 >= this.field10973.field8424)) {
               if (!((float)this.field10973.field8431 >= var9)) {
                  float var13;
                  float var14;
                  label133: {
                     class308.field4215 = var5.field7391 * var6.field7386 + var5.field7399 * var6.field7395 + var5.field7395 * var6.field7400;
                     class111.field1402 = var5.field7391 * var6.field7392 + var5.field7399 * var6.field7393 + var5.field7395 * var6.field7402 + var5.field7393;
                     float var11 = (float)this.field10974 * class308.field4215 + class111.field1402;
                     float var12 = (float)this.field10965 * class308.field4215 + class111.field1402;
                     if (var11 > var12) {
                        var13 = ((float)this.field11019 + var11) * (float)this.field10973.field8473;
                        var14 = (var12 - (float)this.field11019) * (float)this.field10973.field8473;
                        if (!var4) {
                           break label133;
                        }
                     }

                     var13 = ((float)this.field11019 + var12) * (float)this.field10973.field8473;
                     var14 = (var11 - (float)this.field11019) * (float)this.field10973.field8473;
                  }

                  if (!(this.field10973.field8477 <= var14 / var9)) {
                     if (!(this.field10973.field8407 >= var13 / var9)) {
                        float var17;
                        float var18;
                        label125: {
                           class57.field707 = var5.field7366 * var6.field7386 + var5.field7400 * var6.field7400 + var5.field7365 * var6.field7395;
                           class169.field2361 = var5.field7366 * var6.field7392 + var5.field7400 * var6.field7402 + var5.field7365 * var6.field7393 + var5.field7402;
                           float var15 = (float)this.field10974 * class57.field707 + class169.field2361;
                           float var16 = (float)this.field10965 * class57.field707 + class169.field2361;
                           if (var15 > var16) {
                              var17 = ((float)this.field11019 + var15) * (float)this.field10973.field8496;
                              var18 = ((float)(-this.field11019) + var16) * (float)this.field10973.field8496;
                              if (!var4) {
                                 break label125;
                              }
                           }

                           var17 = ((float)this.field11019 + var16) * (float)this.field10973.field8496;
                           var18 = (var15 - (float)this.field11019) * (float)this.field10973.field8496;
                        }

                        if (!(var18 / var9 >= this.field10973.field8443)) {
                           if (!(this.field10973.field8446 >= var17 / var9)) {
                              if (arg1 != null || this.field10994 != null) {
                                 class472.field6812 = var5.field7391 * var6.field7401 + var5.field7399 * var6.field7391 + var5.field7395 * var6.field7366;
                                 class338.field4602 = var5.field7401 * var6.field7383 + var5.field7386 * var6.field7365 + var5.field7383 * var6.field7399;
                                 class562.field8025 = var5.field7366 * var6.field7383 + var5.field7400 * var6.field7365 + var5.field7365 * var6.field7399;
                                 class141.field1803 = var5.field7391 * var6.field7383 + var5.field7399 * var6.field7399 + var5.field7395 * var6.field7365;
                                 class756.field11208 = var5.field7401 * var6.field7401 + var5.field7386 * var6.field7366 + var5.field7383 * var6.field7391;
                                 class712.field10386 = var5.field7366 * var6.field7401 + var5.field7400 * var6.field7366 + var5.field7365 * var6.field7391;
                              }

                              if (arg1 != null) {
                                 boolean var19;
                                 boolean var20;
                                 int var21;
                                 int var22;
                                 int var23;
                                 int var24;
                                 int var25;
                                 label110: {
                                    var19 = false;
                                    var20 = true;
                                    var21 = this.field10975 - -this.field11000 >> 1;
                                    var22 = this.field11029 + this.field11020 >> 1;
                                    var23 = (int)((float)var22 * class472.field6812 + (float)this.field10974 * class308.field4215 + (float)var21 * class141.field1803 + class111.field1402);
                                    var24 = (int)((float)var22 * class712.field10386 + (float)this.field10974 * class57.field707 + (float)var21 * class562.field8025 + class169.field2361);
                                    var25 = (int)((float)var22 * class756.field11208 + (float)this.field10974 * class36.field518 + (float)var21 * class338.field4602 + class728.field10672);
                                    if (~this.field10973.field8431 >= ~var25) {
                                       arg1.field4194 = this.field10973.field8473 * var23 / var25 + this.field10973.field8403;
                                       arg1.field4193 = this.field10973.field8496 * var24 / var25 + this.field10973.field8493;
                                       if (!var4) {
                                          break label110;
                                       }
                                    }

                                    var19 = true;
                                 }

                                 int var26;
                                 int var27;
                                 int var28;
                                 label105: {
                                    var26 = (int)((float)var22 * class472.field6812 + (float)this.field10965 * class308.field4215 + (float)var21 * class141.field1803 + class111.field1402);
                                    var27 = (int)((float)var22 * class712.field10386 + (float)this.field10965 * class57.field707 + (float)var21 * class562.field8025 + class169.field2361);
                                    var28 = (int)((float)var22 * class756.field11208 + (float)this.field10965 * class36.field518 + (float)var21 * class338.field4602 + class728.field10672);
                                    if (var28 >= this.field10973.field8431) {
                                       arg1.field4196 = this.field10973.field8403 - -(this.field10973.field8473 * var26 / var28);
                                       arg1.field4192 = this.field10973.field8496 * var27 / var28 + this.field10973.field8493;
                                       if (!var4) {
                                          break label105;
                                       }
                                    }

                                    var19 = true;
                                 }

                                 if (var19) {
                                    label159: {
                                       if (this.field10973.field8431 > var25 && this.field10973.field8431 > var28) {
                                          var20 = false;
                                          if (!var4) {
                                             break label159;
                                          }
                                       }

                                       if (this.field10973.field8431 <= var25) {
                                          if (~var28 <= ~this.field10973.field8431) {
                                             break label159;
                                          }

                                          int var29 = (var25 - this.field10973.field8431 << 16) / (-var28 + var25);
                                          int var30 = ((var23 - var26) * var29 >> 16) + var23;
                                          arg1.field4194 = this.field10973.field8473 * var30 / this.field10973.field8431 + this.field10973.field8403;
                                          int var31 = ((-var27 + var24) * var29 >> 16) + var24;
                                          arg1.field4193 = this.field10973.field8496 * var31 / this.field10973.field8431 + this.field10973.field8493;
                                          if (!var4) {
                                             break label159;
                                          }
                                       }

                                       int var32 = (var28 - this.field10973.field8431 << 16) / (-var25 + var28);
                                       int var33 = ((-var23 + var26) * var32 >> 16) + var26;
                                       arg1.field4194 = this.field10973.field8473 * var33 / this.field10973.field8431 + this.field10973.field8403;
                                       int var34 = ((-var24 + var27) * var32 >> 16) + var27;
                                       arg1.field4193 = this.field10973.field8496 * var34 / this.field10973.field8431 + this.field10973.field8493;
                                    }
                                 }

                                 if (var20) {
                                    label86: {
                                       if (var25 > var28) {
                                          arg1.field4195 = this.field10973.field8403 - -((var23 - -this.field11019) * this.field10973.field8473 / var25) - arg1.field4194;
                                          if (!var4) {
                                             break label86;
                                          }
                                       }

                                       arg1.field4195 = (this.field11019 + var26) * this.field10973.field8473 / var28 + this.field10973.field8403 - arg1.field4196;
                                    }

                                    arg1.field4191 = true;
                                 }
                              }

                              this.field10973.method4172(2);
                              this.field10973.method4158((byte)126, var6);
                              this.method5419(0);
                              this.field10973.method4163((byte)69);
                              this.method5422((byte)38);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var36) {
         throw class237.method1823(var36, field11074[5] + (arg0 != null ? field11074[0] : field11074[1]) + ',' + (arg1 != null ? field11074[0] : field11074[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(ILew;IZBII)Z",
      line = 207
   )
   private final boolean method5411(int arg0, class521 arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field10968;
         class507 var9 = (class507)arg1;
         class507 var10 = this.field10973.field8379;
         float var11 = var9.field7392 * var10.field7391 + var9.field7402 * var10.field7395 + var9.field7393 * var10.field7399 + var10.field7393;
         float var12 = var9.field7392 * var10.field7366 + var9.field7402 * var10.field7400 + var9.field7393 * var10.field7365 + var10.field7402;
         class562.field8025 = var9.field7383 * var10.field7366 + var9.field7399 * var10.field7365 + var9.field7365 * var10.field7400;
         float var13 = var9.field7392 * var10.field7401 + var9.field7402 * var10.field7386 + var9.field7393 * var10.field7383 + var10.field7392;
         class308.field4215 = var9.field7386 * var10.field7391 + var9.field7400 * var10.field7395 + var9.field7395 * var10.field7399;
         class57.field707 = var9.field7386 * var10.field7366 + var9.field7400 * var10.field7400 + var9.field7395 * var10.field7365;
         class712.field10386 = var9.field7401 * var10.field7366 + var9.field7391 * var10.field7365 + var9.field7366 * var10.field7400;
         if (arg4 > -82) {
            this.field10949 = null;
         }

         class36.field518 = var9.field7386 * var10.field7401 + var9.field7400 * var10.field7386 + var9.field7395 * var10.field7383;
         class472.field6812 = var9.field7401 * var10.field7391 + var9.field7391 * var10.field7399 + var9.field7366 * var10.field7395;
         class756.field11208 = var9.field7401 * var10.field7401 + var9.field7391 * var10.field7383 + var9.field7366 * var10.field7386;
         class141.field1803 = var9.field7383 * var10.field7391 + var9.field7399 * var10.field7399 + var9.field7365 * var10.field7395;
         class338.field4602 = var9.field7383 * var10.field7401 + var9.field7399 * var10.field7383 + var9.field7365 * var10.field7386;
         byte var14 = 0;
         float var15 = Float.MAX_VALUE;
         float var16 = -3.4028235E38F;
         float var17 = Float.MAX_VALUE;
         float var18 = -3.4028235E38F;
         int var19 = this.field10973.field8473;
         int var20 = this.field10973.field8496;
         if (!this.field10995) {
            this.method5412(true);
         }

         int var21 = -this.field10975 + this.field11000 >> 1;
         int var22 = -this.field10974 + this.field10965 >> 1;
         int var23 = -this.field11029 + this.field11020 >> 1;
         int var24 = this.field10975 + var21;
         int var25 = this.field10974 + var22;
         int var26 = this.field11029 - -var23;
         int var27 = -(var21 << arg5) + var24;
         int var28 = -(var22 << arg5) + var25;
         int var29 = -(var23 << arg5) + var26;
         int var30 = var24 - -(var21 << arg5);
         int var31 = (var22 << arg5) + var25;
         int var32 = (var23 << arg5) + var26;
         class490.field7016[0] = var27;
         class490.field7020[0] = var28;
         class712.field10384[0] = var29;
         class490.field7016[1] = var30;
         class490.field7020[1] = var28;
         class712.field10384[1] = var29;
         class490.field7016[2] = var27;
         class490.field7020[2] = var31;
         class490.field7016[3] = var30;
         class712.field10384[2] = var29;
         class490.field7020[3] = var31;
         class712.field10384[3] = var29;
         class490.field7016[4] = var27;
         class490.field7020[4] = var28;
         class712.field10384[4] = var32;
         class490.field7016[5] = var30;
         class490.field7020[5] = var28;
         class712.field10384[5] = var32;
         class490.field7016[6] = var27;
         class490.field7020[6] = var31;
         class712.field10384[6] = var32;
         class490.field7016[7] = var30;
         class490.field7020[7] = var31;
         class712.field10384[7] = var32;
         int var33 = 0;
         float var34;
         float var35;
         float var36;
         float var37;
         float var38;
         float var39;
         float var40;
         float var41;
         if (var8) {
            var34 = (float)class490.field7016[var33];
            var35 = (float)class490.field7020[var33];
            var36 = (float)class712.field10384[var33];
            var37 = class472.field6812 * var36 + class308.field4215 * var35 + class141.field1803 * var34 + var11;
            var38 = class712.field10386 * var36 + class57.field707 * var35 + class562.field8025 * var34 + var12;
            var39 = class756.field11208 * var36 + class36.field518 * var35 + class338.field4602 * var34 + var13;
            if ((float)this.field10973.field8431 <= var39) {
               if (arg6 > 0) {
                  var39 = (float)arg6;
               }

               var40 = (float)var19 * var37 / var39 + (float)this.field10973.field8403;
               if (var15 > var40) {
                  var15 = var40;
               }

               if (var16 < var40) {
                  var16 = var40;
               }

               var41 = (float)var20 * var38 / var39 + (float)this.field10973.field8493;
               if (var41 < var17) {
                  var17 = var41;
               }

               var14 = 1;
               if (var18 < var41) {
                  var18 = var41;
               }
            }

            ++var33;
         }

         while(true) {
            int var10000;
            if (~var33 <= -9) {
               var10000 = var14;
               if (!var8) {
                  if (var14 != 0 && (float)arg0 > var15 && (float)arg0 < var16 && (float)arg2 > var17 && var18 > (float)arg2) {
                     if (arg3) {
                        return true;
                     }

                     if (~this.field10973.field8501.length > ~this.field10962) {
                        this.field10973.field8499 = new int[this.field10962];
                        this.field10973.field8501 = new int[this.field10962];
                     }

                     int[] var42;
                     int[] var43;
                     label175: {
                        var42 = this.field10973.field8501;
                        var43 = this.field10973.field8499;
                        int var44 = 0;
                        if (var8) {
                           var10000 = this.field10987[var44];
                        } else if (var44 >= this.field10997) {
                           var10000 = 0;
                           if (!var8) {
                              break label175;
                           }
                        } else {
                           var10000 = this.field10987[var44];
                        }

                        while(true) {
                           label242: {
                              float var45 = (float)var10000;
                              float var46 = (float)this.field10951[var44];
                              float var47 = (float)this.field11021[var44];
                              float var48 = class712.field10386 * var45 + class57.field707 * var47 + class562.field8025 * var46 + var12;
                              float var49 = class756.field11208 * var45 + class36.field518 * var47 + class338.field4602 * var46 + var13;
                              float var50 = class472.field6812 * var45 + class308.field4215 * var47 + class141.field1803 * var46 + var11;
                              if (var49 >= (float)this.field10973.field8431) {
                                 if (arg6 > 0) {
                                    var49 = (float)arg6;
                                 }

                                 int var51 = (int)((float)var19 * var50 / var49 + (float)this.field10973.field8403);
                                 int var52 = (int)((float)var20 * var48 / var49 + (float)this.field10973.field8493);
                                 int var53 = this.field10986[var44];
                                 int var54 = this.field10986[var44 + 1];
                                 int var55 = var53;
                                 if (var8 || var54 > var53) {
                                    do {
                                       int var56 = this.field10954[var55] - 1;
                                       if (~var56 == 0) {
                                          break;
                                       }

                                       var42[var56] = var51;
                                       var43[var56] = var52;
                                       ++var55;
                                    } while(var54 > var55);
                                 }

                                 if (!var8) {
                                    ++var44;
                                    break label242;
                                 }
                              }

                              int var57 = this.field10986[var44];
                              int var58 = this.field10986[var44 + 1];
                              int var59 = var57;
                              if (!var8 && ~var58 >= ~var57) {
                                 ++var44;
                              } else {
                                 while(true) {
                                    int var60 = this.field10954[var59] + -1;
                                    if (~var60 == 0) {
                                       ++var44;
                                       break;
                                    }

                                    var42[this.field10954[var59] - 1] = -999999;
                                    ++var59;
                                    if (~var58 >= ~var59) {
                                       ++var44;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (var44 >= this.field10997) {
                              var10000 = 0;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              var10000 = this.field10987[var44];
                           }
                        }
                     }

                     int var61 = var10000;
                     if (var8 || ~this.field10996 < ~var61) {
                        do {
                           if (var42[this.field11048[var61]] != -999999) {
                              if (~var42[this.field10989[var61]] != 999998) {
                                 if (var42[this.field10949[var61]] == -999999 && !var8) {
                                    ++var61;
                                 } else {
                                    if (this.method5415(var43[this.field10949[var61]], var43[this.field11048[var61]], arg0, var42[this.field10989[var61]], var43[this.field10989[var61]], var42[this.field11048[var61]], var42[this.field10949[var61]], arg2, 16383)) {
                                       return true;
                                    }

                                    ++var61;
                                 }
                              } else {
                                 ++var61;
                              }
                           } else {
                              ++var61;
                           }
                        } while(~this.field10996 < ~var61);
                     }
                  }

                  return false;
               }
            } else {
               var10000 = class490.field7016[var33];
            }

            var34 = (float)var10000;
            var35 = (float)class490.field7020[var33];
            var36 = (float)class712.field10384[var33];
            var37 = class472.field6812 * var36 + class308.field4215 * var35 + class141.field1803 * var34 + var11;
            var38 = class712.field10386 * var36 + class57.field707 * var35 + class562.field8025 * var34 + var12;
            var39 = class756.field11208 * var36 + class36.field518 * var35 + class338.field4602 * var34 + var13;
            if ((float)this.field10973.field8431 <= var39) {
               if (arg6 > 0) {
                  var39 = (float)arg6;
               }

               var40 = (float)var19 * var37 / var39 + (float)this.field10973.field8403;
               if (var15 > var40) {
                  var15 = var40;
               }

               if (var16 < var40) {
                  var16 = var40;
               }

               var41 = (float)var20 * var38 / var39 + (float)this.field10973.field8493;
               if (var41 < var17) {
                  var17 = var41;
               }

               var14 = 1;
               if (var18 < var41) {
                  var18 = var41;
               }
            }

            ++var33;
         }
      } catch (RuntimeException var63) {
         throw class237.method1823(var63, field11074[54] + arg0 + ',' + (arg1 != null ? field11074[0] : field11074[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "WA",
      descriptor = "()I",
      line = 456
   )
   public final int method217() {
      try {
         ++field10959;
         return this.field11052;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[50] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "VA",
      descriptor = "(I)V",
      line = 467
   )
   public final void method193(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10976;
         int var3 = class363.field4956[arg0];
         int var4 = class363.field4987[arg0];
         int var5 = 0;
         class747 var10000;
         if (var2) {
            var10000 = this;
         } else if (~this.field10997 >= ~var5) {
            this.field10995 = false;
            var10000 = this;
            if (!var2) {
               if (this.field11011 != null) {
                  this.field11011.field72 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field10951[var5] * var4 + this.field11021[var5] * var3 >> 14;
            this.field11021[var5] = this.field11021[var5] * var4 - this.field10951[var5] * var3 >> 14;
            this.field10951[var5] = var6;
            ++var5;
            if (~this.field10997 >= ~var5) {
               this.field10995 = false;
               var10000 = this;
               if (!var2) {
                  if (this.field11011 != null) {
                     this.field11011.field72 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11074[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "ba",
      descriptor = "(Lr;)Lr;",
      line = 499
   )
   public final class196 method154(class196 arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10983;
         if (~this.field10962 == -1) {
            return null;
         } else {
            if (!this.field10995) {
               this.method5412(true);
            }

            int var3;
            int var4;
            label48: {
               if (this.field10973.field8494 <= 0) {
                  var3 = -(this.field10973.field8494 * this.field10974 >> 8) + this.field10975 >> this.field10973.field8352;
                  var4 = -(this.field10973.field8494 * this.field10965 >> 8) + this.field11000 >> this.field10973.field8352;
                  if (!var2) {
                     break label48;
                  }
               }

               var3 = this.field10975 - (this.field10973.field8494 * this.field10965 >> 8) >> this.field10973.field8352;
               var4 = this.field11000 - (this.field10973.field8494 * this.field10974 >> 8) >> this.field10973.field8352;
            }

            int var5;
            int var6;
            label43: {
               if (this.field10973.field8437 > 0) {
                  var5 = -(this.field10973.field8437 * this.field10965 >> 8) + this.field11029 >> this.field10973.field8352;
                  var6 = -(this.field10973.field8437 * this.field10974 >> 8) + this.field11020 >> this.field10973.field8352;
                  if (!var2) {
                     break label43;
                  }
               }

               var5 = this.field11029 - (this.field10973.field8437 * this.field10974 >> 8) >> this.field10973.field8352;
               var6 = -(this.field10973.field8437 * this.field10965 >> 8) + this.field11020 >> this.field10973.field8352;
            }

            class381 var10;
            label60: {
               int var7 = -var3 + 1 + var4;
               int var8 = -var5 + var6 + 1;
               class381 var9 = (class381)arg0;
               if (var9 == null || !var9.method2881(var7, var8, 116)) {
                  var10 = new class381(this.field10973, var7, var8);
                  if (!var2) {
                     break label60;
                  }
               }

               var10 = var9;
               var9.method2880((byte)-119);
            }

            var10.method2879(var5, var6, var4, (byte)126, var3);
            this.method5424(var10, (byte)101);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field11074[46] + (arg0 != null ? field11074[0] : field11074[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "O",
      descriptor = "(III)V",
      line = 562
   )
   public final void method166(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field11025;
         int var5 = 0;
         if (var4) {
            if (~arg0 != -129) {
               this.field10951[var5] = this.field10951[var5] * arg0 >> 7;
            }

            if (arg1 != 128) {
               this.field11021[var5] = this.field11021[var5] * arg1 >> 7;
            }

            if (~arg2 != -129) {
               this.field10987[var5] = this.field10987[var5] * arg2 >> 7;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field10997) {
               if (~arg0 != -129) {
                  this.field10951[var5] = this.field10951[var5] * arg0 >> 7;
               }

               if (arg1 != 128) {
                  this.field11021[var5] = this.field11021[var5] * arg1 >> 7;
               }

               if (~arg2 != -129) {
                  this.field10987[var5] = this.field10987[var5] * arg2 >> 7;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            if (!var4) {
               if (this.field11011 != null) {
                  this.field11011.field72 = null;
               }

               this.field10995 = false;
               return;
            }

            this.field10987[var5] = this.field10987[var5] * arg2 >> 7;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11074[42] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "fa",
      descriptor = "()I",
      line = 595
   )
   public final int method226() {
      try {
         if (!this.field10995) {
            this.method5412(true);
         }

         ++field10993;
         return this.field10974;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[45] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "NA",
      descriptor = "()Z",
      line = 608
   )
   public final boolean method186() {
      boolean var1 = client.field4360;

      try {
         ++field11073;
         if (this.field11005 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var1) {
               this.field10951[var2] <<= 4;
               this.field11021[var2] <<= 4;
               this.field10987[var2] <<= 4;
               ++var2;
            }

            while(true) {
               while(var2 < this.field10961) {
                  this.field10951[var2] <<= 4;
                  this.field11021[var2] <<= 4;
                  this.field10987[var2] <<= 4;
                  ++var2;
               }

               class653.field9565 = 0;
               class218.field3119 = 0;
               class405.field5857 = 0;
               if (!var1) {
                  return true;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11074[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "G",
      descriptor = "()I",
      line = 638
   )
   public final int method162() {
      try {
         ++field10988;
         if (!this.field10995) {
            this.method5412(true);
         }

         return this.field11020;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[37] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "p",
      descriptor = "(IILs;Ls;III)V",
      line = 650
   )
   public final void method224(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         if (!this.field10995) {
            this.method5412(true);
         }

         ++field11061;
         int var9 = this.field10975 + arg4;
         int var10 = this.field11000 + arg4;
         int var11 = this.field11029 + arg6;
         int var12 = this.field11020 + arg6;
         if (arg0 != 1 && ~arg0 != -3 && arg0 != 3 && ~arg0 != -6 || var9 >= 0 && ~(arg2.field4062 + var10 >> arg2.field4065) > ~arg2.field4071 && var11 >= 0 && arg2.field4062 + var12 >> arg2.field4065 < arg2.field4064) {
            if (arg0 != 4 && arg0 != 5) {
               int var13 = var9 >> arg2.field4065;
               int var14 = arg2.field4062 - 1 + var10 >> arg2.field4065;
               int var15 = var11 >> arg2.field4065;
               int var16 = var12 - 1 - -arg2.field4062 >> arg2.field4065;
               if (~arg2.method2219(true, var13, var15) == ~arg5 && arg5 == arg2.method2219(true, var14, var15) && ~arg2.method2219(true, var13, var16) == ~arg5 && arg2.method2219(true, var14, var16) == arg5) {
                  return;
               }
            } else {
               if (arg3 == null) {
                  return;
               }

               if (var9 < 0 || ~arg3.field4071 >= ~(var10 - -arg3.field4062 >> arg3.field4065) || ~var11 > -1 || arg3.field4064 <= arg3.field4062 + var12 >> arg3.field4065) {
                  return;
               }
            }

            int var33;
            if (~arg0 == -2) {
               var33 = 0;
               if (var8 || var33 < this.field10997) {
                  do {
                     this.field11021[var33] = -arg5 + (this.field11021[var33] - -arg2.method2220(this.field10987[var33] + arg6, this.field10951[var33] + arg4, 103));
                     ++var33;
                  } while(var33 < this.field10997);
               }
            } else {
               label284: {
                  if (arg0 != 2) {
                     if (~arg0 == -4) {
                        int var17 = (arg1 & 255) * 4;
                        int var18 = (arg1 >> 8 & 255) * 4;
                        int var19 = arg1 >> 16 << 6 & 16320;
                        int var20 = 16320 & arg1 >> 24 << 6;
                        if (~(-(var17 >> 1) + arg4) > -1 || ~(arg2.field4071 << arg2.field4065) >= ~((var17 >> 1) + arg2.field4062 + arg4) || ~(-(var18 >> 1) + arg6) > -1 || arg2.field4064 << arg2.field4065 <= arg6 - -(var18 >> 1) + arg2.field4062) {
                           return;
                        }

                        this.method3629(var17, var18, arg6, arg4, -95, arg5, arg2, var20, var19);
                        if (!var8) {
                           break label284;
                        }
                     }

                     if (~arg0 != -5) {
                        if (arg0 != 5) {
                           break label284;
                        }

                        int var21 = -this.field10974 + this.field10965;
                        int var22 = 0;
                        if (!var8 && ~this.field10997 >= ~var22) {
                           if (!var8) {
                              break label284;
                           }
                        } else {
                           while(true) {
                              int var23 = this.field10951[var22] + arg4;
                              int var24 = this.field10987[var22] + arg6;
                              int var25 = arg2.method2220(var24, var23, 94);
                              int var26 = arg3.method2220(var24, var23, 81);
                              int var27 = var25 - arg1 + -var26;
                              this.field11021[var22] = ((this.field11021[var22] << 8) / var21 * var27 >> 8) - (-var25 + arg5);
                              ++var22;
                              if (~this.field10997 >= ~var22) {
                                 if (!var8) {
                                    break label284;
                                 }
                                 break;
                              }
                           }
                        }
                     }

                     int var28 = -this.field10974 + this.field10965;
                     int var29 = 0;
                     if (var8) {
                        this.field11021[var29] = var28 + (this.field11021[var29] - arg5 - -arg3.method2220(this.field10987[var29] - -arg6, this.field10951[var29] - -arg4, -87));
                        ++var29;
                     }

                     while(true) {
                        while(var29 < this.field10997) {
                           this.field11021[var29] = var28 + (this.field11021[var29] - arg5 - -arg3.method2220(this.field10987[var29] - -arg6, this.field10951[var29] - -arg4, -87));
                           ++var29;
                        }

                        if (!var8) {
                           if (!var8) {
                              break label284;
                           }
                           break;
                        }

                        ++var29;
                     }
                  }

                  short var30 = this.field10974;
                  if (var30 == 0) {
                     return;
                  }

                  int var31 = 0;
                  if (!var8 && var31 >= this.field10997) {
                     if (var8) {
                        var33 = 0;
                        if (var8 || var33 < this.field10997) {
                           do {
                              this.field11021[var33] = -arg5 + (this.field11021[var33] - -arg2.method2220(this.field10987[var33] + arg6, this.field10951[var33] + arg4, 103));
                              ++var33;
                           } while(var33 < this.field10997);
                        }
                     }
                  } else {
                     label185:
                     while(true) {
                        int var32 = (this.field11021[var31] << 16) / var30;
                        if (var32 < arg1) {
                           this.field11021[var31] += (-var32 + arg1) * (arg2.method2220(this.field10987[var31] - -arg6, this.field10951[var31] + arg4, 94) - arg5) / arg1;
                        }

                        ++var31;
                        if (var31 >= this.field10997) {
                           if (!var8) {
                              break;
                           }

                           var33 = 0;
                           if (!var8 && var33 >= this.field10997) {
                              break;
                           }

                           while(true) {
                              this.field11021[var33] = -arg5 + (this.field11021[var33] - -arg2.method2220(this.field10987[var33] + arg6, this.field10951[var33] + arg4, 103));
                              ++var33;
                              if (var33 >= this.field10997) {
                                 break label185;
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (this.field11011 != null) {
               this.field11011.field72 = null;
            }

            this.field10995 = false;
         }
      } catch (RuntimeException var35) {
         throw class237.method1823(var35, field11074[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11074[0] : field11074[1]) + ',' + (arg3 != null ? field11074[0] : field11074[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IILew;ZI)Z",
      line = 812
   )
   public final boolean method183(int arg0, int arg1, class521 arg2, boolean arg3, int arg4) {
      try {
         ++field11062;
         return this.method5411(arg0, arg2, arg1, arg3, (byte)-97, arg4, -1);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11074[57] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11074[0] : field11074[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Z)V",
      line = 821
   )
   private final void method5412(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11009;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         class747 var10000;
         if (var2) {
            var10000 = this;
         } else if (~var11 <= ~this.field10997) {
            this.field11020 = (short)var8;
            this.field10975 = (short)var3;
            this.field10965 = (short)var7;
            this.field10974 = (short)var4;
            this.field11029 = (short)var5;
            this.field11000 = (short)var6;
            this.field11019 = (short)((int)(0.99D + Math.sqrt((double)var9)));
            this.field11071 = (short)((int)(0.99D + Math.sqrt((double)var10)));
            var10000 = this;
            if (!var2) {
               this.field10995 = arg0;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var12 = var10000.field10951[var11];
            int var13 = this.field11021[var11];
            int var14 = this.field10987[var11];
            if (~var12 < ~var6) {
               var6 = var12;
            }

            if (var13 > var7) {
               var7 = var13;
            }

            if (var3 > var12) {
               var3 = var12;
            }

            if (~var4 < ~var13) {
               var4 = var13;
            }

            if (~var8 > ~var14) {
               var8 = var14;
            }

            if (~var5 < ~var14) {
               var5 = var14;
            }

            int var15 = var12 * var12 + var14 * var14;
            if (~var15 < ~var9) {
               var9 = var15;
            }

            int var16 = var12 * var12 + var13 * var13 + var14 * var14;
            if (var16 > var10) {
               var10 = var16;
            }

            ++var11;
            if (~var11 <= ~this.field10997) {
               this.field11020 = (short)var8;
               this.field10975 = (short)var3;
               this.field10965 = (short)var7;
               this.field10974 = (short)var4;
               this.field11029 = (short)var5;
               this.field11000 = (short)var6;
               this.field11019 = (short)((int)(0.99D + Math.sqrt((double)var9)));
               this.field11071 = (short)((int)(0.99D + Math.sqrt((double)var10)));
               var10000 = this;
               if (!var2) {
                  this.field10995 = arg0;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field11074[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "(B)V",
      line = 898
   )
   private final void method5413(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10991;
         if (this.field11033) {
            this.field11033 = false;
            if (this.field10964 == null && this.field11045 == null && this.field10994 == null && !class510.method3700(this.field10978, this.field11008, 55)) {
               boolean var3 = false;
               boolean var4 = false;
               if (this.field10951 != null && !class708.method5149(458752, this.field11008, this.field10978)) {
                  label305: {
                     if (this.field11011 != null && this.field11011.field72 == null) {
                        this.field11033 = true;
                        if (!var2) {
                           break label305;
                        }
                     }

                     var3 = true;
                     if (!this.field10995) {
                        this.method5412(true);
                     }
                  }
               }

               boolean var5 = false;
               if (this.field11021 != null && !class465.method3385(this.field11008, 8448, this.field10978)) {
                  label307: {
                     if (this.field11011 != null && this.field11011.field72 == null) {
                        this.field11033 = true;
                        if (!var2) {
                           break label307;
                        }
                     }

                     if (!this.field10995) {
                        this.method5412(true);
                     }

                     var4 = true;
                  }
               }

               if (this.field10987 != null && !class11.method58(this.field10978, -10302, this.field11008)) {
                  label309: {
                     if (this.field11011 != null && this.field11011.field72 == null) {
                        this.field11033 = true;
                        if (!var2) {
                           break label309;
                        }
                     }

                     var5 = true;
                     if (!this.field10995) {
                        this.method5412(true);
                     }
                  }
               }

               if (var4) {
                  this.field11021 = null;
               }

               if (var3) {
                  this.field10951 = null;
               }

               if (var5) {
                  this.field10987 = null;
               }
            }

            if (this.field10954 != null && this.field10951 == null && this.field11021 == null && this.field10987 == null) {
               this.field10986 = null;
               this.field10954 = null;
            }

            if (this.field10970 != null && !class130.method1032(this.field11008, false, this.field10978)) {
               label313: {
                  if (this.field10958 != null) {
                     if (this.field10958.field72 == null) {
                        this.field11033 = true;
                        if (!var2) {
                           break label313;
                        }
                     }

                     this.field11004 = this.field11012 = this.field11067 = null;
                     this.field10970 = null;
                     if (!var2) {
                        break label313;
                     }
                  }

                  if (this.field11043 == null || this.field11043.field72 != null) {
                     this.field10970 = null;
                     this.field11004 = this.field11012 = this.field11067 = null;
                     if (!var2) {
                        break label313;
                     }
                  }

                  this.field11033 = true;
               }
            }

            if (this.field11031 != null && !class552.method3962(false, this.field11008, this.field10978)) {
               label314: {
                  if (this.field11043 == null || this.field11043.field72 != null) {
                     this.field11031 = null;
                     if (!var2) {
                        break label314;
                     }
                  }

                  this.field11033 = true;
               }
            }

            if (this.field10955 != null && !class89.method784(this.field11008, this.field10978, 262144)) {
               label226: {
                  if (this.field11043 != null && this.field11043.field72 == null) {
                     this.field11033 = true;
                     if (!var2) {
                        break label226;
                     }
                  }

                  this.field10955 = null;
               }
            }

            if (this.field11016 != null && !class471.method3414(this.field11008, this.field10978, (byte)19)) {
               label218: {
                  if (this.field11001 != null && this.field11001.field72 == null) {
                     this.field11033 = true;
                     if (!var2) {
                        break label218;
                     }
                  }

                  this.field11016 = this.field10998 = null;
               }
            }

            if (this.field10979 != null && !class151.method1260(-20442, this.field11008, this.field10978)) {
               label315: {
                  if (this.field11043 == null || this.field11043.field72 != null) {
                     this.field10979 = null;
                     if (!var2) {
                        break label315;
                     }
                  }

                  this.field11033 = true;
               }
            }

            if (this.field11048 != null && !class122.method988(this.field10978, this.field11008, (byte)-1)) {
               label317: {
                  if (this.field11063 != null && this.field11063.field5594 == null || this.field11043 != null && this.field11043.field72 == null) {
                     this.field11033 = true;
                     if (!var2) {
                        break label317;
                     }
                  }

                  this.field11048 = this.field10989 = this.field10949 = null;
               }
            }

            if (arg0 <= -112) {
               if (this.field11036 != null && !class151.method1261(this.field10978, 117, this.field11008)) {
                  this.field11036 = null;
                  this.field11066 = null;
               }

               if (this.field11005 != null && !class333.method2464(this.field10978, 32, this.field11008)) {
                  this.field11005 = null;
                  this.field10966 = null;
               }

               if (this.field10982 != null && !class546.method3919(this.field11008, (byte)118, this.field10978)) {
                  this.field10982 = null;
               }

               if (this.field11006 != null && ~(2048 & this.field10978) == -1 && ~(262144 & this.field10978) == -1) {
                  this.field11006 = null;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11074[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "ma",
      descriptor = "()I",
      line = 1105
   )
   public final int method225() {
      try {
         ++field10956;
         if (!this.field10995) {
            this.method5412(true);
         }

         return this.field11071;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[21] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(ZZLpca;IILpca;)Lka;",
      line = 1117
   )
   private final class500 method5414(boolean arg0, boolean arg1, class747 arg2, int arg3, int arg4, class747 arg5) {
      boolean var7 = client.field4360;

      try {
         label576: {
            arg2.field11044 = this.field11044;
            arg2.field10997 = this.field10997;
            ++field11023;
            arg2.field11008 = this.field11008;
            arg2.field10978 = arg3;
            arg2.field10996 = this.field10996;
            arg2.field10962 = this.field10962;
            arg2.field11010 = this.field11010;
            arg2.field11002 = this.field11002;
            arg2.field11052 = this.field11052;
            arg2.field10961 = this.field10961;
            arg2.field11042 = this.field11042;
            if (~(arg3 & 256) == -1) {
               arg2.field11028 = this.field11028;
               if (!var7) {
                  break label576;
               }
            }

            arg2.field11028 = true;
         }

         label581: {
            arg2.field11027 = 0;
            boolean var8 = class316.method2321(arg3, 1024, this.field11008);
            boolean var9 = class760.method5514(arg3, this.field11008, -1);
            boolean var10 = class400.method3026(arg3, this.field11008, true);
            boolean var11 = var9 | var8 | var10;
            if (!var11) {
               arg2.field10951 = this.field10951;
               arg2.field11021 = this.field11021;
               arg2.field10987 = this.field10987;
               if (!var7) {
                  break label581;
               }
            }

            label566: {
               if (var8) {
                  if (arg5.field10951 != null && this.field10961 <= arg5.field10951.length) {
                     arg2.field10951 = arg5.field10951;
                     if (!var7) {
                        break label566;
                     }
                  }

                  arg2.field10951 = arg5.field10951 = new int[this.field10961];
                  if (!var7) {
                     break label566;
                  }
               }

               arg2.field10951 = this.field10951;
            }

            label557: {
               if (var9) {
                  if (arg5.field11021 == null || this.field10961 > arg5.field11021.length) {
                     arg2.field11021 = arg5.field11021 = new int[this.field10961];
                     if (!var7) {
                        break label557;
                     }
                  }

                  arg2.field11021 = arg5.field11021;
                  if (!var7) {
                     break label557;
                  }
               }

               arg2.field11021 = this.field11021;
            }

            label582: {
               if (!var10) {
                  arg2.field10987 = this.field10987;
                  if (!var7) {
                     break label582;
                  }
               }

               if (arg5.field10987 != null && this.field10961 <= arg5.field10987.length) {
                  arg2.field10987 = arg5.field10987;
                  if (!var7) {
                     break label582;
                  }
               }

               arg2.field10987 = arg5.field10987 = new int[this.field10961];
            }

            int var12 = 0;
            if (var7 || var12 < this.field10961) {
               do {
                  if (var8) {
                     arg2.field10951[var12] = this.field10951[var12];
                  }

                  if (var9) {
                     arg2.field11021[var12] = this.field11021[var12];
                  }

                  if (var10) {
                     arg2.field10987[var12] = this.field10987[var12];
                  }

                  ++var12;
               } while(var12 < this.field10961);
            }
         }

         label584: {
            if (!class197.method1553(this.field11008, arg4 ^ arg4, arg3)) {
               if (class787.method5678((byte)8, this.field11008, arg3)) {
                  arg2.field11011 = this.field11011;
                  if (!var7) {
                     break label584;
                  }
               }

               arg2.field11011 = null;
               if (!var7) {
                  break label584;
               }
            }

            if (arg1) {
               arg2.field11027 = (byte)(arg2.field11027 | 1);
            }

            arg2.field11011 = arg5.field11011;
            arg2.field11011.field72 = this.field11011.field72;
            arg2.field11011.field73 = this.field11011.field73;
         }

         label520: {
            if (class792.method5712(arg4 ^ 28475, arg3, this.field11008)) {
               label517: {
                  if (arg5.field11031 != null && ~this.field10996 >= ~arg5.field11031.length) {
                     arg2.field11031 = arg5.field11031;
                     if (!var7) {
                        break label517;
                     }
                  }

                  arg2.field11031 = arg5.field11031 = new short[this.field10996];
               }

               int var13 = 0;
               if (var7) {
                  arg2.field11031[var13] = this.field11031[var13];
                  ++var13;
               }

               while(true) {
                  while(~this.field10996 < ~var13) {
                     arg2.field11031[var13] = this.field11031[var13];
                     ++var13;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label520;
                     }
                     break;
                  }

                  ++var13;
               }
            }

            arg2.field11031 = this.field11031;
         }

         label588: {
            if (!class92.method799((byte)80, arg3, this.field11008)) {
               arg2.field10955 = this.field10955;
               if (!var7) {
                  break label588;
               }
            }

            label615: {
               if (arg5.field10955 == null || arg5.field10955.length < this.field10996) {
                  arg2.field10955 = arg5.field10955 = new byte[this.field10996];
                  if (!var7) {
                     break label615;
                  }
               }

               arg2.field10955 = arg5.field10955;
            }

            int var14 = 0;
            if (var7 || ~var14 > ~this.field10996) {
               do {
                  arg2.field10955[var14] = this.field10955[var14];
                  ++var14;
               } while(~var14 > ~this.field10996);
            }
         }

         label589: {
            if (!class326.method2410(false, arg3, this.field11008)) {
               if (class502.method3644(arg3, false, this.field11008)) {
                  arg2.field11043 = this.field11043;
                  if (!var7) {
                     break label589;
                  }
               }

               arg2.field11043 = null;
               if (!var7) {
                  break label589;
               }
            }

            if (arg1) {
               arg2.field11027 = (byte)(arg2.field11027 | 2);
            }

            arg2.field11043 = arg5.field11043;
            arg2.field11043.field72 = this.field11043.field72;
            arg2.field11043.field73 = this.field11043.field73;
         }

         label590: {
            if (!class583.method4252(arg3, this.field11008, (byte)117)) {
               arg2.field11012 = this.field11012;
               arg2.field11069 = this.field11069;
               arg2.field11067 = this.field11067;
               arg2.field11004 = this.field11004;
               arg2.field10970 = this.field10970;
               if (!var7) {
                  break label590;
               }
            }

            label454: {
               if (arg5.field11004 != null && arg5.field11004.length >= this.field10962) {
                  arg2.field11067 = arg5.field11067;
                  arg2.field11004 = arg5.field11004;
                  arg2.field11012 = arg5.field11012;
                  if (!var7) {
                     break label454;
                  }
               }

               int var15 = this.field10962;
               arg2.field11067 = arg5.field11067 = new short[var15];
               arg2.field11004 = arg5.field11004 = new short[var15];
               arg2.field11012 = arg5.field11012 = new short[var15];
            }

            label618: {
               if (this.field11069 == null) {
                  int var16 = 0;
                  if (var7) {
                     arg2.field11004[var16] = this.field11004[var16];
                     arg2.field11012[var16] = this.field11012[var16];
                     arg2.field11067[var16] = this.field11067[var16];
                     ++var16;
                  }

                  while(true) {
                     while(this.field10962 > var16) {
                        arg2.field11004[var16] = this.field11004[var16];
                        arg2.field11012[var16] = this.field11012[var16];
                        arg2.field11067[var16] = this.field11067[var16];
                        ++var16;
                     }

                     if (!var7) {
                        if (!var7) {
                           break label618;
                        }
                        break;
                     }

                     ++var16;
                  }
               }

               if (arg5.field11069 == null) {
                  arg5.field11069 = new class379();
               }

               class379 var17 = arg2.field11069 = arg5.field11069;
               if (var17.field5459 == null || ~this.field10962 < ~var17.field5459.length) {
                  int var18 = this.field10962;
                  var17.field5460 = new short[var18];
                  var17.field5463 = new byte[var18];
                  var17.field5459 = new short[var18];
                  var17.field5464 = new short[var18];
               }

               int var19 = 0;
               if (var7 || var19 < this.field10962) {
                  do {
                     arg2.field11004[var19] = this.field11004[var19];
                     arg2.field11012[var19] = this.field11012[var19];
                     arg2.field11067[var19] = this.field11067[var19];
                     var17.field5459[var19] = this.field11069.field5459[var19];
                     var17.field5460[var19] = this.field11069.field5460[var19];
                     var17.field5464[var19] = this.field11069.field5464[var19];
                     var17.field5463[var19] = this.field11069.field5463[var19];
                     ++var19;
                  } while(var19 < this.field10962);
               }
            }

            arg2.field10970 = this.field10970;
         }

         label595: {
            if (!class403.method3041(arg3, this.field11008, 0)) {
               if (class290.method2185(31695, arg3, this.field11008)) {
                  arg2.field10958 = this.field10958;
                  if (!var7) {
                     break label595;
                  }
               }

               arg2.field10958 = null;
               if (!var7) {
                  break label595;
               }
            }

            arg2.field10958 = arg5.field10958;
            if (arg1) {
               arg2.field11027 = (byte)(arg2.field11027 | 4);
            }

            arg2.field10958.field73 = this.field10958.field73;
            arg2.field10958.field72 = this.field10958.field72;
         }

         label596: {
            if (!class222.method1744(arg3, 19887, this.field11008)) {
               arg2.field10998 = this.field10998;
               arg2.field11016 = this.field11016;
               if (!var7) {
                  break label596;
               }
            }

            label394: {
               if (arg5.field11016 != null && this.field10996 <= arg5.field11016.length) {
                  arg2.field11016 = arg5.field11016;
                  arg2.field10998 = arg5.field10998;
                  if (!var7) {
                     break label394;
                  }
               }

               int var20 = this.field10962;
               arg2.field10998 = arg5.field10998 = new float[var20];
               arg2.field11016 = arg5.field11016 = new float[var20];
            }

            int var21 = 0;
            if (var7 || ~this.field10962 < ~var21) {
               do {
                  arg2.field11016[var21] = this.field11016[var21];
                  arg2.field10998[var21] = this.field10998[var21];
                  ++var21;
               } while(~this.field10962 < ~var21);
            }
         }

         label597: {
            if (class159.method1329(arg3, this.field11008, 64)) {
               if (arg1) {
                  arg2.field11027 = (byte)(arg2.field11027 | 8);
               }

               arg2.field11001 = arg5.field11001;
               arg2.field11001.field73 = this.field11001.field73;
               arg2.field11001.field72 = this.field11001.field72;
               if (!var7) {
                  break label597;
               }
            }

            if (class627.method4551(this.field11008, (byte)127, arg3)) {
               arg2.field11001 = this.field11001;
               if (!var7) {
                  break label597;
               }
            }

            arg2.field11001 = null;
         }

         label369: {
            if (class366.method2729(-122, arg3, this.field11008)) {
               label366: {
                  if (arg5.field11048 != null && arg5.field11048.length >= this.field10996) {
                     arg2.field10989 = arg5.field10989;
                     arg2.field11048 = arg5.field11048;
                     arg2.field10949 = arg5.field10949;
                     if (!var7) {
                        break label366;
                     }
                  }

                  int var22 = this.field10996;
                  arg2.field10949 = arg5.field10949 = new short[var22];
                  arg2.field11048 = arg5.field11048 = new short[var22];
                  arg2.field10989 = arg5.field10989 = new short[var22];
               }

               int var23 = 0;
               if (var7) {
                  arg2.field11048[var23] = this.field11048[var23];
                  arg2.field10989[var23] = this.field10989[var23];
                  arg2.field10949[var23] = this.field10949[var23];
                  ++var23;
               }

               while(true) {
                  while(~this.field10996 < ~var23) {
                     arg2.field11048[var23] = this.field11048[var23];
                     arg2.field10989[var23] = this.field10989[var23];
                     arg2.field10949[var23] = this.field10949[var23];
                     ++var23;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label369;
                     }
                     break;
                  }

                  ++var23;
               }
            }

            arg2.field10949 = this.field10949;
            arg2.field10989 = this.field10989;
            arg2.field11048 = this.field11048;
         }

         label601: {
            if (!class13.method75(arg3, 89, this.field11008)) {
               if (!class97.method823(this.field11008, false, arg3)) {
                  arg2.field11063 = null;
                  if (!var7) {
                     break label601;
                  }
               }

               arg2.field11063 = this.field11063;
               if (!var7) {
                  break label601;
               }
            }

            arg2.field11063 = arg5.field11063;
            if (arg1) {
               arg2.field11027 = (byte)(arg2.field11027 | 16);
            }

            arg2.field11063.field5594 = this.field11063.field5594;
         }

         label602: {
            if (!class36.method321((byte)101, this.field11008, arg3)) {
               arg2.field10979 = this.field10979;
               if (!var7) {
                  break label602;
               }
            }

            label616: {
               if (arg5.field10979 == null || arg5.field10979.length < this.field10996) {
                  int var24 = this.field10996;
                  arg2.field10979 = arg5.field10979 = new short[var24];
                  if (!var7) {
                     break label616;
                  }
               }

               arg2.field10979 = arg5.field10979;
            }

            int var25 = 0;
            if (var7 || ~var25 > ~this.field10996) {
               do {
                  arg2.field10979[var25] = this.field10979[var25];
                  ++var25;
               } while(~var25 > ~this.field10996);
            }
         }

         label617: {
            if (!class110.method896(this.field11008, arg3, -75)) {
               arg2.field10984 = this.field10984;
               if (!var7) {
                  break label617;
               }
            }

            if (arg5.field10984 == null || arg5.field10984.length < this.field11042) {
               int var26 = this.field11042;
               arg2.field10984 = arg5.field10984 = new class319[var26];
               int var27 = 0;
               if (var7) {
                  arg2.field10984[var27] = this.field10984[var27].method2362(false);
                  ++var27;
               }

               while(true) {
                  while(~var27 > ~this.field11042) {
                     arg2.field10984[var27] = this.field10984[var27].method2362(false);
                     ++var27;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label617;
                     }
                     break;
                  }

                  ++var27;
               }
            }

            arg2.field10984 = arg5.field10984;
            int var28 = 0;
            if (var7 || ~this.field11042 < ~var28) {
               do {
                  arg2.field10984[var28].method2366((byte)-96, this.field10984[var28]);
                  ++var28;
               } while(~this.field11042 < ~var28);
            }
         }

         label267: {
            arg2.field11005 = this.field11005;
            arg2.field10966 = this.field10966;
            if (!this.field10995) {
               arg2.field10995 = false;
               if (!var7) {
                  break label267;
               }
            }

            arg2.field10995 = true;
            arg2.field11019 = this.field11019;
            arg2.field11029 = this.field11029;
            arg2.field10974 = this.field10974;
            arg2.field11071 = this.field11071;
            arg2.field11000 = this.field11000;
            arg2.field10975 = this.field10975;
            arg2.field10965 = this.field10965;
            arg2.field11020 = this.field11020;
         }

         arg2.field11006 = this.field11006;
         arg2.field11036 = this.field11036;
         arg2.field10994 = this.field10994;
         arg2.field10982 = this.field10982;
         arg2.field11045 = this.field11045;
         arg2.field10954 = this.field10954;
         arg2.field10964 = this.field10964;
         arg2.field11066 = this.field11066;
         arg2.field10986 = this.field10986;
         return arg2;
      } catch (RuntimeException var30) {
         throw class237.method1823(var30, field11074[27] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11074[0] : field11074[1]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11074[0] : field11074[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IIII)V",
      line = 1583
   )
   public final void method187(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         int var6 = 0;
         int var11;
         class116 var12;
         class319 var13;
         class747 var10000;
         if (var5) {
            var10000 = this;
         } else if (var6 >= this.field10996) {
            ++field11055;
            var10000 = this;
            if (!var5) {
               if (this.field10994 != null) {
                  var11 = 0;
                  if (var5 || this.field11042 > var11) {
                     do {
                        var12 = this.field10994[var11];
                        var13 = this.field10984[var11];
                        var13.field4362 = 16777215 & class546.field7829[this.field11031[var12.field1447] & 65535] | var13.field4362 & -16777216;
                        ++var11;
                     } while(this.field11042 > var11);
                  }
               }

               if (this.field11043 != null) {
                  this.field11043.field72 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var7 = var10000.field11031[var6] & 65535;
            int var8 = (var7 & 65384) >> 10;
            int var9 = 7 & var7 >> 7;
            if (~arg0 != 0) {
               var8 += (arg0 - var8) * arg3 >> 7;
            }

            int var10 = var7 & 127;
            if (arg1 != -1) {
               var9 += (arg1 - var9) * arg3 >> 7;
            }

            if (~arg2 != 0) {
               var10 -= -((arg2 - var10) * arg3 >> 7);
            }

            this.field11031[var6] = (short)class300.method2238(var10, class300.method2238(var9 << 7, var8 << 10));
            ++var6;
            if (var6 >= this.field10996) {
               ++field11055;
               var10000 = this;
               if (!var5) {
                  if (this.field10994 != null) {
                     var11 = 0;
                     if (var5 || this.field11042 > var11) {
                        do {
                           var12 = this.field10994[var11];
                           var13 = this.field10984[var11];
                           var13.field4362 = 16777215 & class546.field7829[this.field11031[var12.field1447] & 65535] | var13.field4362 & -16777216;
                           ++var11;
                        } while(this.field11042 > var11);
                     }
                  }

                  if (this.field11043 != null) {
                     this.field11043.field72 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field11074[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lew;IZ)V",
      line = 1645
   )
   public final void method167(class521 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "e",
      descriptor = "()V",
      line = 1679
   )
   public final void method169() {
      try {
         ++field11039;
         if (this.field10962 > 0 && this.field11010 > 0) {
            this.method5421(false, false);
            if (~(16 & this.field11027) == -1 && this.field11063.field5594 == null) {
               this.method5416(false, (byte)-92);
            }

            this.method5413((byte)-117);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "C",
      descriptor = "(I)V",
      line = 1695
   )
   public final void method219(int arg0) {
      try {
         if (this.field11043 != null) {
            this.field11043.field72 = null;
         }

         ++field11060;
         this.field11052 = (short)arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11074[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(BIZ)Lka;",
      line = 1709
   )
   public final class500 method159(byte arg0, int arg1, boolean arg2) {
      boolean var4 = client.field4360;

      try {
         ++field10960;
         class747 var5;
         class747 var6;
         if (~arg0 != -2) {
            if (arg0 == 2) {
               var5 = this.field10973.field8393;
               var6 = this.field10973.field8460;
               if (!var4) {
                  return this.method5414(arg2, arg0 != 0, var5, arg1, -22667, var6);
               }
            }

            if (arg0 == 3) {
               var6 = this.field10973.field8389;
               var5 = this.field10973.field8421;
               if (!var4) {
                  return this.method5414(arg2, arg0 != 0, var5, arg1, -22667, var6);
               }
            }

            if (arg0 == 4) {
               var5 = this.field10973.field8474;
               var6 = this.field10973.field8487;
               if (!var4) {
                  return this.method5414(arg2, arg0 != 0, var5, arg1, -22667, var6);
               }
            }

            if (~arg0 == -6) {
               var6 = this.field10973.field8466;
               var5 = this.field10973.field8479;
               if (!var4) {
                  return this.method5414(arg2, arg0 != 0, var5, arg1, -22667, var6);
               }
            }

            var5 = var6 = new class747(this.field10973);
            if (!var4) {
               return this.method5414(arg2, arg0 != 0, var5, arg1, -22667, var6);
            }
         }

         var6 = this.field10973.field8498;
         var5 = this.field10973.field8425;
         return this.method5414(arg2, arg0 != 0, var5, arg1, -22667, var6);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11074[26] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "HA",
      descriptor = "()I",
      line = 1759
   )
   public final int method197() {
      try {
         if (!this.field10995) {
            this.method5412(true);
         }

         ++field10963;
         return this.field11029;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[44] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 1770
   )
   private final boolean method5415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field11015;
         if (~arg7 > ~arg1 && ~arg7 > ~arg4 && ~arg7 > ~arg0) {
            return false;
         } else if (~arg1 > ~arg7 && arg7 > arg4 && arg7 > arg0) {
            return false;
         } else if (arg5 > arg2 && arg3 > arg2 && ~arg2 > ~arg6) {
            return false;
         } else if (arg2 > arg5 && arg2 > arg3 && ~arg2 < ~arg6) {
            return false;
         } else {
            if (arg8 != 16383) {
               this.field11001 = null;
            }

            return true;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field11074[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lew;)V",
      line = 1796
   )
   public final void method190(class521 arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10972;
         class507 var3 = (class507)arg0;
         if (this.field10964 != null) {
            int var4 = 0;
            if (var2 || this.field10964.length > var4) {
               do {
                  class370 var5 = this.field10964[var4];
                  class370 var6 = var5;
                  if (var5.field5377 != null) {
                     var6 = var5.field5377;
                  }

                  var6.field5383 = (int)((float)this.field10987[var5.field5386] * var3.field7391 + (float)this.field11021[var5.field5386] * var3.field7395 + (float)this.field10951[var5.field5386] * var3.field7399 + var3.field7393);
                  var6.field5371 = (int)((float)this.field10987[var5.field5386] * var3.field7366 + (float)this.field11021[var5.field5386] * var3.field7400 + (float)this.field10951[var5.field5386] * var3.field7365 + var3.field7402);
                  var6.field5382 = (int)((float)this.field10987[var5.field5386] * var3.field7401 + (float)this.field11021[var5.field5386] * var3.field7386 + (float)this.field10951[var5.field5386] * var3.field7383 + var3.field7392);
                  var6.field5369 = (int)((float)this.field10987[var5.field5368] * var3.field7391 + (float)this.field11021[var5.field5368] * var3.field7395 + (float)this.field10951[var5.field5368] * var3.field7399 + var3.field7393);
                  var6.field5380 = (int)((float)this.field10987[var5.field5368] * var3.field7366 + (float)this.field11021[var5.field5368] * var3.field7400 + (float)this.field10951[var5.field5368] * var3.field7365 + var3.field7402);
                  var6.field5373 = (int)((float)this.field10987[var5.field5368] * var3.field7401 + (float)this.field11021[var5.field5368] * var3.field7386 + (float)this.field10951[var5.field5368] * var3.field7383 + var3.field7392);
                  var6.field5381 = (int)((float)this.field10987[var5.field5385] * var3.field7391 + (float)this.field11021[var5.field5385] * var3.field7395 + (float)this.field10951[var5.field5385] * var3.field7399 + var3.field7393);
                  var6.field5376 = (int)((float)this.field10987[var5.field5385] * var3.field7366 + (float)this.field11021[var5.field5385] * var3.field7400 + (float)this.field10951[var5.field5385] * var3.field7365 + var3.field7402);
                  var6.field5375 = (int)((float)this.field10987[var5.field5385] * var3.field7401 + (float)this.field11021[var5.field5385] * var3.field7386 + (float)this.field10951[var5.field5385] * var3.field7383 + var3.field7392);
                  ++var4;
               } while(this.field10964.length > var4);
            }
         }

         if (this.field11045 != null) {
            int var7 = 0;
            if (var2 || var7 < this.field11045.length) {
               do {
                  class94 var8 = this.field11045[var7];
                  class94 var9 = var8;
                  if (var8.field1217 != null) {
                     var9 = var8.field1217;
                  }

                  if (var8.field1213 != null) {
                     var8.field1213.method1230(var3);
                     if (var2) {
                        var8.field1213 = var3.method1219();
                     }
                  } else {
                     var8.field1213 = var3.method1219();
                  }

                  var9.field1212 = (int)((float)this.field10987[var8.field1214] * var3.field7391 + (float)this.field11021[var8.field1214] * var3.field7395 + (float)this.field10951[var8.field1214] * var3.field7399 + var3.field7393);
                  var9.field1211 = (int)((float)this.field10987[var8.field1214] * var3.field7366 + (float)this.field11021[var8.field1214] * var3.field7400 + (float)this.field10951[var8.field1214] * var3.field7365 + var3.field7402);
                  var9.field1218 = (int)((float)this.field10987[var8.field1214] * var3.field7401 + (float)this.field11021[var8.field1214] * var3.field7386 + (float)this.field10951[var8.field1214] * var3.field7383 + var3.field7392);
                  ++var7;
               } while(var7 < this.field11045.length);

            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field11074[61] + (arg0 != null ? field11074[0] : field11074[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 5723
   )
   public class747(class573 arg0) {
      this.field10961 = 0;
      this.field10995 = false;
      this.field10962 = 0;
      this.field10996 = 0;
      this.field11033 = true;
      this.field11002 = false;
      this.field11028 = false;
      this.field10997 = 0;
      this.field11010 = 0;

      try {
         this.field10973 = arg0;
         this.field11011 = new class7((class485)null, 5126, 3, 0);
         this.field11001 = new class7((class485)null, 5126, 2, 0);
         this.field10958 = new class7((class485)null, 5126, 3, 0);
         this.field11043 = new class7((class485)null, 5121, 4, 0);
         this.field11063 = new class385();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11074[4] + (arg0 != null ? field11074[0] : field11074[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "<init>",
      descriptor = "(Lea;Lio;IIII)V",
      line = 5736
   )
   public class747(class573 arg0, class464 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4360;
      super();
      this.field10961 = 0;
      this.field10995 = false;
      this.field10962 = 0;
      this.field10996 = 0;
      this.field11033 = true;
      this.field11002 = false;
      this.field11028 = false;
      this.field10997 = 0;
      this.field11010 = 0;

      try {
         this.field10973 = arg0;
         this.field11008 = arg5;
         this.field10978 = arg2;
         if (class787.method5678((byte)8, arg5, arg2)) {
            this.field11011 = new class7((class485)null, 5126, 3, 0);
         }

         if (class627.method4551(arg5, (byte)127, arg2)) {
            this.field11001 = new class7((class485)null, 5126, 2, 0);
         }

         if (class290.method2185(31695, arg2, arg5)) {
            this.field10958 = new class7((class485)null, 5126, 3, 0);
         }

         if (class502.method3644(arg2, false, arg5)) {
            this.field11043 = new class7((class485)null, 5121, 4, 0);
         }

         if (class97.method823(arg5, false, arg2)) {
            this.field11063 = new class385();
         }

         class162 var8 = arg0.field802;
         int[] var9 = new int[arg1.field6669];
         this.field10986 = new int[arg1.field6706 - -1];
         int var10 = 0;
         class317 var11;
         if (var7) {
            if (arg1.field6672 != null) {
               if (~arg1.field6672[var10] != -3) {
                  if (arg1.field6679 != null) {
                     if (arg1.field6679[var10] != -1) {
                        var11 = var8.method1354(65535 & arg1.field6679[var10], (byte)-109);
                        if (~(this.field11008 & 64) != -1) {
                           if (!var11.field4328) {
                              if (var11.field4320) {
                                 if (var7) {
                                    var9[this.field10996++] = var10;
                                    ++this.field10986[arg1.field6674[var10]];
                                    ++this.field10986[arg1.field6683[var10]];
                                    ++this.field10986[arg1.field6663[var10]];
                                    ++var10;
                                 } else {
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field10996++] = var10;
                                 ++this.field10986[arg1.field6674[var10]];
                                 ++this.field10986[arg1.field6683[var10]];
                                 ++this.field10986[arg1.field6663[var10]];
                                 ++var10;
                              }
                           } else {
                              var9[this.field10996++] = var10;
                              ++this.field10986[arg1.field6674[var10]];
                              ++this.field10986[arg1.field6683[var10]];
                              ++this.field10986[arg1.field6663[var10]];
                              ++var10;
                           }
                        } else if (var11.field4320) {
                           if (var7) {
                              var9[this.field10996++] = var10;
                              ++this.field10986[arg1.field6674[var10]];
                              ++this.field10986[arg1.field6683[var10]];
                              ++this.field10986[arg1.field6663[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field10996++] = var10;
                           ++this.field10986[arg1.field6674[var10]];
                           ++this.field10986[arg1.field6683[var10]];
                           ++this.field10986[arg1.field6663[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field10996++] = var10;
                        ++this.field10986[arg1.field6674[var10]];
                        ++this.field10986[arg1.field6683[var10]];
                        ++this.field10986[arg1.field6663[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field10996++] = var10;
                     ++this.field10986[arg1.field6674[var10]];
                     ++this.field10986[arg1.field6683[var10]];
                     ++this.field10986[arg1.field6663[var10]];
                     ++var10;
                  }
               } else {
                  ++var10;
               }
            } else if (arg1.field6679 != null) {
               if (arg1.field6679[var10] != -1) {
                  var11 = var8.method1354(65535 & arg1.field6679[var10], (byte)-109);
                  if (~(this.field11008 & 64) != -1) {
                     if (!var11.field4328) {
                        if (var11.field4320) {
                           if (var7) {
                              var9[this.field10996++] = var10;
                              ++this.field10986[arg1.field6674[var10]];
                              ++this.field10986[arg1.field6683[var10]];
                              ++this.field10986[arg1.field6663[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field10996++] = var10;
                           ++this.field10986[arg1.field6674[var10]];
                           ++this.field10986[arg1.field6683[var10]];
                           ++this.field10986[arg1.field6663[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field10996++] = var10;
                        ++this.field10986[arg1.field6674[var10]];
                        ++this.field10986[arg1.field6683[var10]];
                        ++this.field10986[arg1.field6663[var10]];
                        ++var10;
                     }
                  } else if (var11.field4320) {
                     if (var7) {
                        var9[this.field10996++] = var10;
                        ++this.field10986[arg1.field6674[var10]];
                        ++this.field10986[arg1.field6683[var10]];
                        ++this.field10986[arg1.field6663[var10]];
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     var9[this.field10996++] = var10;
                     ++this.field10986[arg1.field6674[var10]];
                     ++this.field10986[arg1.field6683[var10]];
                     ++this.field10986[arg1.field6663[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field10996++] = var10;
                  ++this.field10986[arg1.field6674[var10]];
                  ++this.field10986[arg1.field6683[var10]];
                  ++this.field10986[arg1.field6663[var10]];
                  ++var10;
               }
            } else {
               var9[this.field10996++] = var10;
               ++this.field10986[arg1.field6674[var10]];
               ++this.field10986[arg1.field6683[var10]];
               ++this.field10986[arg1.field6663[var10]];
               ++var10;
            }
         }

         while(true) {
            while(arg1.field6669 > var10) {
               if (arg1.field6672 != null) {
                  if (~arg1.field6672[var10] != -3) {
                     if (arg1.field6679 != null) {
                        if (arg1.field6679[var10] != -1) {
                           var11 = var8.method1354(65535 & arg1.field6679[var10], (byte)-109);
                           if (~(this.field11008 & 64) != -1) {
                              if (!var11.field4328) {
                                 if (var11.field4320) {
                                    if (var7) {
                                       var9[this.field10996++] = var10;
                                       ++this.field10986[arg1.field6674[var10]];
                                       ++this.field10986[arg1.field6683[var10]];
                                       ++this.field10986[arg1.field6663[var10]];
                                       ++var10;
                                    } else {
                                       ++var10;
                                    }
                                 } else {
                                    var9[this.field10996++] = var10;
                                    ++this.field10986[arg1.field6674[var10]];
                                    ++this.field10986[arg1.field6683[var10]];
                                    ++this.field10986[arg1.field6663[var10]];
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field10996++] = var10;
                                 ++this.field10986[arg1.field6674[var10]];
                                 ++this.field10986[arg1.field6683[var10]];
                                 ++this.field10986[arg1.field6663[var10]];
                                 ++var10;
                              }
                           } else if (var11.field4320) {
                              if (var7) {
                                 var9[this.field10996++] = var10;
                                 ++this.field10986[arg1.field6674[var10]];
                                 ++this.field10986[arg1.field6683[var10]];
                                 ++this.field10986[arg1.field6663[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field10996++] = var10;
                              ++this.field10986[arg1.field6674[var10]];
                              ++this.field10986[arg1.field6683[var10]];
                              ++this.field10986[arg1.field6663[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field10996++] = var10;
                           ++this.field10986[arg1.field6674[var10]];
                           ++this.field10986[arg1.field6683[var10]];
                           ++this.field10986[arg1.field6663[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field10996++] = var10;
                        ++this.field10986[arg1.field6674[var10]];
                        ++this.field10986[arg1.field6683[var10]];
                        ++this.field10986[arg1.field6663[var10]];
                        ++var10;
                     }
                  } else {
                     ++var10;
                  }
               } else if (arg1.field6679 != null) {
                  if (arg1.field6679[var10] != -1) {
                     var11 = var8.method1354(65535 & arg1.field6679[var10], (byte)-109);
                     if (~(this.field11008 & 64) != -1) {
                        if (!var11.field4328) {
                           if (var11.field4320) {
                              if (var7) {
                                 var9[this.field10996++] = var10;
                                 ++this.field10986[arg1.field6674[var10]];
                                 ++this.field10986[arg1.field6683[var10]];
                                 ++this.field10986[arg1.field6663[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field10996++] = var10;
                              ++this.field10986[arg1.field6674[var10]];
                              ++this.field10986[arg1.field6683[var10]];
                              ++this.field10986[arg1.field6663[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field10996++] = var10;
                           ++this.field10986[arg1.field6674[var10]];
                           ++this.field10986[arg1.field6683[var10]];
                           ++this.field10986[arg1.field6663[var10]];
                           ++var10;
                        }
                     } else if (var11.field4320) {
                        if (var7) {
                           var9[this.field10996++] = var10;
                           ++this.field10986[arg1.field6674[var10]];
                           ++this.field10986[arg1.field6683[var10]];
                           ++this.field10986[arg1.field6663[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field10996++] = var10;
                        ++this.field10986[arg1.field6674[var10]];
                        ++this.field10986[arg1.field6683[var10]];
                        ++this.field10986[arg1.field6663[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field10996++] = var10;
                     ++this.field10986[arg1.field6674[var10]];
                     ++this.field10986[arg1.field6683[var10]];
                     ++this.field10986[arg1.field6663[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field10996++] = var10;
                  ++this.field10986[arg1.field6674[var10]];
                  ++this.field10986[arg1.field6683[var10]];
                  ++this.field10986[arg1.field6663[var10]];
                  ++var10;
               }
            }

            this.field11010 = this.field10996;
            long[] var12 = new long[this.field10996];
            int var10000 = ~(this.field10978 & 256);
            if (!var7) {
               label1092: {
                  boolean var13 = var10000 != -1;
                  int var14 = 0;
                  if (var7) {
                     var10000 = var9[var14];
                  } else if (var14 >= this.field10996) {
                     class503.method3652(var9, (byte)-83, var12);
                     this.field10997 = arg1.field6706;
                     this.field10961 = arg1.field6686;
                     this.field10951 = arg1.field6694;
                     this.field11021 = arg1.field6668;
                     this.field10966 = arg1.field6688;
                     this.field10987 = arg1.field6681;
                     this.field10964 = arg1.field6656;
                     var10000 = this.field10997;
                     if (!var7) {
                        break label1092;
                     }
                  } else {
                     var10000 = var9[var14];
                  }

                  while(true) {
                     label3372: {
                        int var15 = var10000;
                        class317 var16 = null;
                        int var17 = 0;
                        byte var18 = 0;
                        byte var19 = 0;
                        byte var20 = 0;
                        if (arg1.field6678 != null) {
                           boolean var21 = false;
                           int var22 = 0;
                           class416 var23;
                           class346 var24;
                           class317 var25;
                           if (var7) {
                              var23 = arg1.field6678[var22];
                              if (var23.field5996 == var15) {
                                 var24 = class392.method2978(var23.field5990, (byte)-79);
                                 if (var24.field4677) {
                                    var21 = true;
                                 }

                                 if (var24.field4682 != -1) {
                                    var25 = var8.method1354(var24.field4682, (byte)-109);
                                    if (~var25.field4319 == -3) {
                                       this.field11028 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           while(~var22 > ~arg1.field6678.length) {
                              var23 = arg1.field6678[var22];
                              if (var23.field5996 == var15) {
                                 var24 = class392.method2978(var23.field5990, (byte)-79);
                                 if (var24.field4677) {
                                    var21 = true;
                                 }

                                 if (var24.field4682 != -1) {
                                    var25 = var8.method1354(var24.field4682, (byte)-109);
                                    if (~var25.field4319 == -3) {
                                       this.field11028 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           if (var21) {
                              var12[var14] = Long.MAX_VALUE;
                              --this.field11010;
                              if (!var7) {
                                 ++var14;
                                 break label3372;
                              }
                           }
                        }

                        short var26 = -1;
                        if (arg1.field6679 != null) {
                           var26 = arg1.field6679[var15];
                           if (var26 != -1) {
                              var16 = var8.method1354(var26 & 65535, (byte)-109);
                              if ((64 & this.field11008) != 0) {
                                 if (var16.field4328) {
                                    var16 = null;
                                    var26 = -1;
                                 } else {
                                    var20 = var16.field4316;
                                    var19 = var16.field4308;
                                    if (var16.field4326 == 0) {
                                       if (~var16.field4327 != -1) {
                                          this.field11002 = true;
                                       }
                                    } else {
                                       this.field11002 = true;
                                    }
                                 }
                              } else {
                                 var20 = var16.field4316;
                                 var19 = var16.field4308;
                                 if (var16.field4326 == 0) {
                                    if (~var16.field4327 != -1) {
                                       this.field11002 = true;
                                    }
                                 } else {
                                    this.field11002 = true;
                                 }
                              }
                           }
                        }

                        boolean var27 = arg1.field6667 != null ? (arg1.field6667[var15] == 0 ? (var16 != null ? var16.field4319 != 0 : false) : true) : (var16 != null ? var16.field4319 != 0 : false);
                        if (!var13) {
                           if (var27 && arg1.field6677 != null) {
                              var17 += arg1.field6677[var15] << 17;
                           }
                        } else if (arg1.field6677 != null) {
                           var17 += arg1.field6677[var15] << 17;
                        }

                        if (var27) {
                           var17 += 65536;
                        }

                        int var28 = (65280 & var19 << 8) + var17;
                        int var29 = (255 & var20) + var28;
                        int var30 = (-65536 & var26 << 16) + var18;
                        int var31 = (65535 & var14) + var30;
                        var12[var14] = ((long)var29 << 32) + (long)var31;
                        this.field11002 |= var16 != null ? (var16.field4326 == 0 ? var16.field4327 != 0 : true) : false;
                        this.field11028 |= var27;
                        ++var14;
                     }

                     if (var14 >= this.field10996) {
                        class503.method3652(var9, (byte)-83, var12);
                        this.field10997 = arg1.field6706;
                        this.field10961 = arg1.field6686;
                        this.field10951 = arg1.field6694;
                        this.field11021 = arg1.field6668;
                        this.field10966 = arg1.field6688;
                        this.field10987 = arg1.field6681;
                        this.field10964 = arg1.field6656;
                        var10000 = this.field10997;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var9[var14];
                     }
                  }
               }

               class165[] var32 = new class165[var10000];
               this.field11045 = arg1.field6696;
               int var10002;
               int var33;
               int var40;
               int var41;
               int var42;
               class532 var43;
               class526[] var44;
               int var45;
               int var46;
               short var47;
               short var48;
               int var49;
               int var50;
               int var51;
               int var52;
               int var53;
               int var54;
               int var55;
               int var56;
               int var57;
               int var58;
               int var59;
               int var60;
               int var61;
               byte var62;
               class165 var63;
               class165 var64;
               class165 var65;
               class526 var66;
               int var67;
               int var68;
               int var69;
               int var70;
               short var71;
               class317 var72;
               float var73;
               float var74;
               float var75;
               float var76;
               float var77;
               float var78;
               byte var79;
               byte var80;
               int var81;
               byte var82;
               short var83;
               short var84;
               short var85;
               short var86;
               short var87;
               short var88;
               float var89;
               float var90;
               float var91;
               float var92;
               float var93;
               float var94;
               float var95;
               float var96;
               float var97;
               float var98;
               float var99;
               float var100;
               float var101;
               float var102;
               float var103;
               float var104;
               float var105;
               float var106;
               float var107;
               float var108;
               float var109;
               float var110;
               float var111;
               float var112;
               float var113;
               float var114;
               float var115;
               float var116;
               float var117;
               short var118;
               short var119;
               short var120;
               int var121;
               int var122;
               int var123;
               float[] var124;
               byte var125;
               float var126;
               float var127;
               float var128;
               float var129;
               float var130;
               int var131;
               int var132;
               int var133;
               int var134;
               int var135;
               int var136;
               int var137;
               int var138;
               int var139;
               float var140;
               float var141;
               float var142;
               float var143;
               float var144;
               float var145;
               byte var146;
               long var147;
               short var149;
               short var150;
               short var151;
               class165 var152;
               class165 var153;
               class165 var154;
               class526 var155;
               long var156;
               int var158;
               short var159;
               short var160;
               int var161;
               int[] var162;
               int var163;
               int var164;
               int var165;
               int var166;
               int var169;
               class464 var170;
               class747 var171;
               if (arg1.field6678 != null) {
                  this.field11042 = arg1.field6678.length;
                  this.field10984 = new class319[this.field11042];
                  this.field10994 = new class116[this.field11042];
                  var33 = 0;
                  if (var7) {
                     var170 = arg1;
                  } else if (~var33 <= ~this.field11042) {
                     var33 = this.field10996 * 3;
                     this.field10955 = new byte[this.field10996];
                     this.field11016 = new float[var33];
                     this.field10979 = new short[this.field10996];
                     this.field11031 = new short[this.field10996];
                     this.field11012 = new short[var33];
                     this.field11052 = (short)arg3;
                     this.field10949 = new short[this.field10996];
                     this.field10998 = new float[var33];
                     this.field10989 = new short[this.field10996];
                     this.field10970 = new byte[var33];
                     this.field11067 = new short[var33];
                     this.field11004 = new short[var33];
                     this.field10954 = new short[var33];
                     class550.field7890 = new long[var33];
                     var170 = arg1;
                     if (!var7) {
                        if (arg1.field6671 != null) {
                           this.field11066 = new short[this.field10996];
                        }

                        this.field11048 = new short[this.field10996];
                        this.field11044 = (short)arg4;
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field10986[var41];
                           this.field10986[var41] = var40;
                           var32[var41] = new class165();
                           var40 += var42;
                           ++var41;
                        }

                        while(true) {
                           if (arg1.field6706 <= var41) {
                              this.field10986[arg1.field6706] = var40;
                              var43 = class88.method774(arg1, this.field10996, -98, var9);
                              var44 = new class526[arg1.field6669];
                              var10000 = 0;
                              if (!var7) {
                                 label2087: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field6674[var45];
                                    } else if (var45 >= arg1.field6669) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label2087;
                                       }
                                    } else {
                                       var46 = arg1.field6674[var45];
                                    }

                                    label2090:
                                    while(true) {
                                       var47 = arg1.field6683[var45];
                                       var48 = arg1.field6663[var45];
                                       var49 = this.field10951[var47] - this.field10951[var46];
                                       var50 = this.field11021[var47] + -this.field11021[var46];
                                       var51 = this.field10987[var47] + -this.field10987[var46];
                                       var52 = this.field10951[var48] + -this.field10951[var46];
                                       var53 = this.field11021[var48] + -this.field11021[var46];
                                       var54 = this.field10987[var48] + -this.field10987[var46];
                                       var55 = var50 * var54 - var51 * var53;
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 + -(var50 * var52);
                                       if (var7) {
                                          var56 >>= 1;
                                          var57 >>= 1;
                                          var55 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                if (var7) {
                                                   var55 = var56 >> 8192;
                                                   continue;
                                                }

                                                if (var56 <= 8192 && ~var57 >= -8193 && ~var55 <= 8191 && ~var56 <= 8191 && ~var57 <= 8191) {
                                                   var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                   if (var58 <= 0) {
                                                      var58 = 1;
                                                   }

                                                   var59 = var57 * 256 / var58;
                                                   var60 = var56 * 256 / var58;
                                                   var61 = var55 * 256 / var58;
                                                   var62 = arg1.field6672 == null ? 0 : arg1.field6672[var45];
                                                   if (var62 == 0) {
                                                      var63 = var32[var46];
                                                      ++var63.field2334;
                                                      var63.field2333 += var59;
                                                      var63.field2327 += var60;
                                                      var63.field2330 += var61;
                                                      var64 = var32[var47];
                                                      var64.field2333 += var59;
                                                      var64.field2327 += var60;
                                                      ++var64.field2334;
                                                      var64.field2330 += var61;
                                                      var65 = var32[var48];
                                                      var65.field2333 += var59;
                                                      var65.field2327 += var60;
                                                      var65.field2330 += var61;
                                                      ++var65.field2334;
                                                      if (var7) {
                                                         if (~var62 == -2) {
                                                            var66 = var44[var45] = new class526();
                                                            var66.field7535 = var61;
                                                            var66.field7534 = var60;
                                                            var66.field7536 = var59;
                                                         }

                                                         ++var45;
                                                      } else {
                                                         ++var45;
                                                      }
                                                   } else {
                                                      if (~var62 == -2) {
                                                         var66 = var44[var45] = new class526();
                                                         var66.field7535 = var61;
                                                         var66.field7534 = var60;
                                                         var66.field7536 = var59;
                                                      }

                                                      ++var45;
                                                   }

                                                   if (var45 >= arg1.field6669) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label2090;
                                                      }
                                                   } else {
                                                      var46 = arg1.field6674[var45];
                                                   }
                                                   continue label2090;
                                                }
                                             }

                                             var56 >>= 1;
                                             var57 >>= 1;
                                             var55 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field6697[var67];
                                    if (arg1.field6676 == null) {
                                       var69 = -1;
                                       if (var7) {
                                          var69 = arg1.field6676[var67];
                                       }
                                    } else {
                                       var69 = arg1.field6676[var67];
                                    }

                                    if (arg1.field6667 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field6667[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field6667[var67] & 255;
                                    }

                                    var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                    if (~var71 != 0 && (64 & this.field11008) != 0) {
                                       var72 = var8.method1354(65535 & var71, (byte)-109);
                                       if (var72.field4328) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (var46 >= this.field10996) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field10979[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field11010) {
                                                this.field11006 = new int[var67 + 1];
                                                var68 = -10000;
                                                var67 = 0;
                                                var169 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field11010 >= ~var169) {
                                                         this.field11006[var67] = this.field11010;
                                                         class550.field7890 = null;
                                                         this.field11004 = class314.method2314(36, this.field11004, this.field10962);
                                                         this.field11012 = class314.method2314(101, this.field11012, this.field10962);
                                                         this.field11067 = class314.method2314(53, this.field11067, this.field10962);
                                                         this.field10970 = class190.method1504((byte)49, this.field10962, this.field10970);
                                                         this.field11016 = class522.method3790(this.field10962, this.field11016, true);
                                                         var171 = this;
                                                         if (!var7) {
                                                            this.field10998 = class522.method3790(this.field10962, this.field10998, true);
                                                            if (arg1.field6658 != null && class333.method2464(arg2, 32, this.field11008)) {
                                                               this.field11005 = arg1.method3367(0, false);
                                                            }

                                                            if (arg1.field6678 != null && class546.method3919(this.field11008, (byte)-101, arg2)) {
                                                               this.field10982 = arg1.method3382(256);
                                                            }

                                                            if (arg1.field6704 != null && class151.method1261(arg2, 127, this.field11008)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field6704[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field10996 <= var163) {
                                                                     this.field11036 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field11036[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field11036[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && var165 >= this.field10996) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field6704[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field11036[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(var165 < this.field10996);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field6704[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field10979[var158];
                                             }

                                             if (var68 != var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field6697[var67];
                                    }

                                    if (arg1.field6676 == null) {
                                       var69 = -1;
                                       if (var7) {
                                          var69 = arg1.field6676[var67];
                                       }
                                    } else {
                                       var69 = arg1.field6676[var67];
                                    }

                                    if (arg1.field6667 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field6667[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field6667[var67] & 255;
                                    }

                                    var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                    if (~var71 != 0 && (64 & this.field11008) != 0) {
                                       var72 = var8.method1354(65535 & var71, (byte)-109);
                                       if (var72.field4328) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (var71 != -1) {
                                       if (var69 != -1) {
                                          label3396: {
                                             var69 &= 255;
                                             var82 = arg1.field6700[var69];
                                             if (~var82 == -1) {
                                                var83 = arg1.field6674[var67];
                                                var84 = arg1.field6683[var67];
                                                var85 = arg1.field6663[var67];
                                                var86 = arg1.field6684[var69];
                                                var87 = arg1.field6708[var69];
                                                var88 = arg1.field6690[var69];
                                                var89 = (float)arg1.field6694[var86];
                                                var90 = (float)arg1.field6668[var86];
                                                var91 = (float)arg1.field6681[var86];
                                                var92 = (float)arg1.field6694[var87] - var89;
                                                var93 = (float)arg1.field6668[var87] - var90;
                                                var94 = (float)arg1.field6681[var87] + -var91;
                                                var95 = (float)arg1.field6694[var88] + -var89;
                                                var96 = (float)arg1.field6668[var88] - var90;
                                                var97 = (float)arg1.field6681[var88] + -var91;
                                                var98 = (float)arg1.field6694[var83] - var89;
                                                var99 = (float)arg1.field6668[var83] + -var90;
                                                var100 = (float)arg1.field6681[var83] + -var91;
                                                var101 = (float)arg1.field6694[var84] - var89;
                                                var102 = (float)arg1.field6668[var84] + -var90;
                                                var103 = (float)arg1.field6681[var84] - var91;
                                                var104 = (float)arg1.field6694[var85] - var89;
                                                var105 = (float)arg1.field6668[var85] - var90;
                                                var106 = (float)arg1.field6681[var85] - var91;
                                                var107 = var93 * var97 + -(var94 * var96);
                                                var108 = var94 * var95 + -(var92 * var97);
                                                var109 = var92 * var96 - var93 * var95;
                                                var110 = var96 * var109 - var97 * var108;
                                                var111 = var97 * var107 - var95 * var109;
                                                var112 = var95 * var108 + -(var96 * var107);
                                                var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                                var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                                var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                                var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                                var114 = var94 * var107 + -(var92 * var109);
                                                var115 = var93 * var109 - var94 * var108;
                                                var116 = var92 * var108 - var93 * var107;
                                                var117 = 1.0F / (var97 * var116 + var95 * var115 + var96 * var114);
                                                var76 = (var103 * var116 + var101 * var115 + var102 * var114) * var117;
                                                var74 = (var100 * var116 + var98 * var115 + var99 * var114) * var117;
                                                var78 = (var106 * var116 + var104 * var115 + var105 * var114) * var117;
                                                if (!var7) {
                                                   break label3396;
                                                }
                                             }

                                             var118 = arg1.field6674[var67];
                                             var119 = arg1.field6683[var67];
                                             var120 = arg1.field6663[var67];
                                             var121 = var43.field7588[var69];
                                             var122 = var43.field7592[var69];
                                             var123 = var43.field7593[var69];
                                             var124 = var43.field7590[var69];
                                             var125 = arg1.field6666[var69];
                                             var126 = (float)arg1.field6695[var69] / 256.0F;
                                             if (~var82 == -2) {
                                                var127 = (float)arg1.field6659[var69] / 1024.0F;
                                                class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var118], var125, var123, arg1.field6668[var118], arg1.field6681[var118], 8, var124, var122);
                                                var74 = class416.field5986[1];
                                                var73 = class416.field5986[0];
                                                class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var119], var125, var123, arg1.field6668[var119], arg1.field6681[var119], 8, var124, var122);
                                                var75 = class416.field5986[0];
                                                var76 = class416.field5986[1];
                                                class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var120], var125, var123, arg1.field6668[var120], arg1.field6681[var120], 8, var124, var122);
                                                var78 = class416.field5986[1];
                                                var77 = class416.field5986[0];
                                                var128 = var127 / 2.0F;
                                                if ((1 & var125) != 0) {
                                                   if (!(-var74 + var78 > var128)) {
                                                      if (var74 - var78 > var128) {
                                                         var80 = 2;
                                                         var78 += var127;
                                                         if (var7) {
                                                            var78 -= var127;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var78 -= var127;
                                                      var80 = 1;
                                                   }

                                                   if (var76 - var74 > var128) {
                                                      var76 -= var127;
                                                      var79 = 1;
                                                      if (!var7) {
                                                         break label3396;
                                                      }
                                                   }

                                                   if (!(var74 - var76 > var128)) {
                                                      break label3396;
                                                   }

                                                   var79 = 2;
                                                   var76 += var127;
                                                   if (!var7) {
                                                      break label3396;
                                                   }

                                                   if (var77 - var73 > var128) {
                                                      var77 -= var127;
                                                      var80 = 1;
                                                      if (var7 && var128 < -var77 + var73) {
                                                         var77 += var127;
                                                         var80 = 2;
                                                      }
                                                   } else if (var128 < -var77 + var73) {
                                                      var77 += var127;
                                                      var80 = 2;
                                                   }
                                                } else if (var77 - var73 > var128) {
                                                   var77 -= var127;
                                                   var80 = 1;
                                                   if (var7 && var128 < -var77 + var73) {
                                                      var77 += var127;
                                                      var80 = 2;
                                                   }
                                                } else if (var128 < -var77 + var73) {
                                                   var77 += var127;
                                                   var80 = 2;
                                                }

                                                if (!(var128 < -var73 + var75)) {
                                                   if (!(var128 < -var75 + var73)) {
                                                      break label3396;
                                                   }

                                                   var75 += var127;
                                                   var79 = 2;
                                                   if (!var7) {
                                                      break label3396;
                                                   }
                                                }

                                                var75 -= var127;
                                                var79 = 1;
                                                if (!var7) {
                                                   break label3396;
                                                }
                                             }

                                             if (var82 != 2) {
                                                if (~var82 == -4) {
                                                   label3514: {
                                                      class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var118], var123, arg1.field6668[var118], var121, arg1.field6681[var118]);
                                                      var73 = class416.field5986[0];
                                                      var74 = class416.field5986[1];
                                                      class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var119], var123, arg1.field6668[var119], var121, arg1.field6681[var119]);
                                                      var75 = class416.field5986[0];
                                                      var76 = class416.field5986[1];
                                                      class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var120], var123, arg1.field6668[var120], var121, arg1.field6681[var120]);
                                                      var77 = class416.field5986[0];
                                                      var78 = class416.field5986[1];
                                                      if (~(var125 & 1) == -1) {
                                                         if (!(-var73 + var77 > 0.5F)) {
                                                            if (-var77 + var73 > 0.5F) {
                                                               ++var77;
                                                               var80 = 2;
                                                               if (var7) {
                                                                  var80 = 1;
                                                                  --var77;
                                                               }
                                                            }
                                                         } else {
                                                            var80 = 1;
                                                            --var77;
                                                         }

                                                         if (var75 - var73 > 0.5F) {
                                                            var79 = 1;
                                                            --var75;
                                                            if (!var7) {
                                                               break label3514;
                                                            }
                                                         }

                                                         if (!(-var75 + var73 > 0.5F)) {
                                                            break label3514;
                                                         }

                                                         var79 = 2;
                                                         ++var75;
                                                         if (!var7) {
                                                            break label3514;
                                                         }

                                                         if (!(var76 - var74 > 0.5F)) {
                                                            if (var74 - var76 > 0.5F) {
                                                               ++var76;
                                                               var79 = 2;
                                                               if (var7) {
                                                                  --var76;
                                                                  var79 = 1;
                                                               }
                                                            }
                                                         } else {
                                                            --var76;
                                                            var79 = 1;
                                                         }
                                                      } else if (!(var76 - var74 > 0.5F)) {
                                                         if (var74 - var76 > 0.5F) {
                                                            ++var76;
                                                            var79 = 2;
                                                            if (var7) {
                                                               --var76;
                                                               var79 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         --var76;
                                                         var79 = 1;
                                                      }

                                                      if (var78 - var74 > 0.5F) {
                                                         --var78;
                                                         var80 = 1;
                                                         if (var7 && var74 - var78 > 0.5F) {
                                                            var80 = 2;
                                                            ++var78;
                                                            if (var7) {
                                                               var129 = (float)arg1.field6675[var69] / 256.0F;
                                                               var130 = (float)arg1.field6682[var69] / 256.0F;
                                                               var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                               var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                               var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                               var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                               var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                               var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                               var137 = var132 * var136 - var133 * var135;
                                                               var138 = var133 * var134 + -(var131 * var136);
                                                               var139 = var131 * var135 + -(var132 * var134);
                                                               var140 = 64.0F / (float)arg1.field6673[var69];
                                                               var141 = 64.0F / (float)arg1.field6689[var69];
                                                               var142 = 64.0F / (float)arg1.field6659[var69];
                                                               var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                               var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                               var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                               var81 = class12.method68(var144, var143, true, var145);
                                                               class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                               var73 = class416.field5986[0];
                                                               var74 = class416.field5986[1];
                                                               class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                               var76 = class416.field5986[1];
                                                               var75 = class416.field5986[0];
                                                               class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                               var77 = class416.field5986[0];
                                                               var78 = class416.field5986[1];
                                                               if (var7) {
                                                                  var76 = 1.0F;
                                                                  var77 = 0.0F;
                                                                  var75 = 1.0F;
                                                                  var78 = 0.0F;
                                                                  var73 = 0.0F;
                                                                  var79 = 1;
                                                                  var74 = 1.0F;
                                                                  var80 = 2;
                                                               }
                                                            }
                                                         }
                                                      } else if (var74 - var78 > 0.5F) {
                                                         var80 = 2;
                                                         ++var78;
                                                         if (var7) {
                                                            var129 = (float)arg1.field6675[var69] / 256.0F;
                                                            var130 = (float)arg1.field6682[var69] / 256.0F;
                                                            var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                            var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                            var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                            var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                            var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                            var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                            var137 = var132 * var136 - var133 * var135;
                                                            var138 = var133 * var134 + -(var131 * var136);
                                                            var139 = var131 * var135 + -(var132 * var134);
                                                            var140 = 64.0F / (float)arg1.field6673[var69];
                                                            var141 = 64.0F / (float)arg1.field6689[var69];
                                                            var142 = 64.0F / (float)arg1.field6659[var69];
                                                            var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                            var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                            var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                            var81 = class12.method68(var144, var143, true, var145);
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var73 = class416.field5986[0];
                                                            var74 = class416.field5986[1];
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var76 = class416.field5986[1];
                                                            var75 = class416.field5986[0];
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var77 = class416.field5986[0];
                                                            var78 = class416.field5986[1];
                                                            if (var7) {
                                                               var76 = 1.0F;
                                                               var77 = 0.0F;
                                                               var75 = 1.0F;
                                                               var78 = 0.0F;
                                                               var73 = 0.0F;
                                                               var79 = 1;
                                                               var74 = 1.0F;
                                                               var80 = 2;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             } else {
                                                var129 = (float)arg1.field6675[var69] / 256.0F;
                                                var130 = (float)arg1.field6682[var69] / 256.0F;
                                                var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                var137 = var132 * var136 - var133 * var135;
                                                var138 = var133 * var134 + -(var131 * var136);
                                                var139 = var131 * var135 + -(var132 * var134);
                                                var140 = 64.0F / (float)arg1.field6673[var69];
                                                var141 = 64.0F / (float)arg1.field6689[var69];
                                                var142 = 64.0F / (float)arg1.field6659[var69];
                                                var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                var81 = class12.method68(var144, var143, true, var145);
                                                class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                var73 = class416.field5986[0];
                                                var74 = class416.field5986[1];
                                                class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                var76 = class416.field5986[1];
                                                var75 = class416.field5986[0];
                                                class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                var77 = class416.field5986[0];
                                                var78 = class416.field5986[1];
                                                if (var7) {
                                                   var76 = 1.0F;
                                                   var77 = 0.0F;
                                                   var75 = 1.0F;
                                                   var78 = 0.0F;
                                                   var73 = 0.0F;
                                                   var79 = 1;
                                                   var74 = 1.0F;
                                                   var80 = 2;
                                                }
                                             }
                                          }
                                       } else {
                                          var76 = 1.0F;
                                          var77 = 0.0F;
                                          var75 = 1.0F;
                                          var78 = 0.0F;
                                          var73 = 0.0F;
                                          var79 = 1;
                                          var74 = 1.0F;
                                          var80 = 2;
                                       }
                                    }

                                    if (arg1.field6672 != null) {
                                       var146 = arg1.field6672[var67];
                                       if (var7) {
                                          var146 = 0;
                                       }
                                    } else {
                                       var146 = 0;
                                    }

                                    if (~var146 == -1) {
                                       var147 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)(var69 << 2);
                                       var149 = arg1.field6674[var67];
                                       var150 = arg1.field6683[var67];
                                       var151 = arg1.field6663[var67];
                                       var152 = var32[var149];
                                       this.field11048[var46] = this.method5423(var73, arg1, (byte)-91, var152.field2334, var152.field2327, var149, var147, var74, var152.field2333, var152.field2330);
                                       var153 = var32[var150];
                                       this.field10989[var46] = this.method5423(var75, arg1, (byte)-86, var153.field2334, var153.field2327, var150, (long)var79 + var147, var76, var153.field2333, var153.field2330);
                                       var154 = var32[var151];
                                       this.field10949[var46] = this.method5423(var77, arg1, (byte)-89, var154.field2334, var154.field2327, var151, (long)var80 + var147, var78, var154.field2333, var154.field2330);
                                       if (var7) {
                                          if (~var146 == -2) {
                                             var155 = var44[var67];
                                             var156 = (long)((~var155.field7535 < -1 ? 1024 : 2048) + (var69 << 2) + (var155.field7534 + 256 << 12) - -(var155.field7536 + 256 << 22)) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                             this.field11048[var46] = this.method5423(var73, arg1, (byte)77, 0, var155.field7534, arg1.field6674[var67], var156, var74, var155.field7536, var155.field7535);
                                             this.field10989[var46] = this.method5423(var75, arg1, (byte)-112, 0, var155.field7534, arg1.field6683[var67], (long)var79 + var156, var76, var155.field7536, var155.field7535);
                                             this.field10949[var46] = this.method5423(var77, arg1, (byte)-127, 0, var155.field7534, arg1.field6663[var67], (long)var80 + var156, var78, var155.field7536, var155.field7535);
                                          }

                                          if (arg1.field6667 != null) {
                                             this.field10955[var46] = arg1.field6667[var67];
                                          }

                                          if (arg1.field6671 != null) {
                                             this.field11066[var46] = arg1.field6671[var67];
                                          }

                                          this.field11031[var46] = arg1.field6697[var67];
                                          this.field10979[var46] = var71;
                                          ++var46;
                                       } else {
                                          if (arg1.field6667 != null) {
                                             this.field10955[var46] = arg1.field6667[var67];
                                          }

                                          if (arg1.field6671 != null) {
                                             this.field11066[var46] = arg1.field6671[var67];
                                          }

                                          this.field11031[var46] = arg1.field6697[var67];
                                          this.field10979[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       if (~var146 == -2) {
                                          var155 = var44[var67];
                                          var156 = (long)((~var155.field7535 < -1 ? 1024 : 2048) + (var69 << 2) + (var155.field7534 + 256 << 12) - -(var155.field7536 + 256 << 22)) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                          this.field11048[var46] = this.method5423(var73, arg1, (byte)77, 0, var155.field7534, arg1.field6674[var67], var156, var74, var155.field7536, var155.field7535);
                                          this.field10989[var46] = this.method5423(var75, arg1, (byte)-112, 0, var155.field7534, arg1.field6683[var67], (long)var79 + var156, var76, var155.field7536, var155.field7535);
                                          this.field10949[var46] = this.method5423(var77, arg1, (byte)-127, 0, var155.field7534, arg1.field6663[var67], (long)var80 + var156, var78, var155.field7536, var155.field7535);
                                       }

                                       if (arg1.field6667 != null) {
                                          this.field10955[var46] = arg1.field6667[var67];
                                       }

                                       if (arg1.field6671 != null) {
                                          this.field11066[var46] = arg1.field6671[var67];
                                       }

                                       this.field11031[var46] = arg1.field6697[var67];
                                       this.field10979[var46] = var71;
                                       ++var46;
                                    }

                                    if (var46 >= this.field10996) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field10979[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field11010) {
                                                this.field11006 = new int[var67 + 1];
                                                var68 = -10000;
                                                var67 = 0;
                                                var169 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field11010 >= ~var169) {
                                                         this.field11006[var67] = this.field11010;
                                                         class550.field7890 = null;
                                                         this.field11004 = class314.method2314(36, this.field11004, this.field10962);
                                                         this.field11012 = class314.method2314(101, this.field11012, this.field10962);
                                                         this.field11067 = class314.method2314(53, this.field11067, this.field10962);
                                                         this.field10970 = class190.method1504((byte)49, this.field10962, this.field10970);
                                                         this.field11016 = class522.method3790(this.field10962, this.field11016, true);
                                                         var171 = this;
                                                         if (!var7) {
                                                            this.field10998 = class522.method3790(this.field10962, this.field10998, true);
                                                            if (arg1.field6658 != null && class333.method2464(arg2, 32, this.field11008)) {
                                                               this.field11005 = arg1.method3367(0, false);
                                                            }

                                                            if (arg1.field6678 != null && class546.method3919(this.field11008, (byte)-101, arg2)) {
                                                               this.field10982 = arg1.method3382(256);
                                                            }

                                                            if (arg1.field6704 != null && class151.method1261(arg2, 127, this.field11008)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field6704[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field10996 <= var163) {
                                                                     this.field11036 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field11036[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field11036[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && var165 >= this.field10996) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field6704[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field11036[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(var165 < this.field10996);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field6704[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field10979[var158];
                                             }

                                             if (var68 != var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field6697[var67];
                                    }

                                    if (arg1.field6676 == null) {
                                       var69 = -1;
                                       if (var7) {
                                          var69 = arg1.field6676[var67];
                                       }
                                    } else {
                                       var69 = arg1.field6676[var67];
                                    }

                                    if (arg1.field6667 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field6667[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field6667[var67] & 255;
                                    }

                                    var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                    if (~var71 != 0 && (64 & this.field11008) != 0) {
                                       var72 = var8.method1354(65535 & var71, (byte)-109);
                                       if (var72.field4328) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field10986[var41];
                           }

                           var42 = var10000;
                           this.field10986[var41] = var40;
                           var32[var41] = new class165();
                           var40 += var42;
                           ++var41;
                        }
                     }
                  } else {
                     var170 = arg1;
                  }
               } else {
                  var33 = this.field10996 * 3;
                  this.field10955 = new byte[this.field10996];
                  this.field11016 = new float[var33];
                  this.field10979 = new short[this.field10996];
                  this.field11031 = new short[this.field10996];
                  this.field11012 = new short[var33];
                  this.field11052 = (short)arg3;
                  this.field10949 = new short[this.field10996];
                  this.field10998 = new float[var33];
                  this.field10989 = new short[this.field10996];
                  this.field10970 = new byte[var33];
                  this.field11067 = new short[var33];
                  this.field11004 = new short[var33];
                  this.field10954 = new short[var33];
                  class550.field7890 = new long[var33];
                  var170 = arg1;
                  if (!var7) {
                     if (arg1.field6671 != null) {
                        this.field11066 = new short[this.field10996];
                     }

                     this.field11048 = new short[this.field10996];
                     this.field11044 = (short)arg4;
                     var40 = 0;
                     var41 = 0;
                     if (var7) {
                        var42 = this.field10986[var41];
                        this.field10986[var41] = var40;
                        var32[var41] = new class165();
                        var40 += var42;
                        ++var41;
                     }

                     while(true) {
                        if (arg1.field6706 <= var41) {
                           this.field10986[arg1.field6706] = var40;
                           var43 = class88.method774(arg1, this.field10996, -98, var9);
                           var44 = new class526[arg1.field6669];
                           var10000 = 0;
                           if (!var7) {
                              label1133: {
                                 var45 = 0;
                                 if (var7) {
                                    var46 = arg1.field6674[var45];
                                 } else if (var45 >= arg1.field6669) {
                                    var46 = 0;
                                    if (!var7) {
                                       break label1133;
                                    }
                                 } else {
                                    var46 = arg1.field6674[var45];
                                 }

                                 label1136:
                                 while(true) {
                                    var47 = arg1.field6683[var45];
                                    var48 = arg1.field6663[var45];
                                    var49 = this.field10951[var47] - this.field10951[var46];
                                    var50 = this.field11021[var47] + -this.field11021[var46];
                                    var51 = this.field10987[var47] + -this.field10987[var46];
                                    var52 = this.field10951[var48] + -this.field10951[var46];
                                    var53 = this.field11021[var48] + -this.field11021[var46];
                                    var54 = this.field10987[var48] + -this.field10987[var46];
                                    var55 = var50 * var54 - var51 * var53;
                                    var56 = var51 * var52 - var49 * var54;
                                    var57 = var49 * var53 + -(var50 * var52);
                                    if (var7) {
                                       var56 >>= 1;
                                       var57 >>= 1;
                                       var55 >>= 1;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (~var55 >= -8193) {
                                             if (var7) {
                                                var55 = var56 >> 8192;
                                                continue;
                                             }

                                             if (var56 <= 8192 && ~var57 >= -8193 && ~var55 <= 8191 && ~var56 <= 8191 && ~var57 <= 8191) {
                                                var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                if (var58 <= 0) {
                                                   var58 = 1;
                                                }

                                                var59 = var57 * 256 / var58;
                                                var60 = var56 * 256 / var58;
                                                var61 = var55 * 256 / var58;
                                                var62 = arg1.field6672 == null ? 0 : arg1.field6672[var45];
                                                if (var62 == 0) {
                                                   var63 = var32[var46];
                                                   ++var63.field2334;
                                                   var63.field2333 += var59;
                                                   var63.field2327 += var60;
                                                   var63.field2330 += var61;
                                                   var64 = var32[var47];
                                                   var64.field2333 += var59;
                                                   var64.field2327 += var60;
                                                   ++var64.field2334;
                                                   var64.field2330 += var61;
                                                   var65 = var32[var48];
                                                   var65.field2333 += var59;
                                                   var65.field2327 += var60;
                                                   var65.field2330 += var61;
                                                   ++var65.field2334;
                                                   if (var7) {
                                                      if (~var62 == -2) {
                                                         var66 = var44[var45] = new class526();
                                                         var66.field7535 = var61;
                                                         var66.field7534 = var60;
                                                         var66.field7536 = var59;
                                                      }

                                                      ++var45;
                                                   } else {
                                                      ++var45;
                                                   }
                                                } else {
                                                   if (~var62 == -2) {
                                                      var66 = var44[var45] = new class526();
                                                      var66.field7535 = var61;
                                                      var66.field7534 = var60;
                                                      var66.field7536 = var59;
                                                   }

                                                   ++var45;
                                                }

                                                if (var45 >= arg1.field6669) {
                                                   var46 = 0;
                                                   if (!var7) {
                                                      break label1136;
                                                   }
                                                } else {
                                                   var46 = arg1.field6674[var45];
                                                }
                                                continue label1136;
                                             }
                                          }

                                          var56 >>= 1;
                                          var57 >>= 1;
                                          var55 >>= 1;
                                       }
                                    }
                                 }
                              }

                              if (var7) {
                                 var67 = var9[var46];
                                 var68 = 65535 & arg1.field6697[var67];
                                 if (arg1.field6676 == null) {
                                    var69 = -1;
                                    if (var7) {
                                       var69 = arg1.field6676[var67];
                                    }
                                 } else {
                                    var69 = arg1.field6676[var67];
                                 }

                                 if (arg1.field6667 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = arg1.field6667[var67] & 255;
                                    }
                                 } else {
                                    var70 = arg1.field6667[var67] & 255;
                                 }

                                 var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                 if (~var71 != 0 && (64 & this.field11008) != 0) {
                                    var72 = var8.method1354(65535 & var71, (byte)-109);
                                    if (var72.field4328) {
                                       var71 = -1;
                                    }
                                 }
                              } else {
                                 if (var46 >= this.field10996) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (!var7) {
                                       if (var7) {
                                          var159 = this.field10979[var158];
                                          if (var68 != var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (var158 >= this.field11010) {
                                             this.field11006 = new int[var67 + 1];
                                             var68 = -10000;
                                             var67 = 0;
                                             var169 = 0;
                                             if (!var7) {
                                                if (var7) {
                                                   var160 = this.field10979[var169];
                                                   if (var68 != var160) {
                                                      this.field11006[var67++] = var169;
                                                      var68 = var160;
                                                   }

                                                   ++var169;
                                                }

                                                while(true) {
                                                   if (~this.field11010 >= ~var169) {
                                                      this.field11006[var67] = this.field11010;
                                                      class550.field7890 = null;
                                                      this.field11004 = class314.method2314(36, this.field11004, this.field10962);
                                                      this.field11012 = class314.method2314(101, this.field11012, this.field10962);
                                                      this.field11067 = class314.method2314(53, this.field11067, this.field10962);
                                                      this.field10970 = class190.method1504((byte)49, this.field10962, this.field10970);
                                                      this.field11016 = class522.method3790(this.field10962, this.field11016, true);
                                                      var171 = this;
                                                      if (!var7) {
                                                         this.field10998 = class522.method3790(this.field10962, this.field10998, true);
                                                         if (arg1.field6658 != null && class333.method2464(arg2, 32, this.field11008)) {
                                                            this.field11005 = arg1.method3367(0, false);
                                                         }

                                                         if (arg1.field6678 != null && class546.method3919(this.field11008, (byte)-101, arg2)) {
                                                            this.field10982 = arg1.method3382(256);
                                                         }

                                                         if (arg1.field6704 != null && class151.method1261(arg2, 127, this.field11008)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7) {
                                                               var164 = arg1.field6704[var9[var163]];
                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (this.field10996 <= var163) {
                                                                  this.field11036 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (!var7) {
                                                                     if (var7) {
                                                                        this.field11036[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(var164 <= var161) {
                                                                           this.field11036[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (!var7) {
                                                                           if (!var7 && var165 >= this.field10996) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field6704[var9[var165]];
                                                                              if (~var166 <= -1) {
                                                                                 this.field11036[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(var165 < this.field10996);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field6704[var9[var163]];
                                                               }

                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var171 = this;
                                                   }

                                                   var160 = var171.field10979[var169];
                                                   if (var68 != var160) {
                                                      this.field11006[var67++] = var169;
                                                      var68 = var160;
                                                   }

                                                   ++var169;
                                                }
                                             }
                                          } else {
                                             var169 = this.field10979[var158];
                                          }

                                          if (var68 != var169) {
                                             ++var67;
                                             var68 = var169;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field6697[var67];
                                 }

                                 if (arg1.field6676 == null) {
                                    var69 = -1;
                                    if (var7) {
                                       var69 = arg1.field6676[var67];
                                    }
                                 } else {
                                    var69 = arg1.field6676[var67];
                                 }

                                 if (arg1.field6667 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = arg1.field6667[var67] & 255;
                                    }
                                 } else {
                                    var70 = arg1.field6667[var67] & 255;
                                 }

                                 var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                 if (~var71 != 0 && (64 & this.field11008) != 0) {
                                    var72 = var8.method1354(65535 & var71, (byte)-109);
                                    if (var72.field4328) {
                                       var71 = -1;
                                    }
                                 }
                              }

                              while(true) {
                                 var73 = 0.0F;
                                 var74 = 0.0F;
                                 var75 = 0.0F;
                                 var76 = 0.0F;
                                 var77 = 0.0F;
                                 var78 = 0.0F;
                                 var79 = 0;
                                 var80 = 0;
                                 var81 = 0;
                                 if (var71 != -1) {
                                    if (var69 != -1) {
                                       label3438: {
                                          var69 &= 255;
                                          var82 = arg1.field6700[var69];
                                          if (~var82 == -1) {
                                             var83 = arg1.field6674[var67];
                                             var84 = arg1.field6683[var67];
                                             var85 = arg1.field6663[var67];
                                             var86 = arg1.field6684[var69];
                                             var87 = arg1.field6708[var69];
                                             var88 = arg1.field6690[var69];
                                             var89 = (float)arg1.field6694[var86];
                                             var90 = (float)arg1.field6668[var86];
                                             var91 = (float)arg1.field6681[var86];
                                             var92 = (float)arg1.field6694[var87] - var89;
                                             var93 = (float)arg1.field6668[var87] - var90;
                                             var94 = (float)arg1.field6681[var87] + -var91;
                                             var95 = (float)arg1.field6694[var88] + -var89;
                                             var96 = (float)arg1.field6668[var88] - var90;
                                             var97 = (float)arg1.field6681[var88] + -var91;
                                             var98 = (float)arg1.field6694[var83] - var89;
                                             var99 = (float)arg1.field6668[var83] + -var90;
                                             var100 = (float)arg1.field6681[var83] + -var91;
                                             var101 = (float)arg1.field6694[var84] - var89;
                                             var102 = (float)arg1.field6668[var84] + -var90;
                                             var103 = (float)arg1.field6681[var84] - var91;
                                             var104 = (float)arg1.field6694[var85] - var89;
                                             var105 = (float)arg1.field6668[var85] - var90;
                                             var106 = (float)arg1.field6681[var85] - var91;
                                             var107 = var93 * var97 + -(var94 * var96);
                                             var108 = var94 * var95 + -(var92 * var97);
                                             var109 = var92 * var96 - var93 * var95;
                                             var110 = var96 * var109 - var97 * var108;
                                             var111 = var97 * var107 - var95 * var109;
                                             var112 = var95 * var108 + -(var96 * var107);
                                             var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                             var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                             var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                             var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                             var114 = var94 * var107 + -(var92 * var109);
                                             var115 = var93 * var109 - var94 * var108;
                                             var116 = var92 * var108 - var93 * var107;
                                             var117 = 1.0F / (var97 * var116 + var95 * var115 + var96 * var114);
                                             var76 = (var103 * var116 + var101 * var115 + var102 * var114) * var117;
                                             var74 = (var100 * var116 + var98 * var115 + var99 * var114) * var117;
                                             var78 = (var106 * var116 + var104 * var115 + var105 * var114) * var117;
                                             if (!var7) {
                                                break label3438;
                                             }
                                          }

                                          var118 = arg1.field6674[var67];
                                          var119 = arg1.field6683[var67];
                                          var120 = arg1.field6663[var67];
                                          var121 = var43.field7588[var69];
                                          var122 = var43.field7592[var69];
                                          var123 = var43.field7593[var69];
                                          var124 = var43.field7590[var69];
                                          var125 = arg1.field6666[var69];
                                          var126 = (float)arg1.field6695[var69] / 256.0F;
                                          if (~var82 == -2) {
                                             var127 = (float)arg1.field6659[var69] / 1024.0F;
                                             class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var118], var125, var123, arg1.field6668[var118], arg1.field6681[var118], 8, var124, var122);
                                             var74 = class416.field5986[1];
                                             var73 = class416.field5986[0];
                                             class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var119], var125, var123, arg1.field6668[var119], arg1.field6681[var119], 8, var124, var122);
                                             var75 = class416.field5986[0];
                                             var76 = class416.field5986[1];
                                             class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var120], var125, var123, arg1.field6668[var120], arg1.field6681[var120], 8, var124, var122);
                                             var78 = class416.field5986[1];
                                             var77 = class416.field5986[0];
                                             var128 = var127 / 2.0F;
                                             if ((1 & var125) != 0) {
                                                if (!(-var74 + var78 > var128)) {
                                                   if (var74 - var78 > var128) {
                                                      var80 = 2;
                                                      var78 += var127;
                                                      if (var7) {
                                                         var78 -= var127;
                                                         var80 = 1;
                                                      }
                                                   }
                                                } else {
                                                   var78 -= var127;
                                                   var80 = 1;
                                                }

                                                if (var76 - var74 > var128) {
                                                   var76 -= var127;
                                                   var79 = 1;
                                                   if (!var7) {
                                                      break label3438;
                                                   }
                                                }

                                                if (!(var74 - var76 > var128)) {
                                                   break label3438;
                                                }

                                                var79 = 2;
                                                var76 += var127;
                                                if (!var7) {
                                                   break label3438;
                                                }

                                                if (var77 - var73 > var128) {
                                                   var77 -= var127;
                                                   var80 = 1;
                                                   if (var7 && var128 < -var77 + var73) {
                                                      var77 += var127;
                                                      var80 = 2;
                                                   }
                                                } else if (var128 < -var77 + var73) {
                                                   var77 += var127;
                                                   var80 = 2;
                                                }
                                             } else if (var77 - var73 > var128) {
                                                var77 -= var127;
                                                var80 = 1;
                                                if (var7 && var128 < -var77 + var73) {
                                                   var77 += var127;
                                                   var80 = 2;
                                                }
                                             } else if (var128 < -var77 + var73) {
                                                var77 += var127;
                                                var80 = 2;
                                             }

                                             if (!(var128 < -var73 + var75)) {
                                                if (!(var128 < -var75 + var73)) {
                                                   break label3438;
                                                }

                                                var75 += var127;
                                                var79 = 2;
                                                if (!var7) {
                                                   break label3438;
                                                }
                                             }

                                             var75 -= var127;
                                             var79 = 1;
                                             if (!var7) {
                                                break label3438;
                                             }
                                          }

                                          if (var82 != 2) {
                                             if (~var82 == -4) {
                                                label3524: {
                                                   class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var118], var123, arg1.field6668[var118], var121, arg1.field6681[var118]);
                                                   var73 = class416.field5986[0];
                                                   var74 = class416.field5986[1];
                                                   class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var119], var123, arg1.field6668[var119], var121, arg1.field6681[var119]);
                                                   var75 = class416.field5986[0];
                                                   var76 = class416.field5986[1];
                                                   class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var120], var123, arg1.field6668[var120], var121, arg1.field6681[var120]);
                                                   var77 = class416.field5986[0];
                                                   var78 = class416.field5986[1];
                                                   if (~(var125 & 1) == -1) {
                                                      if (!(-var73 + var77 > 0.5F)) {
                                                         if (-var77 + var73 > 0.5F) {
                                                            ++var77;
                                                            var80 = 2;
                                                            if (var7) {
                                                               var80 = 1;
                                                               --var77;
                                                            }
                                                         }
                                                      } else {
                                                         var80 = 1;
                                                         --var77;
                                                      }

                                                      if (var75 - var73 > 0.5F) {
                                                         var79 = 1;
                                                         --var75;
                                                         if (!var7) {
                                                            break label3524;
                                                         }
                                                      }

                                                      if (!(-var75 + var73 > 0.5F)) {
                                                         break label3524;
                                                      }

                                                      var79 = 2;
                                                      ++var75;
                                                      if (!var7) {
                                                         break label3524;
                                                      }

                                                      if (!(var76 - var74 > 0.5F)) {
                                                         if (var74 - var76 > 0.5F) {
                                                            ++var76;
                                                            var79 = 2;
                                                            if (var7) {
                                                               --var76;
                                                               var79 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         --var76;
                                                         var79 = 1;
                                                      }
                                                   } else if (!(var76 - var74 > 0.5F)) {
                                                      if (var74 - var76 > 0.5F) {
                                                         ++var76;
                                                         var79 = 2;
                                                         if (var7) {
                                                            --var76;
                                                            var79 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      --var76;
                                                      var79 = 1;
                                                   }

                                                   if (var78 - var74 > 0.5F) {
                                                      --var78;
                                                      var80 = 1;
                                                      if (var7 && var74 - var78 > 0.5F) {
                                                         var80 = 2;
                                                         ++var78;
                                                         if (var7) {
                                                            var129 = (float)arg1.field6675[var69] / 256.0F;
                                                            var130 = (float)arg1.field6682[var69] / 256.0F;
                                                            var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                            var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                            var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                            var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                            var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                            var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                            var137 = var132 * var136 - var133 * var135;
                                                            var138 = var133 * var134 + -(var131 * var136);
                                                            var139 = var131 * var135 + -(var132 * var134);
                                                            var140 = 64.0F / (float)arg1.field6673[var69];
                                                            var141 = 64.0F / (float)arg1.field6689[var69];
                                                            var142 = 64.0F / (float)arg1.field6659[var69];
                                                            var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                            var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                            var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                            var81 = class12.method68(var144, var143, true, var145);
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var73 = class416.field5986[0];
                                                            var74 = class416.field5986[1];
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var76 = class416.field5986[1];
                                                            var75 = class416.field5986[0];
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var77 = class416.field5986[0];
                                                            var78 = class416.field5986[1];
                                                            if (var7) {
                                                               var76 = 1.0F;
                                                               var77 = 0.0F;
                                                               var75 = 1.0F;
                                                               var78 = 0.0F;
                                                               var73 = 0.0F;
                                                               var79 = 1;
                                                               var74 = 1.0F;
                                                               var80 = 2;
                                                            }
                                                         }
                                                      }
                                                   } else if (var74 - var78 > 0.5F) {
                                                      var80 = 2;
                                                      ++var78;
                                                      if (var7) {
                                                         var129 = (float)arg1.field6675[var69] / 256.0F;
                                                         var130 = (float)arg1.field6682[var69] / 256.0F;
                                                         var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                         var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                         var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                         var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                         var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                         var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                         var137 = var132 * var136 - var133 * var135;
                                                         var138 = var133 * var134 + -(var131 * var136);
                                                         var139 = var131 * var135 + -(var132 * var134);
                                                         var140 = 64.0F / (float)arg1.field6673[var69];
                                                         var141 = 64.0F / (float)arg1.field6689[var69];
                                                         var142 = 64.0F / (float)arg1.field6659[var69];
                                                         var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                         var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                         var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                         var81 = class12.method68(var144, var143, true, var145);
                                                         class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                         var73 = class416.field5986[0];
                                                         var74 = class416.field5986[1];
                                                         class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                         var76 = class416.field5986[1];
                                                         var75 = class416.field5986[0];
                                                         class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                         var77 = class416.field5986[0];
                                                         var78 = class416.field5986[1];
                                                         if (var7) {
                                                            var76 = 1.0F;
                                                            var77 = 0.0F;
                                                            var75 = 1.0F;
                                                            var78 = 0.0F;
                                                            var73 = 0.0F;
                                                            var79 = 1;
                                                            var74 = 1.0F;
                                                            var80 = 2;
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var129 = (float)arg1.field6675[var69] / 256.0F;
                                             var130 = (float)arg1.field6682[var69] / 256.0F;
                                             var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                             var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                             var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                             var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                             var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                             var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                             var137 = var132 * var136 - var133 * var135;
                                             var138 = var133 * var134 + -(var131 * var136);
                                             var139 = var131 * var135 + -(var132 * var134);
                                             var140 = 64.0F / (float)arg1.field6673[var69];
                                             var141 = 64.0F / (float)arg1.field6689[var69];
                                             var142 = 64.0F / (float)arg1.field6659[var69];
                                             var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                             var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                             var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                             var81 = class12.method68(var144, var143, true, var145);
                                             class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                             var73 = class416.field5986[0];
                                             var74 = class416.field5986[1];
                                             class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                             var76 = class416.field5986[1];
                                             var75 = class416.field5986[0];
                                             class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                             var77 = class416.field5986[0];
                                             var78 = class416.field5986[1];
                                             if (var7) {
                                                var76 = 1.0F;
                                                var77 = 0.0F;
                                                var75 = 1.0F;
                                                var78 = 0.0F;
                                                var73 = 0.0F;
                                                var79 = 1;
                                                var74 = 1.0F;
                                                var80 = 2;
                                             }
                                          }
                                       }
                                    } else {
                                       var76 = 1.0F;
                                       var77 = 0.0F;
                                       var75 = 1.0F;
                                       var78 = 0.0F;
                                       var73 = 0.0F;
                                       var79 = 1;
                                       var74 = 1.0F;
                                       var80 = 2;
                                    }
                                 }

                                 if (arg1.field6672 != null) {
                                    var146 = arg1.field6672[var67];
                                    if (var7) {
                                       var146 = 0;
                                    }
                                 } else {
                                    var146 = 0;
                                 }

                                 if (~var146 == -1) {
                                    var147 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)(var69 << 2);
                                    var149 = arg1.field6674[var67];
                                    var150 = arg1.field6683[var67];
                                    var151 = arg1.field6663[var67];
                                    var152 = var32[var149];
                                    this.field11048[var46] = this.method5423(var73, arg1, (byte)-91, var152.field2334, var152.field2327, var149, var147, var74, var152.field2333, var152.field2330);
                                    var153 = var32[var150];
                                    this.field10989[var46] = this.method5423(var75, arg1, (byte)-86, var153.field2334, var153.field2327, var150, (long)var79 + var147, var76, var153.field2333, var153.field2330);
                                    var154 = var32[var151];
                                    this.field10949[var46] = this.method5423(var77, arg1, (byte)-89, var154.field2334, var154.field2327, var151, (long)var80 + var147, var78, var154.field2333, var154.field2330);
                                    if (var7) {
                                       if (~var146 == -2) {
                                          var155 = var44[var67];
                                          var156 = (long)((~var155.field7535 < -1 ? 1024 : 2048) + (var69 << 2) + (var155.field7534 + 256 << 12) - -(var155.field7536 + 256 << 22)) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                          this.field11048[var46] = this.method5423(var73, arg1, (byte)77, 0, var155.field7534, arg1.field6674[var67], var156, var74, var155.field7536, var155.field7535);
                                          this.field10989[var46] = this.method5423(var75, arg1, (byte)-112, 0, var155.field7534, arg1.field6683[var67], (long)var79 + var156, var76, var155.field7536, var155.field7535);
                                          this.field10949[var46] = this.method5423(var77, arg1, (byte)-127, 0, var155.field7534, arg1.field6663[var67], (long)var80 + var156, var78, var155.field7536, var155.field7535);
                                       }

                                       if (arg1.field6667 != null) {
                                          this.field10955[var46] = arg1.field6667[var67];
                                       }

                                       if (arg1.field6671 != null) {
                                          this.field11066[var46] = arg1.field6671[var67];
                                       }

                                       this.field11031[var46] = arg1.field6697[var67];
                                       this.field10979[var46] = var71;
                                       ++var46;
                                    } else {
                                       if (arg1.field6667 != null) {
                                          this.field10955[var46] = arg1.field6667[var67];
                                       }

                                       if (arg1.field6671 != null) {
                                          this.field11066[var46] = arg1.field6671[var67];
                                       }

                                       this.field11031[var46] = arg1.field6697[var67];
                                       this.field10979[var46] = var71;
                                       ++var46;
                                    }
                                 } else {
                                    if (~var146 == -2) {
                                       var155 = var44[var67];
                                       var156 = (long)((~var155.field7535 < -1 ? 1024 : 2048) + (var69 << 2) + (var155.field7534 + 256 << 12) - -(var155.field7536 + 256 << 22)) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                       this.field11048[var46] = this.method5423(var73, arg1, (byte)77, 0, var155.field7534, arg1.field6674[var67], var156, var74, var155.field7536, var155.field7535);
                                       this.field10989[var46] = this.method5423(var75, arg1, (byte)-112, 0, var155.field7534, arg1.field6683[var67], (long)var79 + var156, var76, var155.field7536, var155.field7535);
                                       this.field10949[var46] = this.method5423(var77, arg1, (byte)-127, 0, var155.field7534, arg1.field6663[var67], (long)var80 + var156, var78, var155.field7536, var155.field7535);
                                    }

                                    if (arg1.field6667 != null) {
                                       this.field10955[var46] = arg1.field6667[var67];
                                    }

                                    if (arg1.field6671 != null) {
                                       this.field11066[var46] = arg1.field6671[var67];
                                    }

                                    this.field11031[var46] = arg1.field6697[var67];
                                    this.field10979[var46] = var71;
                                    ++var46;
                                 }

                                 if (var46 >= this.field10996) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (!var7) {
                                       if (var7) {
                                          var159 = this.field10979[var158];
                                          if (var68 != var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (var158 >= this.field11010) {
                                             this.field11006 = new int[var67 + 1];
                                             var68 = -10000;
                                             var67 = 0;
                                             var169 = 0;
                                             if (!var7) {
                                                if (var7) {
                                                   var160 = this.field10979[var169];
                                                   if (var68 != var160) {
                                                      this.field11006[var67++] = var169;
                                                      var68 = var160;
                                                   }

                                                   ++var169;
                                                }

                                                while(true) {
                                                   if (~this.field11010 >= ~var169) {
                                                      this.field11006[var67] = this.field11010;
                                                      class550.field7890 = null;
                                                      this.field11004 = class314.method2314(36, this.field11004, this.field10962);
                                                      this.field11012 = class314.method2314(101, this.field11012, this.field10962);
                                                      this.field11067 = class314.method2314(53, this.field11067, this.field10962);
                                                      this.field10970 = class190.method1504((byte)49, this.field10962, this.field10970);
                                                      this.field11016 = class522.method3790(this.field10962, this.field11016, true);
                                                      var171 = this;
                                                      if (!var7) {
                                                         this.field10998 = class522.method3790(this.field10962, this.field10998, true);
                                                         if (arg1.field6658 != null && class333.method2464(arg2, 32, this.field11008)) {
                                                            this.field11005 = arg1.method3367(0, false);
                                                         }

                                                         if (arg1.field6678 != null && class546.method3919(this.field11008, (byte)-101, arg2)) {
                                                            this.field10982 = arg1.method3382(256);
                                                         }

                                                         if (arg1.field6704 != null && class151.method1261(arg2, 127, this.field11008)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7) {
                                                               var164 = arg1.field6704[var9[var163]];
                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (this.field10996 <= var163) {
                                                                  this.field11036 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (!var7) {
                                                                     if (var7) {
                                                                        this.field11036[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(var164 <= var161) {
                                                                           this.field11036[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (!var7) {
                                                                           if (!var7 && var165 >= this.field10996) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field6704[var9[var165]];
                                                                              if (~var166 <= -1) {
                                                                                 this.field11036[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(var165 < this.field10996);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field6704[var9[var163]];
                                                               }

                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var171 = this;
                                                   }

                                                   var160 = var171.field10979[var169];
                                                   if (var68 != var160) {
                                                      this.field11006[var67++] = var169;
                                                      var68 = var160;
                                                   }

                                                   ++var169;
                                                }
                                             }
                                          } else {
                                             var169 = this.field10979[var158];
                                          }

                                          if (var68 != var169) {
                                             ++var67;
                                             var68 = var169;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field6697[var67];
                                 }

                                 if (arg1.field6676 == null) {
                                    var69 = -1;
                                    if (var7) {
                                       var69 = arg1.field6676[var67];
                                    }
                                 } else {
                                    var69 = arg1.field6676[var67];
                                 }

                                 if (arg1.field6667 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = arg1.field6667[var67] & 255;
                                    }
                                 } else {
                                    var70 = arg1.field6667[var67] & 255;
                                 }

                                 var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                 if (~var71 != 0 && (64 & this.field11008) != 0) {
                                    var72 = var8.method1354(65535 & var71, (byte)-109);
                                    if (var72.field4328) {
                                       var71 = -1;
                                    }
                                 }
                              }
                           }
                        } else {
                           var10000 = this.field10986[var41];
                        }

                        var42 = var10000;
                        this.field10986[var41] = var40;
                        var32[var41] = new class165();
                        var40 += var42;
                        ++var41;
                     }
                  }
               }

               while(true) {
                  int var10001;
                  class416 var34;
                  class346 var35;
                  int var36;
                  label3030: {
                     var34 = var170.field6678[var33];
                     var35 = class392.method2978(var34.field5990, (byte)-79);
                     var36 = -1;
                     int var37 = 0;
                     if (var7) {
                        var10000 = var9[var37];
                        var10001 = var34.field5996;
                     } else if (~var37 <= ~this.field10996) {
                        var10000 = var36;
                        var10001 = -1;
                        if (!var7) {
                           break label3030;
                        }
                     } else {
                        var10000 = var9[var37];
                        var10001 = var34.field5996;
                     }

                     label3029:
                     do {
                        while(true) {
                           if (var10000 == var10001) {
                              var36 = var37;
                              if (!var7) {
                                 var10000 = var37;
                                 var10001 = -1;
                                 break;
                              }

                              ++var37;
                           } else {
                              ++var37;
                           }

                           if (~var37 <= ~this.field10996) {
                              var10000 = var36;
                              var10001 = -1;
                              if (!var7) {
                                 break label3029;
                              }
                           } else {
                              var10000 = var9[var37];
                              var10001 = var34.field5996;
                           }
                        }
                     } while(var7);
                  }

                  if (var10000 == var10001) {
                     throw new RuntimeException();
                  }

                  int var38 = class546.field7829[arg1.field6697[var34.field5996] & 65535] & 16777215;
                  int var39 = var38 | -(arg1.field6667 != null ? arg1.field6667[var34.field5996] : 0) + 255 << 24;
                  this.field10994[var33] = new class116(var36, arg1.field6674[var34.field5996], arg1.field6683[var34.field5996], arg1.field6663[var34.field5996], var35.field4680, var35.field4674, var35.field4682, var35.field4675, var35.field4679, var35.field4677, var35.field4676, var34.field5994);
                  this.field10984[var33] = new class319(var39);
                  ++var33;
                  if (~var33 <= ~this.field11042) {
                     var33 = this.field10996 * 3;
                     this.field10955 = new byte[this.field10996];
                     this.field11016 = new float[var33];
                     this.field10979 = new short[this.field10996];
                     this.field11031 = new short[this.field10996];
                     this.field11012 = new short[var33];
                     this.field11052 = (short)arg3;
                     this.field10949 = new short[this.field10996];
                     this.field10998 = new float[var33];
                     this.field10989 = new short[this.field10996];
                     this.field10970 = new byte[var33];
                     this.field11067 = new short[var33];
                     this.field11004 = new short[var33];
                     this.field10954 = new short[var33];
                     class550.field7890 = new long[var33];
                     var170 = arg1;
                     if (!var7) {
                        if (arg1.field6671 != null) {
                           this.field11066 = new short[this.field10996];
                        }

                        this.field11048 = new short[this.field10996];
                        this.field11044 = (short)arg4;
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field10986[var41];
                           this.field10986[var41] = var40;
                           var32[var41] = new class165();
                           var40 += var42;
                           ++var41;
                        }

                        while(true) {
                           if (arg1.field6706 <= var41) {
                              this.field10986[arg1.field6706] = var40;
                              var43 = class88.method774(arg1, this.field10996, -98, var9);
                              var44 = new class526[arg1.field6669];
                              var10000 = 0;
                              if (!var7) {
                                 label503: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field6674[var45];
                                    } else if (var45 >= arg1.field6669) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label503;
                                       }
                                    } else {
                                       var46 = arg1.field6674[var45];
                                    }

                                    label502:
                                    while(true) {
                                       var47 = arg1.field6683[var45];
                                       var48 = arg1.field6663[var45];
                                       var49 = this.field10951[var47] - this.field10951[var46];
                                       var50 = this.field11021[var47] + -this.field11021[var46];
                                       var51 = this.field10987[var47] + -this.field10987[var46];
                                       var52 = this.field10951[var48] + -this.field10951[var46];
                                       var53 = this.field11021[var48] + -this.field11021[var46];
                                       var54 = this.field10987[var48] + -this.field10987[var46];
                                       var55 = var50 * var54 - var51 * var53;
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 + -(var50 * var52);
                                       if (var7) {
                                          var56 >>= 1;
                                          var57 >>= 1;
                                          var55 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                if (var7) {
                                                   var55 = var56 >> 8192;
                                                   continue;
                                                }

                                                if (var56 <= 8192 && ~var57 >= -8193 && ~var55 <= 8191 && ~var56 <= 8191 && ~var57 <= 8191) {
                                                   var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                   if (var58 <= 0) {
                                                      var58 = 1;
                                                   }

                                                   var59 = var57 * 256 / var58;
                                                   var60 = var56 * 256 / var58;
                                                   var61 = var55 * 256 / var58;
                                                   var62 = arg1.field6672 == null ? 0 : arg1.field6672[var45];
                                                   if (var62 == 0) {
                                                      var63 = var32[var46];
                                                      ++var63.field2334;
                                                      var63.field2333 += var59;
                                                      var63.field2327 += var60;
                                                      var63.field2330 += var61;
                                                      var64 = var32[var47];
                                                      var64.field2333 += var59;
                                                      var64.field2327 += var60;
                                                      ++var64.field2334;
                                                      var64.field2330 += var61;
                                                      var65 = var32[var48];
                                                      var65.field2333 += var59;
                                                      var65.field2327 += var60;
                                                      var65.field2330 += var61;
                                                      ++var65.field2334;
                                                      if (var7) {
                                                         if (~var62 == -2) {
                                                            var66 = var44[var45] = new class526();
                                                            var66.field7535 = var61;
                                                            var66.field7534 = var60;
                                                            var66.field7536 = var59;
                                                         }

                                                         ++var45;
                                                      } else {
                                                         ++var45;
                                                      }
                                                   } else {
                                                      if (~var62 == -2) {
                                                         var66 = var44[var45] = new class526();
                                                         var66.field7535 = var61;
                                                         var66.field7534 = var60;
                                                         var66.field7536 = var59;
                                                      }

                                                      ++var45;
                                                   }

                                                   if (var45 >= arg1.field6669) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label502;
                                                      }
                                                   } else {
                                                      var46 = arg1.field6674[var45];
                                                   }
                                                   continue label502;
                                                }
                                             }

                                             var56 >>= 1;
                                             var57 >>= 1;
                                             var55 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field6697[var67];
                                    if (arg1.field6676 == null) {
                                       var69 = -1;
                                       if (var7) {
                                          var69 = arg1.field6676[var67];
                                       }
                                    } else {
                                       var69 = arg1.field6676[var67];
                                    }

                                    if (arg1.field6667 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field6667[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field6667[var67] & 255;
                                    }

                                    var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                    if (~var71 != 0 && (64 & this.field11008) != 0) {
                                       var72 = var8.method1354(65535 & var71, (byte)-109);
                                       if (var72.field4328) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (var46 >= this.field10996) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field10979[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field11010) {
                                                this.field11006 = new int[var67 + 1];
                                                var68 = -10000;
                                                var67 = 0;
                                                var169 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field11010 >= ~var169) {
                                                         this.field11006[var67] = this.field11010;
                                                         class550.field7890 = null;
                                                         this.field11004 = class314.method2314(36, this.field11004, this.field10962);
                                                         this.field11012 = class314.method2314(101, this.field11012, this.field10962);
                                                         this.field11067 = class314.method2314(53, this.field11067, this.field10962);
                                                         this.field10970 = class190.method1504((byte)49, this.field10962, this.field10970);
                                                         this.field11016 = class522.method3790(this.field10962, this.field11016, true);
                                                         var171 = this;
                                                         if (!var7) {
                                                            this.field10998 = class522.method3790(this.field10962, this.field10998, true);
                                                            if (arg1.field6658 != null && class333.method2464(arg2, 32, this.field11008)) {
                                                               this.field11005 = arg1.method3367(0, false);
                                                            }

                                                            if (arg1.field6678 != null && class546.method3919(this.field11008, (byte)-101, arg2)) {
                                                               this.field10982 = arg1.method3382(256);
                                                            }

                                                            if (arg1.field6704 != null && class151.method1261(arg2, 127, this.field11008)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field6704[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field10996 <= var163) {
                                                                     this.field11036 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field11036[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field11036[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && var165 >= this.field10996) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field6704[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field11036[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(var165 < this.field10996);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field6704[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field10979[var158];
                                             }

                                             if (var68 != var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field6697[var67];
                                    }

                                    if (arg1.field6676 == null) {
                                       var69 = -1;
                                       if (var7) {
                                          var69 = arg1.field6676[var67];
                                       }
                                    } else {
                                       var69 = arg1.field6676[var67];
                                    }

                                    if (arg1.field6667 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field6667[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field6667[var67] & 255;
                                    }

                                    var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                    if (~var71 != 0 && (64 & this.field11008) != 0) {
                                       var72 = var8.method1354(65535 & var71, (byte)-109);
                                       if (var72.field4328) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (var71 != -1) {
                                       if (var69 != -1) {
                                          label3481: {
                                             var69 &= 255;
                                             var82 = arg1.field6700[var69];
                                             if (~var82 == -1) {
                                                var83 = arg1.field6674[var67];
                                                var84 = arg1.field6683[var67];
                                                var85 = arg1.field6663[var67];
                                                var86 = arg1.field6684[var69];
                                                var87 = arg1.field6708[var69];
                                                var88 = arg1.field6690[var69];
                                                var89 = (float)arg1.field6694[var86];
                                                var90 = (float)arg1.field6668[var86];
                                                var91 = (float)arg1.field6681[var86];
                                                var92 = (float)arg1.field6694[var87] - var89;
                                                var93 = (float)arg1.field6668[var87] - var90;
                                                var94 = (float)arg1.field6681[var87] + -var91;
                                                var95 = (float)arg1.field6694[var88] + -var89;
                                                var96 = (float)arg1.field6668[var88] - var90;
                                                var97 = (float)arg1.field6681[var88] + -var91;
                                                var98 = (float)arg1.field6694[var83] - var89;
                                                var99 = (float)arg1.field6668[var83] + -var90;
                                                var100 = (float)arg1.field6681[var83] + -var91;
                                                var101 = (float)arg1.field6694[var84] - var89;
                                                var102 = (float)arg1.field6668[var84] + -var90;
                                                var103 = (float)arg1.field6681[var84] - var91;
                                                var104 = (float)arg1.field6694[var85] - var89;
                                                var105 = (float)arg1.field6668[var85] - var90;
                                                var106 = (float)arg1.field6681[var85] - var91;
                                                var107 = var93 * var97 + -(var94 * var96);
                                                var108 = var94 * var95 + -(var92 * var97);
                                                var109 = var92 * var96 - var93 * var95;
                                                var110 = var96 * var109 - var97 * var108;
                                                var111 = var97 * var107 - var95 * var109;
                                                var112 = var95 * var108 + -(var96 * var107);
                                                var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                                var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                                var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                                var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                                var114 = var94 * var107 + -(var92 * var109);
                                                var115 = var93 * var109 - var94 * var108;
                                                var116 = var92 * var108 - var93 * var107;
                                                var117 = 1.0F / (var97 * var116 + var95 * var115 + var96 * var114);
                                                var76 = (var103 * var116 + var101 * var115 + var102 * var114) * var117;
                                                var74 = (var100 * var116 + var98 * var115 + var99 * var114) * var117;
                                                var78 = (var106 * var116 + var104 * var115 + var105 * var114) * var117;
                                                if (!var7) {
                                                   break label3481;
                                                }
                                             }

                                             var118 = arg1.field6674[var67];
                                             var119 = arg1.field6683[var67];
                                             var120 = arg1.field6663[var67];
                                             var121 = var43.field7588[var69];
                                             var122 = var43.field7592[var69];
                                             var123 = var43.field7593[var69];
                                             var124 = var43.field7590[var69];
                                             var125 = arg1.field6666[var69];
                                             var126 = (float)arg1.field6695[var69] / 256.0F;
                                             if (~var82 == -2) {
                                                var127 = (float)arg1.field6659[var69] / 1024.0F;
                                                class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var118], var125, var123, arg1.field6668[var118], arg1.field6681[var118], 8, var124, var122);
                                                var74 = class416.field5986[1];
                                                var73 = class416.field5986[0];
                                                class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var119], var125, var123, arg1.field6668[var119], arg1.field6681[var119], 8, var124, var122);
                                                var75 = class416.field5986[0];
                                                var76 = class416.field5986[1];
                                                class92.method798(var121, class416.field5986, var127, var126, arg1.field6694[var120], var125, var123, arg1.field6668[var120], arg1.field6681[var120], 8, var124, var122);
                                                var78 = class416.field5986[1];
                                                var77 = class416.field5986[0];
                                                var128 = var127 / 2.0F;
                                                if ((1 & var125) != 0) {
                                                   if (!(-var74 + var78 > var128)) {
                                                      if (var74 - var78 > var128) {
                                                         var80 = 2;
                                                         var78 += var127;
                                                         if (var7) {
                                                            var78 -= var127;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var78 -= var127;
                                                      var80 = 1;
                                                   }

                                                   if (var76 - var74 > var128) {
                                                      var76 -= var127;
                                                      var79 = 1;
                                                      if (!var7) {
                                                         break label3481;
                                                      }
                                                   }

                                                   if (!(var74 - var76 > var128)) {
                                                      break label3481;
                                                   }

                                                   var79 = 2;
                                                   var76 += var127;
                                                   if (!var7) {
                                                      break label3481;
                                                   }

                                                   if (var77 - var73 > var128) {
                                                      var77 -= var127;
                                                      var80 = 1;
                                                      if (var7 && var128 < -var77 + var73) {
                                                         var77 += var127;
                                                         var80 = 2;
                                                      }
                                                   } else if (var128 < -var77 + var73) {
                                                      var77 += var127;
                                                      var80 = 2;
                                                   }
                                                } else if (var77 - var73 > var128) {
                                                   var77 -= var127;
                                                   var80 = 1;
                                                   if (var7 && var128 < -var77 + var73) {
                                                      var77 += var127;
                                                      var80 = 2;
                                                   }
                                                } else if (var128 < -var77 + var73) {
                                                   var77 += var127;
                                                   var80 = 2;
                                                }

                                                if (!(var128 < -var73 + var75)) {
                                                   if (!(var128 < -var75 + var73)) {
                                                      break label3481;
                                                   }

                                                   var75 += var127;
                                                   var79 = 2;
                                                   if (!var7) {
                                                      break label3481;
                                                   }
                                                }

                                                var75 -= var127;
                                                var79 = 1;
                                                if (!var7) {
                                                   break label3481;
                                                }
                                             }

                                             if (var82 != 2) {
                                                if (~var82 == -4) {
                                                   label3534: {
                                                      class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var118], var123, arg1.field6668[var118], var121, arg1.field6681[var118]);
                                                      var73 = class416.field5986[0];
                                                      var74 = class416.field5986[1];
                                                      class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var119], var123, arg1.field6668[var119], var121, arg1.field6681[var119]);
                                                      var75 = class416.field5986[0];
                                                      var76 = class416.field5986[1];
                                                      class547.method3929(var125, var124, var126, true, var122, class416.field5986, arg1.field6694[var120], var123, arg1.field6668[var120], var121, arg1.field6681[var120]);
                                                      var77 = class416.field5986[0];
                                                      var78 = class416.field5986[1];
                                                      if (~(var125 & 1) == -1) {
                                                         if (!(-var73 + var77 > 0.5F)) {
                                                            if (-var77 + var73 > 0.5F) {
                                                               ++var77;
                                                               var80 = 2;
                                                               if (var7) {
                                                                  var80 = 1;
                                                                  --var77;
                                                               }
                                                            }
                                                         } else {
                                                            var80 = 1;
                                                            --var77;
                                                         }

                                                         if (var75 - var73 > 0.5F) {
                                                            var79 = 1;
                                                            --var75;
                                                            if (!var7) {
                                                               break label3534;
                                                            }
                                                         }

                                                         if (!(-var75 + var73 > 0.5F)) {
                                                            break label3534;
                                                         }

                                                         var79 = 2;
                                                         ++var75;
                                                         if (!var7) {
                                                            break label3534;
                                                         }

                                                         if (!(var76 - var74 > 0.5F)) {
                                                            if (var74 - var76 > 0.5F) {
                                                               ++var76;
                                                               var79 = 2;
                                                               if (var7) {
                                                                  --var76;
                                                                  var79 = 1;
                                                               }
                                                            }
                                                         } else {
                                                            --var76;
                                                            var79 = 1;
                                                         }
                                                      } else if (!(var76 - var74 > 0.5F)) {
                                                         if (var74 - var76 > 0.5F) {
                                                            ++var76;
                                                            var79 = 2;
                                                            if (var7) {
                                                               --var76;
                                                               var79 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         --var76;
                                                         var79 = 1;
                                                      }

                                                      if (var78 - var74 > 0.5F) {
                                                         --var78;
                                                         var80 = 1;
                                                         if (var7 && var74 - var78 > 0.5F) {
                                                            var80 = 2;
                                                            ++var78;
                                                            if (var7) {
                                                               var129 = (float)arg1.field6675[var69] / 256.0F;
                                                               var130 = (float)arg1.field6682[var69] / 256.0F;
                                                               var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                               var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                               var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                               var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                               var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                               var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                               var137 = var132 * var136 - var133 * var135;
                                                               var138 = var133 * var134 + -(var131 * var136);
                                                               var139 = var131 * var135 + -(var132 * var134);
                                                               var140 = 64.0F / (float)arg1.field6673[var69];
                                                               var141 = 64.0F / (float)arg1.field6689[var69];
                                                               var142 = 64.0F / (float)arg1.field6659[var69];
                                                               var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                               var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                               var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                               var81 = class12.method68(var144, var143, true, var145);
                                                               class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                               var73 = class416.field5986[0];
                                                               var74 = class416.field5986[1];
                                                               class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                               var76 = class416.field5986[1];
                                                               var75 = class416.field5986[0];
                                                               class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                               var77 = class416.field5986[0];
                                                               var78 = class416.field5986[1];
                                                               if (var7) {
                                                                  var76 = 1.0F;
                                                                  var77 = 0.0F;
                                                                  var75 = 1.0F;
                                                                  var78 = 0.0F;
                                                                  var73 = 0.0F;
                                                                  var79 = 1;
                                                                  var74 = 1.0F;
                                                                  var80 = 2;
                                                               }
                                                            }
                                                         }
                                                      } else if (var74 - var78 > 0.5F) {
                                                         var80 = 2;
                                                         ++var78;
                                                         if (var7) {
                                                            var129 = (float)arg1.field6675[var69] / 256.0F;
                                                            var130 = (float)arg1.field6682[var69] / 256.0F;
                                                            var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                            var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                            var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                            var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                            var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                            var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                            var137 = var132 * var136 - var133 * var135;
                                                            var138 = var133 * var134 + -(var131 * var136);
                                                            var139 = var131 * var135 + -(var132 * var134);
                                                            var140 = 64.0F / (float)arg1.field6673[var69];
                                                            var141 = 64.0F / (float)arg1.field6689[var69];
                                                            var142 = 64.0F / (float)arg1.field6659[var69];
                                                            var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                            var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                            var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                            var81 = class12.method68(var144, var143, true, var145);
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var73 = class416.field5986[0];
                                                            var74 = class416.field5986[1];
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var76 = class416.field5986[1];
                                                            var75 = class416.field5986[0];
                                                            class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                            var77 = class416.field5986[0];
                                                            var78 = class416.field5986[1];
                                                            if (var7) {
                                                               var76 = 1.0F;
                                                               var77 = 0.0F;
                                                               var75 = 1.0F;
                                                               var78 = 0.0F;
                                                               var73 = 0.0F;
                                                               var79 = 1;
                                                               var74 = 1.0F;
                                                               var80 = 2;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             } else {
                                                var129 = (float)arg1.field6675[var69] / 256.0F;
                                                var130 = (float)arg1.field6682[var69] / 256.0F;
                                                var131 = arg1.field6694[var119] - arg1.field6694[var118];
                                                var132 = arg1.field6668[var119] + -arg1.field6668[var118];
                                                var133 = arg1.field6681[var119] + -arg1.field6681[var118];
                                                var134 = arg1.field6694[var120] + -arg1.field6694[var118];
                                                var135 = arg1.field6668[var120] + -arg1.field6668[var118];
                                                var136 = arg1.field6681[var120] - arg1.field6681[var118];
                                                var137 = var132 * var136 - var133 * var135;
                                                var138 = var133 * var134 + -(var131 * var136);
                                                var139 = var131 * var135 + -(var132 * var134);
                                                var140 = 64.0F / (float)arg1.field6673[var69];
                                                var141 = 64.0F / (float)arg1.field6689[var69];
                                                var142 = 64.0F / (float)arg1.field6659[var69];
                                                var143 = (var124[2] * (float)var139 + var124[1] * (float)var138 + var124[0] * (float)var137) / var140;
                                                var144 = (var124[5] * (float)var139 + var124[3] * (float)var137 + var124[4] * (float)var138) / var141;
                                                var145 = (var124[8] * (float)var139 + var124[6] * (float)var137 + var124[7] * (float)var138) / var142;
                                                var81 = class12.method68(var144, var143, true, var145);
                                                class520.method3777(var81, class416.field5986, arg1.field6681[var118], arg1.field6668[var118], var124, arg1.field6694[var118], -1, var125, var126, var129, var130, var122, var121, var123);
                                                var73 = class416.field5986[0];
                                                var74 = class416.field5986[1];
                                                class520.method3777(var81, class416.field5986, arg1.field6681[var119], arg1.field6668[var119], var124, arg1.field6694[var119], -1, var125, var126, var129, var130, var122, var121, var123);
                                                var76 = class416.field5986[1];
                                                var75 = class416.field5986[0];
                                                class520.method3777(var81, class416.field5986, arg1.field6681[var120], arg1.field6668[var120], var124, arg1.field6694[var120], -1, var125, var126, var129, var130, var122, var121, var123);
                                                var77 = class416.field5986[0];
                                                var78 = class416.field5986[1];
                                                if (var7) {
                                                   var76 = 1.0F;
                                                   var77 = 0.0F;
                                                   var75 = 1.0F;
                                                   var78 = 0.0F;
                                                   var73 = 0.0F;
                                                   var79 = 1;
                                                   var74 = 1.0F;
                                                   var80 = 2;
                                                }
                                             }
                                          }
                                       } else {
                                          var76 = 1.0F;
                                          var77 = 0.0F;
                                          var75 = 1.0F;
                                          var78 = 0.0F;
                                          var73 = 0.0F;
                                          var79 = 1;
                                          var74 = 1.0F;
                                          var80 = 2;
                                       }
                                    }

                                    if (arg1.field6672 != null) {
                                       var146 = arg1.field6672[var67];
                                       if (var7) {
                                          var146 = 0;
                                       }
                                    } else {
                                       var146 = 0;
                                    }

                                    if (~var146 == -1) {
                                       var147 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)(var69 << 2);
                                       var149 = arg1.field6674[var67];
                                       var150 = arg1.field6683[var67];
                                       var151 = arg1.field6663[var67];
                                       var152 = var32[var149];
                                       this.field11048[var46] = this.method5423(var73, arg1, (byte)-91, var152.field2334, var152.field2327, var149, var147, var74, var152.field2333, var152.field2330);
                                       var153 = var32[var150];
                                       this.field10989[var46] = this.method5423(var75, arg1, (byte)-86, var153.field2334, var153.field2327, var150, (long)var79 + var147, var76, var153.field2333, var153.field2330);
                                       var154 = var32[var151];
                                       this.field10949[var46] = this.method5423(var77, arg1, (byte)-89, var154.field2334, var154.field2327, var151, (long)var80 + var147, var78, var154.field2333, var154.field2330);
                                       if (var7) {
                                          if (~var146 == -2) {
                                             var155 = var44[var67];
                                             var156 = (long)((~var155.field7535 < -1 ? 1024 : 2048) + (var69 << 2) + (var155.field7534 + 256 << 12) - -(var155.field7536 + 256 << 22)) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                             this.field11048[var46] = this.method5423(var73, arg1, (byte)77, 0, var155.field7534, arg1.field6674[var67], var156, var74, var155.field7536, var155.field7535);
                                             this.field10989[var46] = this.method5423(var75, arg1, (byte)-112, 0, var155.field7534, arg1.field6683[var67], (long)var79 + var156, var76, var155.field7536, var155.field7535);
                                             this.field10949[var46] = this.method5423(var77, arg1, (byte)-127, 0, var155.field7534, arg1.field6663[var67], (long)var80 + var156, var78, var155.field7536, var155.field7535);
                                          }

                                          if (arg1.field6667 != null) {
                                             this.field10955[var46] = arg1.field6667[var67];
                                          }

                                          if (arg1.field6671 != null) {
                                             this.field11066[var46] = arg1.field6671[var67];
                                          }

                                          this.field11031[var46] = arg1.field6697[var67];
                                          this.field10979[var46] = var71;
                                          ++var46;
                                       } else {
                                          if (arg1.field6667 != null) {
                                             this.field10955[var46] = arg1.field6667[var67];
                                          }

                                          if (arg1.field6671 != null) {
                                             this.field11066[var46] = arg1.field6671[var67];
                                          }

                                          this.field11031[var46] = arg1.field6697[var67];
                                          this.field10979[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       if (~var146 == -2) {
                                          var155 = var44[var67];
                                          var156 = (long)((~var155.field7535 < -1 ? 1024 : 2048) + (var69 << 2) + (var155.field7534 + 256 << 12) - -(var155.field7536 + 256 << 22)) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                          this.field11048[var46] = this.method5423(var73, arg1, (byte)77, 0, var155.field7534, arg1.field6674[var67], var156, var74, var155.field7536, var155.field7535);
                                          this.field10989[var46] = this.method5423(var75, arg1, (byte)-112, 0, var155.field7534, arg1.field6683[var67], (long)var79 + var156, var76, var155.field7536, var155.field7535);
                                          this.field10949[var46] = this.method5423(var77, arg1, (byte)-127, 0, var155.field7534, arg1.field6663[var67], (long)var80 + var156, var78, var155.field7536, var155.field7535);
                                       }

                                       if (arg1.field6667 != null) {
                                          this.field10955[var46] = arg1.field6667[var67];
                                       }

                                       if (arg1.field6671 != null) {
                                          this.field11066[var46] = arg1.field6671[var67];
                                       }

                                       this.field11031[var46] = arg1.field6697[var67];
                                       this.field10979[var46] = var71;
                                       ++var46;
                                    }

                                    if (var46 >= this.field10996) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field10979[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (var158 >= this.field11010) {
                                                this.field11006 = new int[var67 + 1];
                                                var68 = -10000;
                                                var67 = 0;
                                                var169 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }

                                                   while(true) {
                                                      if (~this.field11010 >= ~var169) {
                                                         this.field11006[var67] = this.field11010;
                                                         class550.field7890 = null;
                                                         this.field11004 = class314.method2314(36, this.field11004, this.field10962);
                                                         this.field11012 = class314.method2314(101, this.field11012, this.field10962);
                                                         this.field11067 = class314.method2314(53, this.field11067, this.field10962);
                                                         this.field10970 = class190.method1504((byte)49, this.field10962, this.field10970);
                                                         this.field11016 = class522.method3790(this.field10962, this.field11016, true);
                                                         var171 = this;
                                                         if (!var7) {
                                                            this.field10998 = class522.method3790(this.field10962, this.field10998, true);
                                                            if (arg1.field6658 != null && class333.method2464(arg2, 32, this.field11008)) {
                                                               this.field11005 = arg1.method3367(0, false);
                                                            }

                                                            if (arg1.field6678 != null && class546.method3919(this.field11008, (byte)-101, arg2)) {
                                                               this.field10982 = arg1.method3382(256);
                                                            }

                                                            if (arg1.field6704 != null && class151.method1261(arg2, 127, this.field11008)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field6704[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (this.field10996 <= var163) {
                                                                     this.field11036 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field11036[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var164 <= var161) {
                                                                              this.field11036[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && var165 >= this.field10996) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field6704[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field11036[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(var165 < this.field10996);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field6704[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var171 = this;
                                                      }

                                                      var160 = var171.field10979[var169];
                                                      if (var68 != var160) {
                                                         this.field11006[var67++] = var169;
                                                         var68 = var160;
                                                      }

                                                      ++var169;
                                                   }
                                                }
                                             } else {
                                                var169 = this.field10979[var158];
                                             }

                                             if (var68 != var169) {
                                                ++var67;
                                                var68 = var169;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field6697[var67];
                                    }

                                    if (arg1.field6676 == null) {
                                       var69 = -1;
                                       if (var7) {
                                          var69 = arg1.field6676[var67];
                                       }
                                    } else {
                                       var69 = arg1.field6676[var67];
                                    }

                                    if (arg1.field6667 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field6667[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field6667[var67] & 255;
                                    }

                                    var71 = arg1.field6679 == null ? -1 : arg1.field6679[var67];
                                    if (~var71 != 0 && (64 & this.field11008) != 0) {
                                       var72 = var8.method1354(65535 & var71, (byte)-109);
                                       if (var72.field4328) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field10986[var41];
                           }

                           var42 = var10000;
                           this.field10986[var41] = var40;
                           var32[var41] = new class165();
                           var40 += var42;
                           ++var41;
                        }
                     }
                  } else {
                     var170 = arg1;
                  }
               }
            }

            if (var10000 != -1) {
               var11 = var8.method1354(65535 & arg1.field6679[var10], (byte)-109);
               if (~(this.field11008 & 64) != -1) {
                  if (!var11.field4328) {
                     if (var11.field4320) {
                        if (var7) {
                           var9[this.field10996++] = var10;
                           ++this.field10986[arg1.field6674[var10]];
                           ++this.field10986[arg1.field6683[var10]];
                           ++this.field10986[arg1.field6663[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field10996++] = var10;
                        ++this.field10986[arg1.field6674[var10]];
                        ++this.field10986[arg1.field6683[var10]];
                        ++this.field10986[arg1.field6663[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field10996++] = var10;
                     ++this.field10986[arg1.field6674[var10]];
                     ++this.field10986[arg1.field6683[var10]];
                     ++this.field10986[arg1.field6663[var10]];
                     ++var10;
                  }
               } else if (var11.field4320) {
                  if (var7) {
                     var9[this.field10996++] = var10;
                     ++this.field10986[arg1.field6674[var10]];
                     ++this.field10986[arg1.field6683[var10]];
                     ++this.field10986[arg1.field6663[var10]];
                     ++var10;
                  } else {
                     ++var10;
                  }
               } else {
                  var9[this.field10996++] = var10;
                  ++this.field10986[arg1.field6674[var10]];
                  ++this.field10986[arg1.field6683[var10]];
                  ++this.field10986[arg1.field6663[var10]];
                  ++var10;
               }
            } else {
               var9[this.field10996++] = var10;
               ++this.field10986[arg1.field6674[var10]];
               ++this.field10986[arg1.field6683[var10]];
               ++this.field10986[arg1.field6663[var10]];
               ++var10;
            }
         }
      } catch (RuntimeException var168) {
         throw class237.method1823(var168, field11074[4] + (arg0 != null ? field11074[0] : field11074[1]) + ',' + (arg1 != null ? field11074[0] : field11074[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "wa",
      descriptor = "()V",
      line = 1873
   )
   public final void method189() {
      boolean var1 = client.field4360;

      try {
         ++field11068;
         int var2 = 0;
         if (var1) {
            this.field10951[var2] = this.field10951[var2] + 7 >> 4;
            this.field11021[var2] = this.field11021[var2] + 7 >> 4;
            this.field10987[var2] = this.field10987[var2] - -7 >> 4;
            ++var2;
         }

         while(true) {
            while(this.field10961 > var2) {
               this.field10951[var2] = this.field10951[var2] + 7 >> 4;
               this.field11021[var2] = this.field11021[var2] + 7 >> 4;
               this.field10987[var2] = this.field10987[var2] - -7 >> 4;
               ++var2;
            }

            if (!var1) {
               if (this.field11011 != null) {
                  this.field11011.field72 = null;
               }

               this.field10995 = false;
               return;
            }

            this.field10987[var2] = this.field10987[var2] - -7 >> 4;
            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11074[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "d",
      descriptor = "()Z",
      line = 1897
   )
   public final boolean method191() {
      boolean var1 = client.field4360;

      try {
         ++field10953;
         if (this.field10979 == null) {
            return true;
         } else {
            int var2 = 0;
            if (var1) {
               if (this.field10979[var2] != -1 && !this.field10973.field802.method1353(this.field10979[var2], (byte)124)) {
                  return false;
               }

               ++var2;
            }

            while(true) {
               short var10000;
               if (~var2 <= ~this.field10979.length) {
                  var10000 = 1;
                  if (!var1) {
                     return true;
                  }
               } else {
                  var10000 = this.field10979[var2];
               }

               if (var10000 != -1 && !this.field10973.field802.method1353(this.field10979[var2], (byte)124)) {
                  return false;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11074[55] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(ZB)V",
      line = 1922
   )
   private final void method5416(boolean arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         label81: {
            if (this.field10973.field8490.field1889.length >= this.field11010 * 6) {
               this.field10973.field8490.field1856 = 0;
               if (!var3) {
                  break label81;
               }
            }

            this.field10973.field8490 = new class77((this.field11010 - -100) * 6);
         }

         ++field11037;
         class77 var4 = this.field10973.field8490;
         int var5;
         if (!this.field10973.field8469) {
            var5 = 0;
            if (var3) {
               var4.method1205(arg1 + 217, this.field11048[var5]);
               var4.method1205(118, this.field10989[var5]);
               var4.method1205(116, this.field10949[var5]);
               ++var5;
            }

            while(true) {
               while(~var5 > ~this.field11010) {
                  var4.method1205(arg1 + 217, this.field11048[var5]);
                  var4.method1205(118, this.field10989[var5]);
                  var4.method1205(116, this.field10949[var5]);
                  ++var5;
               }

               if (!var3) {
                  if (var3) {
                     var5 = 0;
                     if (var3) {
                        var4.method1185(this.field11048[var5], true);
                        var4.method1185(this.field10989[var5], true);
                        var4.method1185(this.field10949[var5], true);
                        ++var5;
                     }
                  } else {
                     if (!var3) {
                        if (~var4.field1856 == -1) {
                           return;
                        }

                        label115: {
                           if (arg0) {
                              label123: {
                                 if (this.field10971 != null) {
                                    this.field10971.method1010((byte)113, 5123, var4.field1889, var4.field1856);
                                    if (!var3) {
                                       break label123;
                                    }
                                 }

                                 this.field10971 = this.field10973.method4177(var4.field1889, 5123, true, 70, var4.field1856);
                              }

                              this.field11063.field5594 = this.field10971;
                              if (!var3) {
                                 break label115;
                              }
                           }

                           this.field11063.field5594 = this.field10973.method4177(var4.field1889, 5123, false, 81, var4.field1856);
                        }

                        if (!arg0) {
                           this.field11033 = true;
                        }

                        if (arg1 != -92) {
                           this.field11012 = null;
                           return;
                        }

                        return;
                     }

                     var4.method1185(this.field10949[var5], true);
                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var3) {
               var4.method1185(this.field11048[var5], true);
               var4.method1185(this.field10989[var5], true);
               var4.method1185(this.field10949[var5], true);
               ++var5;
            }
         }

         while(true) {
            while(~this.field11010 < ~var5) {
               var4.method1185(this.field11048[var5], true);
               var4.method1185(this.field10989[var5], true);
               var4.method1185(this.field10949[var5], true);
               ++var5;
            }

            if (!var3) {
               if (~var4.field1856 == -1) {
                  return;
               }

               label55: {
                  if (arg0) {
                     label52: {
                        if (this.field10971 != null) {
                           this.field10971.method1010((byte)113, 5123, var4.field1889, var4.field1856);
                           if (!var3) {
                              break label52;
                           }
                        }

                        this.field10971 = this.field10973.method4177(var4.field1889, 5123, true, 70, var4.field1856);
                     }

                     this.field11063.field5594 = this.field10971;
                     if (!var3) {
                        break label55;
                     }
                  }

                  this.field11063.field5594 = this.field10973.method4177(var4.field1889, 5123, false, 81, var4.field1856);
               }

               if (!arg0) {
                  this.field11033 = true;
               }

               if (arg1 != -92) {
                  this.field11012 = null;
                  return;
               }

               return;
            }

            var4.method1185(this.field10949[var5], true);
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11074[53] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(I[IIIIIZ)V",
      line = 1993
   )
   public final void method210(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      boolean var8 = client.field4360;

      try {
         ++field11040;
         int var9 = arg1.length;
         int var10000;
         int var110;
         int var111;
         int var112;
         if (~arg0 != -1) {
            if (~arg0 != -2) {
               if (arg0 != 2) {
                  if (~arg0 != -4) {
                     if (arg0 == 5) {
                        if (this.field11036 != null) {
                           int var69 = 0;
                           if (var8 || var9 > var69) {
                              do {
                                 int var70 = arg1[var69];
                                 if (var70 >= this.field11036.length) {
                                    ++var69;
                                 } else {
                                    int[] var71 = this.field11036[var70];
                                    int var72 = 0;
                                    if (var8) {
                                       var10000 = var71[var72];
                                    } else if (~var71.length >= ~var72) {
                                       var10000 = var71.length;
                                       if (!var8) {
                                          if (var10000 > 0 && this.field11043 != null) {
                                             this.field11043.field72 = null;
                                          }

                                          ++var69;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var71[var72];
                                    }

                                    while(true) {
                                       int var73 = var10000;
                                       int var74 = (255 & this.field10955[var73]) + arg2 * 8;
                                       if (var74 < 0) {
                                          var74 = 0;
                                          if (var8 && var74 > 255) {
                                             var74 = 255;
                                          }
                                       } else if (var74 > 255) {
                                          var74 = 255;
                                       }

                                       this.field10955[var73] = (byte)var74;
                                       ++var72;
                                       if (~var71.length >= ~var72) {
                                          var10000 = var71.length;
                                          if (!var8) {
                                             if (var10000 > 0 && this.field11043 != null) {
                                                this.field11043.field72 = null;
                                             }

                                             ++var69;
                                             break;
                                          }
                                       } else {
                                          var10000 = var71[var72];
                                       }
                                    }
                                 }
                              } while(var9 > var69);
                           }

                           if (this.field10994 != null) {
                              int var75 = 0;
                              if (var8 || this.field11042 > var75) {
                                 do {
                                    class116 var76 = this.field10994[var75];
                                    class319 var77 = this.field10984[var75];
                                    var77.field4362 = 255 - (this.field10955[var76.field1447] & 255) << 24 | var77.field4362 & 16777215;
                                    ++var75;
                                 } while(this.field11042 > var75);
                              }
                           }
                        }

                     } else if (arg0 == 7) {
                        if (this.field11036 != null) {
                           int var78 = 0;
                           if (var8 || var9 > var78) {
                              do {
                                 int var79 = arg1[var78];
                                 if (~this.field11036.length >= ~var79) {
                                    ++var78;
                                 } else {
                                    int[] var80 = this.field11036[var79];
                                    int var81 = 0;
                                    if (var8) {
                                       var10000 = var80[var81];
                                    } else if (var80.length <= var81) {
                                       var10000 = ~var80.length;
                                       if (!var8) {
                                          if (var10000 < -1 && this.field11043 != null) {
                                             this.field11043.field72 = null;
                                          }

                                          ++var78;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var80[var81];
                                    }

                                    while(true) {
                                       int var82 = var10000;
                                       int var83 = this.field11031[var82] & 65535;
                                       int var84 = (var83 & 65534) >> 10;
                                       int var85 = var83 >> 7 & 7;
                                       int var86 = arg3 / 4 + var85;
                                       int var87 = 63 & arg2 + var84;
                                       int var88 = var83 & 127;
                                       int var89 = arg4 + var88;
                                       if (~var86 <= -1) {
                                          if (var86 > 7) {
                                             var86 = 7;
                                             if (var8) {
                                                var86 = 0;
                                             }
                                          }
                                       } else {
                                          var86 = 0;
                                       }

                                       if (~var89 > -1) {
                                          var89 = 0;
                                          if (var8 && ~var89 < -128) {
                                             var89 = 127;
                                          }
                                       } else if (~var89 < -128) {
                                          var89 = 127;
                                       }

                                       this.field11031[var82] = (short)class300.method2238(class300.method2238(var86 << 7, var87 << 10), var89);
                                       ++var81;
                                       if (var80.length <= var81) {
                                          var10000 = ~var80.length;
                                          if (!var8) {
                                             if (var10000 < -1 && this.field11043 != null) {
                                                this.field11043.field72 = null;
                                             }

                                             ++var78;
                                             break;
                                          }
                                       } else {
                                          var10000 = var80[var81];
                                       }
                                    }
                                 }
                              } while(var9 > var78);
                           }

                           if (this.field10994 != null) {
                              int var90 = 0;
                              if (var8 || this.field11042 > var90) {
                                 do {
                                    class116 var91 = this.field10994[var90];
                                    class319 var92 = this.field10984[var90];
                                    var92.field4362 = -16777216 & var92.field4362 | 16777215 & class546.field7829[65535 & this.field11031[var91.field1447]];
                                    ++var90;
                                 } while(this.field11042 > var90);
                              }
                           }
                        }

                     } else if (arg0 == 8) {
                        if (this.field10982 != null) {
                           int var93 = 0;
                           if (var8 || ~var93 > ~var9) {
                              do {
                                 int var94 = arg1[var93];
                                 if (~var94 <= ~this.field10982.length) {
                                    ++var93;
                                 } else {
                                    int[] var95 = this.field10982[var94];
                                    int var96 = 0;
                                    if (!var8 && var95.length <= var96) {
                                       ++var93;
                                    } else {
                                       do {
                                          class319 var97 = this.field10984[var95[var96]];
                                          var97.field4367 += arg3;
                                          var97.field4373 += arg2;
                                          ++var96;
                                       } while(var95.length > var96);

                                       ++var93;
                                    }
                                 }
                              } while(~var93 > ~var9);
                           }
                        }

                     } else if (arg0 == 10) {
                        if (this.field10982 != null) {
                           int var98 = 0;
                           if (var8 || var9 > var98) {
                              do {
                                 int var99 = arg1[var98];
                                 if (this.field10982.length <= var99) {
                                    ++var98;
                                 } else {
                                    int[] var100 = this.field10982[var99];
                                    int var101 = 0;
                                    if (!var8 && var100.length <= var101) {
                                       ++var98;
                                    } else {
                                       do {
                                          class319 var102 = this.field10984[var100[var101]];
                                          var102.field4372 = var102.field4372 * arg3 >> 7;
                                          var102.field4371 = var102.field4371 * arg2 >> 7;
                                          ++var101;
                                       } while(var100.length > var101);

                                       ++var98;
                                    }
                                 }
                              } while(var9 > var98);
                           }
                        }

                     } else if (arg0 == 9) {
                        if (this.field10982 != null) {
                           int var103 = 0;
                           if (var8 || var103 < var9) {
                              do {
                                 int var104 = arg1[var103];
                                 if (this.field10982.length <= var104) {
                                    ++var103;
                                 } else {
                                    int[] var105 = this.field10982[var104];
                                    int var106 = 0;
                                    if (!var8 && var106 >= var105.length) {
                                       ++var103;
                                    } else {
                                       do {
                                          class319 var107 = this.field10984[var105[var106]];
                                          var107.field4366 = 16383 & var107.field4366 - -arg2;
                                          ++var106;
                                       } while(var106 < var105.length);

                                       ++var103;
                                    }
                                 }
                              } while(var103 < var9);
                           }
                        }

                     }
                  } else {
                     int var64 = 0;
                     if (var8 || ~var64 > ~var9) {
                        do {
                           int var65 = arg1[var64];
                           if (this.field11005.length <= var65) {
                              ++var64;
                           } else {
                              int[] var66 = this.field11005[var65];
                              int var67 = 0;
                              if (!var8 && var66.length <= var67) {
                                 ++var64;
                              } else {
                                 do {
                                    int var68 = var66[var67];
                                    this.field10951[var68] -= class405.field5857;
                                    this.field11021[var68] -= class653.field9565;
                                    this.field10987[var68] -= class218.field3119;
                                    this.field10951[var68] = this.field10951[var68] * arg2 >> 7;
                                    this.field11021[var68] = this.field11021[var68] * arg3 >> 7;
                                    this.field10987[var68] = this.field10987[var68] * arg4 >> 7;
                                    this.field10951[var68] += class405.field5857;
                                    this.field11021[var68] += class653.field9565;
                                    this.field10987[var68] += class218.field3119;
                                    ++var67;
                                 } while(var66.length > var67);

                                 ++var64;
                              }
                           }
                        } while(~var64 > ~var9);

                     }
                  }
               } else {
                  int var21 = 0;
                  int var46;
                  int var47;
                  int[] var48;
                  int var49;
                  int var50;
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  int var57;
                  int var58;
                  int var59;
                  int var60;
                  int var61;
                  int var62;
                  int var63;
                  if (var8) {
                     var10000 = arg1[var21];
                  } else if (var9 <= var21) {
                     var10000 = arg6;
                     if (!var8) {
                        if (arg6 != 0) {
                           var46 = 0;
                           if (var8 || var9 > var46) {
                              do {
                                 var47 = arg1[var46];
                                 if (this.field11005.length <= var47) {
                                    ++var46;
                                 } else {
                                    var48 = this.field11005[var47];
                                    var49 = 0;
                                    if (!var8 && var49 >= var48.length) {
                                       ++var46;
                                    } else {
                                       label638:
                                       do {
                                          var50 = var48[var49];
                                          var51 = this.field10986[var50];
                                          var52 = this.field10986[var50 - -1];
                                          var53 = var51;
                                          if (!var8 && var51 >= var52) {
                                             ++var49;
                                          } else {
                                             do {
                                                var54 = this.field10954[var53] - 1;
                                                if (~var54 == 0) {
                                                   ++var49;
                                                   continue label638;
                                                }

                                                if (arg4 != 0) {
                                                   var55 = class363.field4956[arg4];
                                                   var56 = class363.field4987[arg4];
                                                   var57 = this.field11004[var54] * var56 + this.field11012[var54] * var55 + 16383 >> 14;
                                                   this.field11012[var54] = (short)(this.field11012[var54] * var56 + 16383 + -(this.field11004[var54] * var55) >> 14);
                                                   this.field11004[var54] = (short)var57;
                                                }

                                                if (arg2 != 0) {
                                                   var58 = class363.field4956[arg2];
                                                   var59 = class363.field4987[arg2];
                                                   var60 = this.field11012[var54] * var59 - this.field11067[var54] * var58 + 16383 >> 14;
                                                   this.field11067[var54] = (short)(this.field11067[var54] * var59 + this.field11012[var54] * var58 + 16383 >> 14);
                                                   this.field11012[var54] = (short)var60;
                                                }

                                                if (~arg3 != -1) {
                                                   var61 = class363.field4956[arg3];
                                                   var62 = class363.field4987[arg3];
                                                   var63 = this.field11067[var54] * var61 + this.field11004[var54] * var62 - -16383 >> 14;
                                                   this.field11067[var54] = (short)(this.field11067[var54] * var62 + (-(this.field11004[var54] * var61) - -16383) >> 14);
                                                   this.field11004[var54] = (short)var63;
                                                }

                                                ++var53;
                                             } while(var53 < var52);

                                             ++var49;
                                          }
                                       } while(var49 < var48.length);

                                       ++var46;
                                    }
                                 }
                              } while(var9 > var46);
                           }

                           if (this.field10958 == null && this.field11043 != null) {
                              this.field11043.field72 = null;
                           }

                           if (this.field10958 != null) {
                              this.field10958.field72 = null;
                           }
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var21];
                  }

                  while(true) {
                     int var22 = var10000;
                     if (~var22 <= ~this.field11005.length) {
                        ++var21;
                     } else {
                        label839: {
                           int[] var23 = this.field11005[var22];
                           int var35;
                           int var36;
                           int var37;
                           int var38;
                           int var39;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           int var44;
                           int var45;
                           if ((arg5 & 1) == 0) {
                              int var24 = 0;
                              int var25;
                              int var26;
                              int var27;
                              int var28;
                              int var29;
                              int var30;
                              int var31;
                              int var32;
                              int var33;
                              int var34;
                              if (var8) {
                                 var25 = var23[var24];
                                 this.field10951[var25] -= class405.field5857;
                                 this.field11021[var25] -= class653.field9565;
                                 this.field10987[var25] -= class218.field3119;
                                 if (~arg4 != -1) {
                                    var26 = class363.field4956[arg4];
                                    var27 = class363.field4987[arg4];
                                    var28 = this.field11021[var25] * var26 + (this.field10951[var25] * var27 - -16383) >> 14;
                                    this.field11021[var25] = this.field11021[var25] * var27 + -(this.field10951[var25] * var26) + 16383 >> 14;
                                    this.field10951[var25] = var28;
                                 }

                                 if (arg2 != 0) {
                                    var29 = class363.field4956[arg2];
                                    var30 = class363.field4987[arg2];
                                    var31 = this.field11021[var25] * var30 - -16383 + -(this.field10987[var25] * var29) >> 14;
                                    this.field10987[var25] = this.field11021[var25] * var29 + this.field10987[var25] * var30 + 16383 >> 14;
                                    this.field11021[var25] = var31;
                                 }

                                 if (~arg3 != -1) {
                                    var32 = class363.field4956[arg3];
                                    var33 = class363.field4987[arg3];
                                    var34 = this.field10987[var25] * var32 - -(this.field10951[var25] * var33) + 16383 >> 14;
                                    this.field10987[var25] = this.field10987[var25] * var33 + -(this.field10951[var25] * var32) - -16383 >> 14;
                                    this.field10951[var25] = var34;
                                 }

                                 this.field10951[var25] += class405.field5857;
                                 this.field11021[var25] += class653.field9565;
                                 this.field10987[var25] += class218.field3119;
                                 ++var24;
                              }

                              while(var24 < var23.length) {
                                 var25 = var23[var24];
                                 this.field10951[var25] -= class405.field5857;
                                 this.field11021[var25] -= class653.field9565;
                                 this.field10987[var25] -= class218.field3119;
                                 if (~arg4 != -1) {
                                    var26 = class363.field4956[arg4];
                                    var27 = class363.field4987[arg4];
                                    var28 = this.field11021[var25] * var26 + (this.field10951[var25] * var27 - -16383) >> 14;
                                    this.field11021[var25] = this.field11021[var25] * var27 + -(this.field10951[var25] * var26) + 16383 >> 14;
                                    this.field10951[var25] = var28;
                                 }

                                 if (arg2 != 0) {
                                    var29 = class363.field4956[arg2];
                                    var30 = class363.field4987[arg2];
                                    var31 = this.field11021[var25] * var30 - -16383 + -(this.field10987[var25] * var29) >> 14;
                                    this.field10987[var25] = this.field11021[var25] * var29 + this.field10987[var25] * var30 + 16383 >> 14;
                                    this.field11021[var25] = var31;
                                 }

                                 if (~arg3 != -1) {
                                    var32 = class363.field4956[arg3];
                                    var33 = class363.field4987[arg3];
                                    var34 = this.field10987[var25] * var32 - -(this.field10951[var25] * var33) + 16383 >> 14;
                                    this.field10987[var25] = this.field10987[var25] * var33 + -(this.field10951[var25] * var32) - -16383 >> 14;
                                    this.field10951[var25] = var34;
                                 }

                                 this.field10951[var25] += class405.field5857;
                                 this.field11021[var25] += class653.field9565;
                                 this.field10987[var25] += class218.field3119;
                                 ++var24;
                              }

                              if (!var8) {
                                 ++var21;
                                 break label839;
                              }

                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field10951[var36] -= class405.field5857;
                                 this.field11021[var36] -= class653.field9565;
                                 this.field10987[var36] -= class218.field3119;
                                 if (arg2 != 0) {
                                    var37 = class363.field4956[arg2];
                                    var38 = class363.field4987[arg2];
                                    var39 = this.field11021[var36] * var38 + 16383 + -(this.field10987[var36] * var37) >> 14;
                                    this.field10987[var36] = this.field11021[var36] * var37 + this.field10987[var36] * var38 + 16383 >> 14;
                                    this.field11021[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class363.field4956[arg4];
                                    var41 = class363.field4987[arg4];
                                    var42 = this.field11021[var36] * var40 + this.field10951[var36] * var41 + 16383 >> 14;
                                    this.field11021[var36] = this.field11021[var36] * var41 + -(this.field10951[var36] * var40) + 16383 >> 14;
                                    this.field10951[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class363.field4956[arg3];
                                    var44 = class363.field4987[arg3];
                                    var45 = this.field10987[var36] * var43 + this.field10951[var36] * var44 + 16383 >> 14;
                                    this.field10987[var36] = this.field10987[var36] * var44 + -(this.field10951[var36] * var43) - -16383 >> 14;
                                    this.field10951[var36] = var45;
                                 }

                                 this.field10951[var36] += class405.field5857;
                                 this.field11021[var36] += class653.field9565;
                                 this.field10987[var36] += class218.field3119;
                                 ++var35;
                              }
                           } else {
                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field10951[var36] -= class405.field5857;
                                 this.field11021[var36] -= class653.field9565;
                                 this.field10987[var36] -= class218.field3119;
                                 if (arg2 != 0) {
                                    var37 = class363.field4956[arg2];
                                    var38 = class363.field4987[arg2];
                                    var39 = this.field11021[var36] * var38 + 16383 + -(this.field10987[var36] * var37) >> 14;
                                    this.field10987[var36] = this.field11021[var36] * var37 + this.field10987[var36] * var38 + 16383 >> 14;
                                    this.field11021[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class363.field4956[arg4];
                                    var41 = class363.field4987[arg4];
                                    var42 = this.field11021[var36] * var40 + this.field10951[var36] * var41 + 16383 >> 14;
                                    this.field11021[var36] = this.field11021[var36] * var41 + -(this.field10951[var36] * var40) + 16383 >> 14;
                                    this.field10951[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class363.field4956[arg3];
                                    var44 = class363.field4987[arg3];
                                    var45 = this.field10987[var36] * var43 + this.field10951[var36] * var44 + 16383 >> 14;
                                    this.field10987[var36] = this.field10987[var36] * var44 + -(this.field10951[var36] * var43) - -16383 >> 14;
                                    this.field10951[var36] = var45;
                                 }

                                 this.field10951[var36] += class405.field5857;
                                 this.field11021[var36] += class653.field9565;
                                 this.field10987[var36] += class218.field3119;
                                 ++var35;
                              }
                           }

                           while(var35 < var23.length) {
                              var36 = var23[var35];
                              this.field10951[var36] -= class405.field5857;
                              this.field11021[var36] -= class653.field9565;
                              this.field10987[var36] -= class218.field3119;
                              if (arg2 != 0) {
                                 var37 = class363.field4956[arg2];
                                 var38 = class363.field4987[arg2];
                                 var39 = this.field11021[var36] * var38 + 16383 + -(this.field10987[var36] * var37) >> 14;
                                 this.field10987[var36] = this.field11021[var36] * var37 + this.field10987[var36] * var38 + 16383 >> 14;
                                 this.field11021[var36] = var39;
                              }

                              if (~arg4 != -1) {
                                 var40 = class363.field4956[arg4];
                                 var41 = class363.field4987[arg4];
                                 var42 = this.field11021[var36] * var40 + this.field10951[var36] * var41 + 16383 >> 14;
                                 this.field11021[var36] = this.field11021[var36] * var41 + -(this.field10951[var36] * var40) + 16383 >> 14;
                                 this.field10951[var36] = var42;
                              }

                              if (arg3 != 0) {
                                 var43 = class363.field4956[arg3];
                                 var44 = class363.field4987[arg3];
                                 var45 = this.field10987[var36] * var43 + this.field10951[var36] * var44 + 16383 >> 14;
                                 this.field10987[var36] = this.field10987[var36] * var44 + -(this.field10951[var36] * var43) - -16383 >> 14;
                                 this.field10951[var36] = var45;
                              }

                              this.field10951[var36] += class405.field5857;
                              this.field11021[var36] += class653.field9565;
                              this.field10987[var36] += class218.field3119;
                              ++var35;
                           }

                           ++var21;
                        }
                     }

                     if (var9 <= var21) {
                        var10000 = arg6;
                        if (!var8) {
                           if (arg6 != 0) {
                              var46 = 0;
                              if (var8 || var9 > var46) {
                                 do {
                                    var47 = arg1[var46];
                                    if (this.field11005.length <= var47) {
                                       ++var46;
                                    } else {
                                       var48 = this.field11005[var47];
                                       var49 = 0;
                                       if (!var8 && var49 >= var48.length) {
                                          ++var46;
                                       } else {
                                          label266:
                                          do {
                                             var50 = var48[var49];
                                             var51 = this.field10986[var50];
                                             var52 = this.field10986[var50 - -1];
                                             var53 = var51;
                                             if (!var8 && var51 >= var52) {
                                                ++var49;
                                             } else {
                                                do {
                                                   var54 = this.field10954[var53] - 1;
                                                   if (~var54 == 0) {
                                                      ++var49;
                                                      continue label266;
                                                   }

                                                   if (arg4 != 0) {
                                                      var55 = class363.field4956[arg4];
                                                      var56 = class363.field4987[arg4];
                                                      var57 = this.field11004[var54] * var56 + this.field11012[var54] * var55 + 16383 >> 14;
                                                      this.field11012[var54] = (short)(this.field11012[var54] * var56 + 16383 + -(this.field11004[var54] * var55) >> 14);
                                                      this.field11004[var54] = (short)var57;
                                                   }

                                                   if (arg2 != 0) {
                                                      var58 = class363.field4956[arg2];
                                                      var59 = class363.field4987[arg2];
                                                      var60 = this.field11012[var54] * var59 - this.field11067[var54] * var58 + 16383 >> 14;
                                                      this.field11067[var54] = (short)(this.field11067[var54] * var59 + this.field11012[var54] * var58 + 16383 >> 14);
                                                      this.field11012[var54] = (short)var60;
                                                   }

                                                   if (~arg3 != -1) {
                                                      var61 = class363.field4956[arg3];
                                                      var62 = class363.field4987[arg3];
                                                      var63 = this.field11067[var54] * var61 + this.field11004[var54] * var62 - -16383 >> 14;
                                                      this.field11067[var54] = (short)(this.field11067[var54] * var62 + (-(this.field11004[var54] * var61) - -16383) >> 14);
                                                      this.field11004[var54] = (short)var63;
                                                   }

                                                   ++var53;
                                                } while(var53 < var52);

                                                ++var49;
                                             }
                                          } while(var49 < var48.length);

                                          ++var46;
                                       }
                                    }
                                 } while(var9 > var46);
                              }

                              if (this.field10958 == null && this.field11043 != null) {
                                 this.field11043.field72 = null;
                              }

                              if (this.field10958 != null) {
                                 this.field10958.field72 = null;
                              }
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var21];
                     }
                  }
               }
            } else {
               var112 = arg4 << 4;
               var111 = arg3 << 4;
               var110 = arg2 << 4;
               int var16 = 0;
               if (var8 || ~var9 < ~var16) {
                  do {
                     int var17 = arg1[var16];
                     if (~var17 <= ~this.field11005.length) {
                        ++var16;
                     } else {
                        int[] var18 = this.field11005[var17];
                        int var19 = 0;
                        if (!var8 && var19 >= var18.length) {
                           ++var16;
                        } else {
                           do {
                              int var20 = var18[var19];
                              this.field10951[var20] += var110;
                              this.field11021[var20] += var111;
                              this.field10987[var20] += var112;
                              ++var19;
                           } while(var19 < var18.length);

                           ++var16;
                        }
                     }
                  } while(~var9 < ~var16);

               }
            }
         } else {
            var111 = arg3 << 4;
            var110 = arg2 << 4;
            var112 = arg4 << 4;
            class218.field3119 = 0;
            int var10 = 0;
            class653.field9565 = 0;
            class405.field5857 = 0;
            int var11 = 0;
            if (var8) {
               var10000 = arg1[var11];
            } else if (var9 <= var11) {
               var10000 = var10;
               if (!var8) {
                  if (var10 <= 0) {
                     class653.field9565 = var111;
                     class405.field5857 = var110;
                     class218.field3119 = var112;
                     return;
                  }

                  class405.field5857 = class405.field5857 / var10 + var110;
                  class653.field9565 = class653.field9565 / var10 - -var111;
                  class218.field3119 = class218.field3119 / var10 + var112;
                  return;
               }
            } else {
               var10000 = arg1[var11];
            }

            while(true) {
               int var12 = var10000;
               if (~var12 <= ~this.field11005.length) {
                  ++var11;
               } else {
                  int[] var13 = this.field11005[var12];
                  int var14 = 0;
                  int var15;
                  if (var8) {
                     var15 = var13[var14];
                     class405.field5857 += this.field10951[var15];
                     class653.field9565 += this.field11021[var15];
                     ++var10;
                     class218.field3119 += this.field10987[var15];
                     ++var14;
                  }

                  while(~var14 > ~var13.length) {
                     var15 = var13[var14];
                     class405.field5857 += this.field10951[var15];
                     class653.field9565 += this.field11021[var15];
                     ++var10;
                     class218.field3119 += this.field10987[var15];
                     ++var14;
                  }

                  ++var11;
               }

               if (var9 <= var11) {
                  var10000 = var10;
                  if (!var8) {
                     if (var10 <= 0) {
                        class653.field9565 = var111;
                        class405.field5857 = var110;
                        class218.field3119 = var112;
                        return;
                     }

                     class405.field5857 = class405.field5857 / var10 + var110;
                     class653.field9565 = class653.field9565 / var10 - -var111;
                     class218.field3119 = class218.field3119 / var10 + var112;
                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var109) {
         throw class237.method1823(var109, field11074[20] + arg0 + ',' + (arg1 != null ? field11074[0] : field11074[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IILew;ZII)Z",
      line = 2649
   )
   public final boolean method206(int arg0, int arg1, class521 arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field10950;
         return this.method5411(arg0, arg2, arg1, arg3, (byte)-126, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11074[30] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11074[0] : field11074[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "F",
      descriptor = "()Z",
      line = 2672
   )
   public final boolean method222() {
      try {
         ++field11058;
         return this.field11028;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "FA",
      descriptor = "(I)V",
      line = 2684
   )
   public final void method227(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11049;
         int var3 = class363.field4956[arg0];
         int var4 = class363.field4987[arg0];
         int var5 = 0;
         class747 var10000;
         if (var2) {
            var10000 = this;
         } else if (~this.field10997 >= ~var5) {
            var10000 = this;
            if (!var2) {
               if (this.field11011 != null) {
                  this.field11011.field72 = null;
               }

               this.field10995 = false;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = -(var10000.field10987[var5] * var3) + this.field11021[var5] * var4 >> 14;
            this.field10987[var5] = this.field11021[var5] * var3 + this.field10987[var5] * var4 >> 14;
            this.field11021[var5] = var6;
            ++var5;
            if (~this.field10997 >= ~var5) {
               var10000 = this;
               if (!var2) {
                  if (this.field11011 != null) {
                     this.field11011.field72 = null;
                  }

                  this.field10995 = false;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11074[51] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "(I)V",
      line = 2714
   )
   public static void method5417(int arg0) {
      try {
         if (arg0 >= 28) {
            field10990 = null;
            field11059 = null;
            field11072 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(I)V",
      line = 2729
   )
   public final void method156(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10980;
         int var3 = class363.field4956[arg0];
         int var4 = class363.field4987[arg0];
         int var5 = 0;
         if (!var2 && this.field10997 <= var5) {
            if (this.field11011 != null) {
               this.field11011.field72 = null;
            }

            this.field10995 = false;
         } else {
            do {
               int var6 = this.field10987[var5] * var3 + this.field10951[var5] * var4 >> 14;
               this.field10987[var5] = this.field10987[var5] * var4 + -(this.field10951[var5] * var3) >> 14;
               this.field10951[var5] = var6;
               ++var5;
            } while(this.field10997 > var5);

            if (this.field11011 != null) {
               this.field11011.field72 = null;
            }

            this.field10995 = false;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11074[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "EA",
      descriptor = "()I",
      line = 2760
   )
   public final int method201() {
      try {
         if (!this.field10995) {
            this.method5412(true);
         }

         ++field11053;
         return this.field10965;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[38] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "ia",
      descriptor = "(SS)V",
      line = 2771
   )
   public final void method157(short arg0, short arg1) {
      boolean var3 = client.field4360;

      try {
         ++field10957;
         int var4 = 0;
         if (var3) {
            if (this.field11031[var4] == arg0) {
               this.field11031[var4] = arg1;
               ++var4;
            } else {
               ++var4;
            }
         }

         while(true) {
            while(~this.field10996 < ~var4) {
               if (this.field11031[var4] == arg0) {
                  this.field11031[var4] = arg1;
                  ++var4;
               } else {
                  ++var4;
               }
            }

            if (!var3) {
               if (this.field10994 != null) {
                  int var5 = 0;
                  if (var3 || ~this.field11042 < ~var5) {
                     do {
                        class116 var6 = this.field10994[var5];
                        class319 var7 = this.field10984[var5];
                        var7.field4362 = class546.field7829[65535 & this.field11031[var6.field1447]] & 16777215 | var7.field4362 & -16777216;
                        ++var5;
                     } while(~this.field11042 < ~var5);
                  }
               }

               if (this.field11043 != null) {
                  this.field11043.field72 = null;
                  return;
               }

               return;
            }

            this.field11031[var4] = arg1;
            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field11074[52] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "()V",
      line = 2815
   )
   public final void method212() {
      try {
         ++field10981;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lew;Lsb;II)V",
      line = 2822
   )
   public final void method182(class521 arg0, class307 arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field10952;
         if (~this.field10962 != -1) {
            class507 var6 = this.field10973.field8379;
            if (!this.field10995) {
               this.method5412(true);
            }

            class507 var7;
            float var10;
            float var11;
            label93: {
               var7 = (class507)arg0;
               class36.field518 = var6.field7401 * var7.field7386 + var6.field7386 * var7.field7400 + var6.field7383 * var7.field7395;
               class728.field10672 = var6.field7401 * var7.field7392 + var6.field7386 * var7.field7402 + var6.field7383 * var7.field7393 + var6.field7392;
               float var8 = (float)this.field10974 * class36.field518 + class728.field10672;
               float var9 = (float)this.field10965 * class36.field518 + class728.field10672;
               if (var9 < var8) {
                  var10 = (float)(-this.field11019) + var9;
                  var11 = (float)this.field11019 + var8;
                  if (!var5) {
                     break label93;
                  }
               }

               var10 = (float)(-this.field11019) + var8;
               var11 = (float)this.field11019 + var9;
            }

            if (!(this.field10973.field8391 <= var10)) {
               if (!((float)this.field10973.field8431 >= var11)) {
                  float var14;
                  float var15;
                  label85: {
                     class111.field1402 = var6.field7391 * var7.field7392 + var6.field7399 * var7.field7393 + var6.field7395 * var7.field7402 + var6.field7393;
                     class308.field4215 = var6.field7391 * var7.field7386 + var6.field7399 * var7.field7395 + var6.field7395 * var7.field7400;
                     float var12 = (float)this.field10974 * class308.field4215 + class111.field1402;
                     float var13 = (float)this.field10965 * class308.field4215 + class111.field1402;
                     if (var13 < var12) {
                        var14 = ((float)this.field11019 + var12) * (float)this.field10973.field8473;
                        var15 = ((float)(-this.field11019) + var13) * (float)this.field10973.field8473;
                        if (!var5) {
                           break label85;
                        }
                     }

                     var15 = (var12 - (float)this.field11019) * (float)this.field10973.field8473;
                     var14 = ((float)this.field11019 + var13) * (float)this.field10973.field8473;
                  }

                  if (!(var15 / (float)arg2 >= this.field10973.field8477)) {
                     if (!(var14 / (float)arg2 <= this.field10973.field8407)) {
                        float var18;
                        float var19;
                        label77: {
                           class169.field2361 = var6.field7366 * var7.field7392 + var6.field7400 * var7.field7402 + var6.field7365 * var7.field7393 + var6.field7402;
                           class57.field707 = var6.field7366 * var7.field7386 + var6.field7400 * var7.field7400 + var6.field7365 * var7.field7395;
                           float var16 = (float)this.field10974 * class57.field707 + class169.field2361;
                           float var17 = (float)this.field10965 * class57.field707 + class169.field2361;
                           if (var16 > var17) {
                              var18 = ((float)(-this.field11019) + var17) * (float)this.field10973.field8496;
                              var19 = ((float)this.field11019 + var16) * (float)this.field10973.field8496;
                              if (!var5) {
                                 break label77;
                              }
                           }

                           var19 = ((float)this.field11019 + var17) * (float)this.field10973.field8496;
                           var18 = (var16 - (float)this.field11019) * (float)this.field10973.field8496;
                        }

                        if (!(this.field10973.field8443 <= var18 / (float)arg2)) {
                           if (!(var19 / (float)arg2 <= this.field10973.field8446)) {
                              if (arg1 != null || this.field10994 != null) {
                                 class472.field6812 = var6.field7391 * var7.field7401 + var6.field7399 * var7.field7391 + var6.field7395 * var7.field7366;
                                 class338.field4602 = var6.field7401 * var7.field7383 + var6.field7386 * var7.field7365 + var6.field7383 * var7.field7399;
                                 class756.field11208 = var6.field7401 * var7.field7401 + var6.field7386 * var7.field7366 + var6.field7383 * var7.field7391;
                                 class141.field1803 = var6.field7391 * var7.field7383 + var6.field7399 * var7.field7399 + var6.field7395 * var7.field7365;
                                 class712.field10386 = var6.field7366 * var7.field7401 + var6.field7400 * var7.field7366 + var6.field7365 * var7.field7391;
                                 class562.field8025 = var6.field7366 * var7.field7383 + var6.field7400 * var7.field7365 + var6.field7365 * var7.field7399;
                              }

                              if (arg1 != null) {
                                 int var20 = this.field11000 + this.field10975 >> 1;
                                 int var21 = this.field11029 + this.field11020 >> 1;
                                 int var22 = (int)((float)var21 * class472.field6812 + (float)this.field10974 * class308.field4215 + (float)var20 * class141.field1803 + class111.field1402);
                                 int var23 = (int)((float)var21 * class712.field10386 + (float)this.field10974 * class57.field707 + (float)var20 * class562.field8025 + class169.field2361);
                                 int var24 = (int)((float)var21 * class756.field11208 + (float)this.field10974 * class36.field518 + (float)var20 * class338.field4602 + class728.field10672);
                                 int var25 = (int)((float)var21 * class472.field6812 + (float)this.field10965 * class308.field4215 + (float)var20 * class141.field1803 + class111.field1402);
                                 int var26 = (int)((float)var21 * class712.field10386 + (float)this.field10965 * class57.field707 + (float)var20 * class562.field8025 + class169.field2361);
                                 arg1.field4194 = this.field10973.field8403 - -(this.field10973.field8473 * var22 / arg2);
                                 arg1.field4192 = this.field10973.field8493 - -(this.field10973.field8496 * var26 / arg2);
                                 arg1.field4193 = this.field10973.field8496 * var23 / arg2 + this.field10973.field8493;
                                 arg1.field4196 = this.field10973.field8473 * var25 / arg2 + this.field10973.field8403;
                                 int var27 = (int)((float)var21 * class756.field11208 + (float)this.field10965 * class36.field518 + (float)var20 * class338.field4602 + class728.field10672);
                                 if (this.field10973.field8431 <= var24 || this.field10973.field8431 <= var27) {
                                    arg1.field4191 = true;
                                    arg1.field4195 = -arg1.field4194 + this.field10973.field8403 - -((this.field11019 + var22) * this.field10973.field8473 / arg2);
                                 }
                              }

                              this.field10973.method4138(11544, (float)arg2);
                              this.field10973.method4137((byte)-120);
                              this.field10973.method4158((byte)67, var7);
                              this.method5419(0);
                              this.field10973.method4163((byte)82);
                              this.method5422((byte)38);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class237.method1823(var29, field11074[41] + (arg0 != null ? field11074[0] : field11074[1]) + ',' + (arg1 != null ? field11074[0] : field11074[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "r",
      descriptor = "()Z",
      line = 2969
   )
   public final boolean method215() {
      try {
         ++field11014;
         return this.field11002;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[63] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "v",
      descriptor = "()V",
      line = 2978
   )
   public final void method151() {
      boolean var1 = client.field4360;

      try {
         ++field11018;
         int var2 = 0;
         if (var1) {
            this.field10987[var2] = -this.field10987[var2];
            ++var2;
         }

         while(true) {
            while(~this.field10997 < ~var2) {
               this.field10987[var2] = -this.field10987[var2];
               ++var2;
            }

            int var3 = 0;
            if (!var1) {
               if (var1) {
                  this.field11067[var3] = (short)(-this.field11067[var3]);
                  ++var3;
               }

               while(true) {
                  while(var3 < this.field10962) {
                     this.field11067[var3] = (short)(-this.field11067[var3]);
                     ++var3;
                  }

                  int var4 = 0;
                  if (!var1) {
                     short var5;
                     if (var1) {
                        var5 = this.field11048[var4];
                        this.field11048[var4] = this.field10949[var4];
                        this.field10949[var4] = var5;
                        ++var4;
                     }

                     while(true) {
                        class747 var10000;
                        if (~var4 <= ~this.field10996) {
                           var10000 = this;
                           if (!var1) {
                              if (this.field10958 == null && this.field11043 != null) {
                                 this.field11043.field72 = null;
                              }

                              if (this.field10958 != null) {
                                 this.field10958.field72 = null;
                              }

                              this.field10995 = false;
                              if (this.field11063 != null) {
                                 this.field11063.field5594 = null;
                              }

                              if (this.field11011 != null) {
                                 this.field11011.field72 = null;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = this;
                        }

                        var5 = var10000.field11048[var4];
                        this.field11048[var4] = this.field10949[var4];
                        this.field10949[var4] = var5;
                        ++var4;
                     }
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11074[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "()V",
      line = 3037
   )
   public final void method168() {
      try {
         ++field11022;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[28] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "na",
      descriptor = "()I",
      line = 3046
   )
   public final int method174() {
      try {
         ++field10977;
         if (!this.field10995) {
            this.method5412(true);
         }

         return this.field11019;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IIIII)V",
      line = 3061
   )
   public static final void method5418(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field11007;
         class755 var5 = class317.method2325((long)arg0, 119, arg1);
         var5.method5479(arg1 ^ 1292);
         var5.field11181 = arg3;
         var5.field11187 = arg4;
         var5.field11184 = arg2;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11074[48] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "c",
      descriptor = "(I)V",
      line = 3075
   )
   private final void method5419(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field10967;
         if (this.field11010 != 0) {
            if (this.field11027 != arg0) {
               this.method5421(true, false);
            }

            this.method5421(false, false);
            if (this.field11063 != null) {
               if (this.field11063.field5594 == null) {
                  this.method5416(~(this.field11027 & 16) != -1, (byte)-92);
               }

               if (this.field11063.field5594 != null) {
                  this.field10973.method4124(120, this.field10958 != null);
                  this.field10973.method4144(this.field11001, (byte)71, this.field11043, this.field11011, this.field10958);
                  int var3 = this.field11006.length + -1;
                  int var4 = 0;
                  if (var2 || ~var4 > ~var3) {
                     do {
                        int var5 = this.field11006[var4];
                        int var6 = this.field11006[var4 - -1];
                        int var7 = 65535 & this.field10979[var5];
                        if (~var7 == -65536) {
                           var7 = -1;
                        }

                        this.field10973.method4126(this.field10958 != null, var7, arg0 ^ 122);
                        this.field10973.method4136(4, this.field11063.field5594, var5 * 3, (-var5 + var6) * 3, 80);
                        ++var4;
                     } while(~var4 > ~var3);
                  }
               }
            }

            this.method5413((byte)-123);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field11074[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(SBIIB)I",
      line = 3139
   )
   private final int method5420(short arg0, byte arg1, int arg2, int arg3, byte arg4) {
      boolean var6 = client.field4360;

      try {
         ++field11030;
         int var7 = class546.field7829[class628.method4554((byte)99, arg3, arg2)];
         if (arg0 != -1) {
            class317 var8 = this.field10973.field802.method1354(arg0 & 65535, (byte)-109);
            int var9 = var8.field4321 & 255;
            if (var9 != 0) {
               label62: {
                  int var10;
                  label51: {
                     if (~arg2 <= -1) {
                        if (arg2 <= 127) {
                           var10 = arg2 * 131586;
                           if (!var6) {
                              break label51;
                           }
                        }

                        var10 = 16777215;
                        if (!var6) {
                           break label51;
                        }
                     }

                     var10 = 0;
                  }

                  if (~var9 == -257) {
                     var7 = var10;
                     if (!var6) {
                        break label62;
                     }
                  }

                  int var12 = 256 - var9;
                  var7 = (16711680 & (65280 & var10) * var9 - -((65280 & var7) * var12)) + (-16711936 & (16711935 & var10) * var9 - -((16711935 & var7) * var12)) >> 8;
               }
            }

            int var13 = var8.field4324 & 255;
            if (~var13 != -1) {
               var13 += 256;
               int var14 = (var7 >> 16 & 255) * var13;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = ((var7 & 65280) >> 8) * var13;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               int var16 = (255 & var7) * var13;
               if (~var16 < -65536) {
                  var16 = 65535;
               }

               var7 = (65280 & var15) + (var16 >> 8) + (var14 << 8 & 16711755);
            }
         }

         return arg4 < 45 ? 17 : (var7 << 8) + -(255 & arg1) + 255;
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field11074[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "I",
      descriptor = "(I[IIIIZI[I)V",
      line = 3213
   )
   public final void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      boolean var9 = client.field4360;

      try {
         ++field11046;
         int var10 = arg1.length;
         int var10000;
         if (~arg0 != -1) {
            if (~arg0 == -2) {
               if (arg7 != null) {
                  int var17 = arg7[1] * arg3 + 8192 + arg7[0] * arg2 + arg7[2] * arg4 >> 14;
                  int var18 = arg7[5] * arg4 + (arg7[3] * arg2 - -(arg7[4] * arg3)) + 8192 >> 14;
                  int var19 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                  arg4 = var19;
                  arg2 = var17;
                  arg3 = var18;
               }

               arg4 <<= 4;
               arg3 <<= 4;
               arg2 <<= 4;
               int var20 = 0;
               if (var9 || ~var10 < ~var20) {
                  do {
                     int var21 = arg1[var20];
                     if (~this.field11005.length >= ~var21) {
                        ++var20;
                     } else {
                        int[] var22 = this.field11005[var21];
                        int var23 = 0;
                        if (!var9 && var22.length <= var23) {
                           ++var20;
                        } else {
                           do {
                              int var24 = var22[var23];
                              if (this.field10966 != null && ~(this.field10966[var24] & arg6) == -1) {
                                 ++var23;
                              } else {
                                 this.field10951[var24] += arg2;
                                 this.field11021[var24] += arg3;
                                 this.field10987[var24] += arg4;
                                 ++var23;
                              }
                           } while(var22.length > var23);

                           ++var20;
                        }
                     }
                  } while(~var10 < ~var20);

               }
            } else if (arg0 == 2) {
               if (arg7 != null) {
                  int var25 = arg7[9] << 4;
                  int var26 = arg7[10] << 4;
                  int var27 = arg7[11] << 4;
                  int var28 = arg7[12] << 4;
                  int var29 = arg7[13] << 4;
                  int var30 = arg7[14] << 4;
                  if (class225.field3203) {
                     int var31 = arg7[0] * class405.field5857 - -8192 + arg7[6] * class218.field3119 + arg7[3] * class653.field9565 >> 14;
                     int var32 = arg7[4] * class653.field9565 + arg7[1] * class405.field5857 + 8192 - -(arg7[7] * class218.field3119) >> 14;
                     int var33 = var29 + var32;
                     int var34 = arg7[8] * class218.field3119 + arg7[2] * class405.field5857 + 8192 - -(arg7[5] * class653.field9565) >> 14;
                     int var35 = var28 + var31;
                     class405.field5857 = var35;
                     int var36 = var30 + var34;
                     class653.field9565 = var33;
                     class218.field3119 = var36;
                     class225.field3203 = false;
                  }

                  int[] var37 = new int[9];
                  int var38 = class363.field4987[arg2];
                  int var39 = class363.field4956[arg2];
                  int var40 = class363.field4987[arg3];
                  int var41 = class363.field4956[arg3];
                  int var42 = class363.field4987[arg4];
                  int var43 = class363.field4956[arg4];
                  int var44 = var39 * var42 + 8192 >> 14;
                  int var45 = var39 * var43 + 8192 >> 14;
                  var37[3] = var38 * var43 - -8192 >> 14;
                  var37[7] = var40 * var44 + (var41 * var43 - -8192) >> 14;
                  var37[2] = var38 * var41 + 8192 >> 14;
                  var37[5] = -var39;
                  var37[0] = var40 * var42 + var41 * var45 + 8192 >> 14;
                  var37[1] = -var40 * var43 - -(var41 * var44) + 8192 >> 14;
                  var37[8] = var38 * var40 + 8192 >> 14;
                  var37[6] = -var41 * var42 + 8192 - -(var40 * var45) >> 14;
                  var37[4] = var38 * var42 + 8192 >> 14;
                  int var46 = var37[0] * -class405.field5857 - -(var37[1] * -class653.field9565) + var37[2] * -class218.field3119 + 8192 >> 14;
                  int var47 = var37[5] * -class218.field3119 + (var37[4] * -class653.field9565 + var37[3] * -class405.field5857 - -8192) >> 14;
                  int var48 = var37[6] * -class405.field5857 - (-(var37[7] * -class653.field9565) - (var37[8] * -class218.field3119 + 8192)) >> 14;
                  int var49 = var46 - -class405.field5857;
                  int var50 = class653.field9565 + var47;
                  int var51 = class218.field3119 + var48;
                  int[] var52 = new int[9];
                  int var53 = 0;
                  int var54;
                  int var57;
                  int var58;
                  int var59;
                  int var60;
                  int var61;
                  int[] var62;
                  int var63;
                  int var64;
                  int var65;
                  int var66;
                  int var67;
                  int var68;
                  int var69;
                  int var70;
                  int var71;
                  int var72;
                  int var73;
                  int[] var74;
                  int var75;
                  int var76;
                  int var77;
                  int var78;
                  int var79;
                  int var80;
                  int var81;
                  int var82;
                  if (var9) {
                     var54 = 0;
                  } else if (~var53 <= -4) {
                     var57 = var37[2] * var30 - -8192 + var37[0] * var28 + var37[1] * var29 >> 14;
                     var58 = var37[3] * var28 + (var37[4] * var29 - -(var37[5] * var30)) + 8192 >> 14;
                     var54 = var49 + var57;
                     var59 = var50 + var58;
                     var60 = var37[6] * var28 - (-(var37[7] * var29) + -(var37[8] * var30) - 8192) >> 14;
                     var61 = var51 + var60;
                     var62 = new int[9];
                     var63 = 0;
                     if (!var9) {
                        label478: {
                           if (var9) {
                              var64 = 0;
                           } else if (~var63 <= -4) {
                              var67 = arg7[2] * var61 + arg7[1] * var59 + arg7[0] * var54 + 8192 >> 14;
                              var68 = arg7[5] * var61 + 8192 + arg7[4] * var59 + arg7[3] * var54 >> 14;
                              var69 = var26 + var68;
                              var70 = arg7[7] * var59 + arg7[6] * var54 + (arg7[8] * var61 - -8192) >> 14;
                              var64 = var25 + var67;
                              var71 = var27 + var70;
                              var72 = 0;
                              if (!var9) {
                                 break label478;
                              }
                           } else {
                              var64 = 0;
                           }

                           while(true) {
                              label495: {
                                 if (var9) {
                                    var65 = 0;
                                    var66 = 0;
                                    if (var9) {
                                       var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                       ++var66;
                                    }
                                 } else {
                                    if (~var64 <= -4) {
                                       break label495;
                                    }

                                    var65 = 0;
                                    var66 = 0;
                                    if (var9) {
                                       var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                       ++var66;
                                    }
                                 }

                                 while(true) {
                                    while(var66 < 3) {
                                       var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                       ++var66;
                                    }

                                    var62[var63 * 3 - -var64] = var65 + 8192 >> 14;
                                    if (!var9) {
                                       ++var64;
                                       if (~var64 <= -4) {
                                          break;
                                       }

                                       var65 = 0;
                                       var66 = 0;
                                       if (var9) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }
                                    } else {
                                       ++var66;
                                    }
                                 }
                              }

                              ++var63;
                              if (~var63 <= -4) {
                                 var67 = arg7[2] * var61 + arg7[1] * var59 + arg7[0] * var54 + 8192 >> 14;
                                 var68 = arg7[5] * var61 + 8192 + arg7[4] * var59 + arg7[3] * var54 >> 14;
                                 var69 = var26 + var68;
                                 var70 = arg7[7] * var59 + arg7[6] * var54 + (arg7[8] * var61 - -8192) >> 14;
                                 var64 = var25 + var67;
                                 var71 = var27 + var70;
                                 var72 = 0;
                                 if (!var9) {
                                    break;
                                 }
                              } else {
                                 var64 = 0;
                              }
                           }
                        }

                        if (!var9 && var72 >= var10) {
                           return;
                        }

                        do {
                           var73 = arg1[var72];
                           if (~var73 <= ~this.field11005.length) {
                              ++var72;
                           } else {
                              var74 = this.field11005[var73];
                              var75 = 0;
                              if (!var9 && ~var74.length >= ~var75) {
                                 ++var72;
                              } else {
                                 do {
                                    var76 = var74[var75];
                                    if (this.field10966 != null && ~(this.field10966[var76] & arg6) == -1) {
                                       ++var75;
                                    } else {
                                       var77 = this.field10951[var76] * var62[0] + this.field11021[var76] * var62[1] + this.field10987[var76] * var62[2] + 8192 >> 14;
                                       var78 = this.field11021[var76] * var62[4] - -(this.field10987[var76] * var62[5]) + this.field10951[var76] * var62[3] + 8192 >> 14;
                                       var79 = this.field10987[var76] * var62[8] + this.field11021[var76] * var62[7] + this.field10951[var76] * var62[6] + 8192 >> 14;
                                       var80 = var64 + var77;
                                       var81 = var69 + var78;
                                       this.field10951[var76] = var80;
                                       var82 = var71 + var79;
                                       this.field11021[var76] = var81;
                                       this.field10987[var76] = var82;
                                       ++var75;
                                    }
                                 } while(~var74.length < ~var75);

                                 ++var72;
                              }
                           }
                        } while(var72 < var10);

                        return;
                     }
                  } else {
                     var54 = 0;
                  }

                  while(true) {
                     label639: {
                        int var55;
                        int var56;
                        if (var9) {
                           var55 = 0;
                           var56 = 0;
                           if (var9) {
                              var55 += var37[var53 * 3 + var56] * arg7[var54 * 3 + var56];
                              ++var56;
                           }
                        } else {
                           if (var54 >= 3) {
                              break label639;
                           }

                           var55 = 0;
                           var56 = 0;
                           if (var9) {
                              var55 += var37[var53 * 3 + var56] * arg7[var54 * 3 + var56];
                              ++var56;
                           }
                        }

                        while(true) {
                           while(~var56 > -4) {
                              var55 += var37[var53 * 3 + var56] * arg7[var54 * 3 + var56];
                              ++var56;
                           }

                           var52[var53 * 3 + var54] = var55 + 8192 >> 14;
                           if (!var9) {
                              ++var54;
                              if (var54 >= 3) {
                                 break;
                              }

                              var55 = 0;
                              var56 = 0;
                              if (var9) {
                                 var55 += var37[var53 * 3 + var56] * arg7[var54 * 3 + var56];
                                 ++var56;
                              }
                           } else {
                              ++var56;
                           }
                        }
                     }

                     ++var53;
                     if (~var53 <= -4) {
                        var57 = var37[2] * var30 - -8192 + var37[0] * var28 + var37[1] * var29 >> 14;
                        var58 = var37[3] * var28 + (var37[4] * var29 - -(var37[5] * var30)) + 8192 >> 14;
                        var54 = var49 + var57;
                        var59 = var50 + var58;
                        var60 = var37[6] * var28 - (-(var37[7] * var29) + -(var37[8] * var30) - 8192) >> 14;
                        var61 = var51 + var60;
                        var62 = new int[9];
                        var63 = 0;
                        if (!var9) {
                           label410: {
                              if (var9) {
                                 var64 = 0;
                              } else if (~var63 <= -4) {
                                 var67 = arg7[2] * var61 + arg7[1] * var59 + arg7[0] * var54 + 8192 >> 14;
                                 var68 = arg7[5] * var61 + 8192 + arg7[4] * var59 + arg7[3] * var54 >> 14;
                                 var69 = var26 + var68;
                                 var70 = arg7[7] * var59 + arg7[6] * var54 + (arg7[8] * var61 - -8192) >> 14;
                                 var64 = var25 + var67;
                                 var71 = var27 + var70;
                                 var72 = 0;
                                 if (!var9) {
                                    break label410;
                                 }
                              } else {
                                 var64 = 0;
                              }

                              while(true) {
                                 label407: {
                                    if (var9) {
                                       var65 = 0;
                                       var66 = 0;
                                       if (var9) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }
                                    } else {
                                       if (~var64 <= -4) {
                                          break label407;
                                       }

                                       var65 = 0;
                                       var66 = 0;
                                       if (var9) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }
                                    }

                                    while(true) {
                                       while(var66 < 3) {
                                          var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                          ++var66;
                                       }

                                       var62[var63 * 3 - -var64] = var65 + 8192 >> 14;
                                       if (!var9) {
                                          ++var64;
                                          if (~var64 <= -4) {
                                             break;
                                          }

                                          var65 = 0;
                                          var66 = 0;
                                          if (var9) {
                                             var65 += arg7[var63 * 3 + var66] * var52[var66 * 3 + var64];
                                             ++var66;
                                          }
                                       } else {
                                          ++var66;
                                       }
                                    }
                                 }

                                 ++var63;
                                 if (~var63 <= -4) {
                                    var67 = arg7[2] * var61 + arg7[1] * var59 + arg7[0] * var54 + 8192 >> 14;
                                    var68 = arg7[5] * var61 + 8192 + arg7[4] * var59 + arg7[3] * var54 >> 14;
                                    var69 = var26 + var68;
                                    var70 = arg7[7] * var59 + arg7[6] * var54 + (arg7[8] * var61 - -8192) >> 14;
                                    var64 = var25 + var67;
                                    var71 = var27 + var70;
                                    var72 = 0;
                                    if (!var9) {
                                       break;
                                    }
                                 } else {
                                    var64 = 0;
                                 }
                              }
                           }

                           if (!var9 && var72 >= var10) {
                              return;
                           }

                           do {
                              var73 = arg1[var72];
                              if (~var73 <= ~this.field11005.length) {
                                 ++var72;
                              } else {
                                 var74 = this.field11005[var73];
                                 var75 = 0;
                                 if (!var9 && ~var74.length >= ~var75) {
                                    ++var72;
                                 } else {
                                    do {
                                       var76 = var74[var75];
                                       if (this.field10966 != null && ~(this.field10966[var76] & arg6) == -1) {
                                          ++var75;
                                       } else {
                                          var77 = this.field10951[var76] * var62[0] + this.field11021[var76] * var62[1] + this.field10987[var76] * var62[2] + 8192 >> 14;
                                          var78 = this.field11021[var76] * var62[4] - -(this.field10987[var76] * var62[5]) + this.field10951[var76] * var62[3] + 8192 >> 14;
                                          var79 = this.field10987[var76] * var62[8] + this.field11021[var76] * var62[7] + this.field10951[var76] * var62[6] + 8192 >> 14;
                                          var80 = var64 + var77;
                                          var81 = var69 + var78;
                                          this.field10951[var76] = var80;
                                          var82 = var71 + var79;
                                          this.field11021[var76] = var81;
                                          this.field10987[var76] = var82;
                                          ++var75;
                                       }
                                    } while(~var74.length < ~var75);

                                    ++var72;
                                 }
                              }
                           } while(var72 < var10);

                           return;
                        }
                     } else {
                        var54 = 0;
                     }
                  }
               } else {
                  int var83 = 0;
                  int var97;
                  int var98;
                  int[] var99;
                  int var100;
                  int var101;
                  int var102;
                  int var103;
                  int var104;
                  int var105;
                  int var106;
                  int var107;
                  int var108;
                  int var109;
                  int var110;
                  int var111;
                  int var112;
                  int var113;
                  int var114;
                  if (var9) {
                     var10000 = arg1[var83];
                  } else if (var83 >= var10) {
                     var10000 = arg5;
                     if (!var9) {
                        if (arg5 != 0) {
                           var97 = 0;
                           if (var9 || var10 > var97) {
                              do {
                                 var98 = arg1[var97];
                                 if (var98 >= this.field11005.length) {
                                    ++var97;
                                 } else {
                                    var99 = this.field11005[var98];
                                    var100 = 0;
                                    if (!var9 && var99.length <= var100) {
                                       ++var97;
                                    } else {
                                       label819:
                                       do {
                                          var101 = var99[var100];
                                          if (this.field10966 != null && (arg6 & this.field10966[var101]) == 0) {
                                             ++var100;
                                          } else {
                                             var102 = this.field10986[var101];
                                             var103 = this.field10986[var101 + 1];
                                             var104 = var102;
                                             if (!var9 && ~var103 >= ~var102) {
                                                ++var100;
                                             } else {
                                                do {
                                                   var105 = this.field10954[var104] - 1;
                                                   if (~var105 == 0) {
                                                      ++var100;
                                                      continue label819;
                                                   }

                                                   if (~arg4 != -1) {
                                                      var106 = class363.field4956[arg4];
                                                      var107 = class363.field4987[arg4];
                                                      var108 = this.field11012[var105] * var106 - -(this.field11004[var105] * var107) - -16383 >> 14;
                                                      this.field11012[var105] = (short)(this.field11012[var105] * var107 - -16383 + -(this.field11004[var105] * var106) >> 14);
                                                      this.field11004[var105] = (short)var108;
                                                   }

                                                   if (~arg2 != -1) {
                                                      var109 = class363.field4956[arg2];
                                                      var110 = class363.field4987[arg2];
                                                      var111 = this.field11012[var105] * var110 - -16383 + -(this.field11067[var105] * var109) >> 14;
                                                      this.field11067[var105] = (short)(this.field11012[var105] * var109 + (this.field11067[var105] * var110 - -16383) >> 14);
                                                      this.field11012[var105] = (short)var111;
                                                   }

                                                   if (~arg3 != -1) {
                                                      var112 = class363.field4956[arg3];
                                                      var113 = class363.field4987[arg3];
                                                      var114 = this.field11067[var105] * var112 + (this.field11004[var105] * var113 - -16383) >> 14;
                                                      this.field11067[var105] = (short)(this.field11067[var105] * var113 + 16383 + -(this.field11004[var105] * var112) >> 14);
                                                      this.field11004[var105] = (short)var114;
                                                   }

                                                   ++var104;
                                                } while(~var103 < ~var104);

                                                ++var100;
                                             }
                                          }
                                       } while(var99.length > var100);

                                       ++var97;
                                    }
                                 }
                              } while(var10 > var97);
                           }

                           if (this.field10958 == null && this.field11043 != null) {
                              this.field11043.field72 = null;
                           }

                           if (this.field10958 != null) {
                              this.field10958.field72 = null;
                           }
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var83];
                  }

                  while(true) {
                     int var84 = var10000;
                     if (this.field11005.length <= var84) {
                        ++var83;
                     } else {
                        int[] var85 = this.field11005[var84];
                        int var86 = 0;
                        int var87;
                        int var88;
                        int var89;
                        int var90;
                        int var91;
                        int var92;
                        int var93;
                        int var94;
                        int var95;
                        int var96;
                        if (var9) {
                           var87 = var85[var86];
                           if (this.field10966 != null) {
                              if (~(this.field10966[var87] & arg6) != -1) {
                                 this.field10951[var87] -= class405.field5857;
                                 this.field11021[var87] -= class653.field9565;
                                 this.field10987[var87] -= class218.field3119;
                                 if (~arg4 != -1) {
                                    var88 = class363.field4956[arg4];
                                    var89 = class363.field4987[arg4];
                                    var90 = this.field11021[var87] * var88 + this.field10951[var87] * var89 + 16383 >> 14;
                                    this.field11021[var87] = this.field11021[var87] * var89 + -(this.field10951[var87] * var88) + 16383 >> 14;
                                    this.field10951[var87] = var90;
                                 }

                                 if (arg2 != 0) {
                                    var91 = class363.field4956[arg2];
                                    var92 = class363.field4987[arg2];
                                    var93 = this.field11021[var87] * var92 + (-(this.field10987[var87] * var91) - -16383) >> 14;
                                    this.field10987[var87] = this.field11021[var87] * var91 - -(this.field10987[var87] * var92) + 16383 >> 14;
                                    this.field11021[var87] = var93;
                                 }

                                 if (arg3 != 0) {
                                    var94 = class363.field4956[arg3];
                                    var95 = class363.field4987[arg3];
                                    var96 = this.field10987[var87] * var94 + this.field10951[var87] * var95 + 16383 >> 14;
                                    this.field10987[var87] = this.field10987[var87] * var95 - this.field10951[var87] * var94 + 16383 >> 14;
                                    this.field10951[var87] = var96;
                                 }

                                 this.field10951[var87] += class405.field5857;
                                 this.field11021[var87] += class653.field9565;
                                 this.field10987[var87] += class218.field3119;
                                 ++var86;
                              } else {
                                 ++var86;
                              }
                           } else {
                              this.field10951[var87] -= class405.field5857;
                              this.field11021[var87] -= class653.field9565;
                              this.field10987[var87] -= class218.field3119;
                              if (~arg4 != -1) {
                                 var88 = class363.field4956[arg4];
                                 var89 = class363.field4987[arg4];
                                 var90 = this.field11021[var87] * var88 + this.field10951[var87] * var89 + 16383 >> 14;
                                 this.field11021[var87] = this.field11021[var87] * var89 + -(this.field10951[var87] * var88) + 16383 >> 14;
                                 this.field10951[var87] = var90;
                              }

                              if (arg2 != 0) {
                                 var91 = class363.field4956[arg2];
                                 var92 = class363.field4987[arg2];
                                 var93 = this.field11021[var87] * var92 + (-(this.field10987[var87] * var91) - -16383) >> 14;
                                 this.field10987[var87] = this.field11021[var87] * var91 - -(this.field10987[var87] * var92) + 16383 >> 14;
                                 this.field11021[var87] = var93;
                              }

                              if (arg3 != 0) {
                                 var94 = class363.field4956[arg3];
                                 var95 = class363.field4987[arg3];
                                 var96 = this.field10987[var87] * var94 + this.field10951[var87] * var95 + 16383 >> 14;
                                 this.field10987[var87] = this.field10987[var87] * var95 - this.field10951[var87] * var94 + 16383 >> 14;
                                 this.field10951[var87] = var96;
                              }

                              this.field10951[var87] += class405.field5857;
                              this.field11021[var87] += class653.field9565;
                              this.field10987[var87] += class218.field3119;
                              ++var86;
                           }
                        }

                        while(var86 < var85.length) {
                           var87 = var85[var86];
                           if (this.field10966 != null) {
                              if (~(this.field10966[var87] & arg6) != -1) {
                                 this.field10951[var87] -= class405.field5857;
                                 this.field11021[var87] -= class653.field9565;
                                 this.field10987[var87] -= class218.field3119;
                                 if (~arg4 != -1) {
                                    var88 = class363.field4956[arg4];
                                    var89 = class363.field4987[arg4];
                                    var90 = this.field11021[var87] * var88 + this.field10951[var87] * var89 + 16383 >> 14;
                                    this.field11021[var87] = this.field11021[var87] * var89 + -(this.field10951[var87] * var88) + 16383 >> 14;
                                    this.field10951[var87] = var90;
                                 }

                                 if (arg2 != 0) {
                                    var91 = class363.field4956[arg2];
                                    var92 = class363.field4987[arg2];
                                    var93 = this.field11021[var87] * var92 + (-(this.field10987[var87] * var91) - -16383) >> 14;
                                    this.field10987[var87] = this.field11021[var87] * var91 - -(this.field10987[var87] * var92) + 16383 >> 14;
                                    this.field11021[var87] = var93;
                                 }

                                 if (arg3 != 0) {
                                    var94 = class363.field4956[arg3];
                                    var95 = class363.field4987[arg3];
                                    var96 = this.field10987[var87] * var94 + this.field10951[var87] * var95 + 16383 >> 14;
                                    this.field10987[var87] = this.field10987[var87] * var95 - this.field10951[var87] * var94 + 16383 >> 14;
                                    this.field10951[var87] = var96;
                                 }

                                 this.field10951[var87] += class405.field5857;
                                 this.field11021[var87] += class653.field9565;
                                 this.field10987[var87] += class218.field3119;
                                 ++var86;
                              } else {
                                 ++var86;
                              }
                           } else {
                              this.field10951[var87] -= class405.field5857;
                              this.field11021[var87] -= class653.field9565;
                              this.field10987[var87] -= class218.field3119;
                              if (~arg4 != -1) {
                                 var88 = class363.field4956[arg4];
                                 var89 = class363.field4987[arg4];
                                 var90 = this.field11021[var87] * var88 + this.field10951[var87] * var89 + 16383 >> 14;
                                 this.field11021[var87] = this.field11021[var87] * var89 + -(this.field10951[var87] * var88) + 16383 >> 14;
                                 this.field10951[var87] = var90;
                              }

                              if (arg2 != 0) {
                                 var91 = class363.field4956[arg2];
                                 var92 = class363.field4987[arg2];
                                 var93 = this.field11021[var87] * var92 + (-(this.field10987[var87] * var91) - -16383) >> 14;
                                 this.field10987[var87] = this.field11021[var87] * var91 - -(this.field10987[var87] * var92) + 16383 >> 14;
                                 this.field11021[var87] = var93;
                              }

                              if (arg3 != 0) {
                                 var94 = class363.field4956[arg3];
                                 var95 = class363.field4987[arg3];
                                 var96 = this.field10987[var87] * var94 + this.field10951[var87] * var95 + 16383 >> 14;
                                 this.field10987[var87] = this.field10987[var87] * var95 - this.field10951[var87] * var94 + 16383 >> 14;
                                 this.field10951[var87] = var96;
                              }

                              this.field10951[var87] += class405.field5857;
                              this.field11021[var87] += class653.field9565;
                              this.field10987[var87] += class218.field3119;
                              ++var86;
                           }
                        }

                        ++var83;
                     }

                     if (var83 >= var10) {
                        var10000 = arg5;
                        if (!var9) {
                           if (arg5 != 0) {
                              var97 = 0;
                              if (var9 || var10 > var97) {
                                 do {
                                    var98 = arg1[var97];
                                    if (var98 >= this.field11005.length) {
                                       ++var97;
                                    } else {
                                       var99 = this.field11005[var98];
                                       var100 = 0;
                                       if (!var9 && var99.length <= var100) {
                                          ++var97;
                                       } else {
                                          label685:
                                          do {
                                             var101 = var99[var100];
                                             if (this.field10966 != null && (arg6 & this.field10966[var101]) == 0) {
                                                ++var100;
                                             } else {
                                                var102 = this.field10986[var101];
                                                var103 = this.field10986[var101 + 1];
                                                var104 = var102;
                                                if (!var9 && ~var103 >= ~var102) {
                                                   ++var100;
                                                } else {
                                                   do {
                                                      var105 = this.field10954[var104] - 1;
                                                      if (~var105 == 0) {
                                                         ++var100;
                                                         continue label685;
                                                      }

                                                      if (~arg4 != -1) {
                                                         var106 = class363.field4956[arg4];
                                                         var107 = class363.field4987[arg4];
                                                         var108 = this.field11012[var105] * var106 - -(this.field11004[var105] * var107) - -16383 >> 14;
                                                         this.field11012[var105] = (short)(this.field11012[var105] * var107 - -16383 + -(this.field11004[var105] * var106) >> 14);
                                                         this.field11004[var105] = (short)var108;
                                                      }

                                                      if (~arg2 != -1) {
                                                         var109 = class363.field4956[arg2];
                                                         var110 = class363.field4987[arg2];
                                                         var111 = this.field11012[var105] * var110 - -16383 + -(this.field11067[var105] * var109) >> 14;
                                                         this.field11067[var105] = (short)(this.field11012[var105] * var109 + (this.field11067[var105] * var110 - -16383) >> 14);
                                                         this.field11012[var105] = (short)var111;
                                                      }

                                                      if (~arg3 != -1) {
                                                         var112 = class363.field4956[arg3];
                                                         var113 = class363.field4987[arg3];
                                                         var114 = this.field11067[var105] * var112 + (this.field11004[var105] * var113 - -16383) >> 14;
                                                         this.field11067[var105] = (short)(this.field11067[var105] * var113 + 16383 + -(this.field11004[var105] * var112) >> 14);
                                                         this.field11004[var105] = (short)var114;
                                                      }

                                                      ++var104;
                                                   } while(~var103 < ~var104);

                                                   ++var100;
                                                }
                                             }
                                          } while(var99.length > var100);

                                          ++var97;
                                       }
                                    }
                                 } while(var10 > var97);
                              }

                              if (this.field10958 == null && this.field11043 != null) {
                                 this.field11043.field72 = null;
                              }

                              if (this.field10958 != null) {
                                 this.field10958.field72 = null;
                              }
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var83];
                     }
                  }
               }
            } else if (arg0 == 3) {
               if (arg7 != null) {
                  int var115 = arg7[9] << 4;
                  int var116 = arg7[10] << 4;
                  int var117 = arg7[11] << 4;
                  int var118 = arg7[12] << 4;
                  int var119 = arg7[13] << 4;
                  int var120 = arg7[14] << 4;
                  if (class225.field3203) {
                     int var121 = arg7[0] * class405.field5857 + arg7[6] * class218.field3119 + arg7[3] * class653.field9565 + 8192 >> 14;
                     int var122 = arg7[7] * class218.field3119 + 8192 + arg7[4] * class653.field9565 + arg7[1] * class405.field5857 >> 14;
                     int var123 = arg7[5] * class653.field9565 + (arg7[2] * class405.field5857 - (-(arg7[8] * class218.field3119) - 8192)) >> 14;
                     int var124 = var118 + var121;
                     int var125 = var119 + var122;
                     int var126 = var120 + var123;
                     class405.field5857 = var124;
                     class653.field9565 = var125;
                     class218.field3119 = var126;
                     class225.field3203 = false;
                  }

                  int[] var143;
                  int var145;
                  int var150;
                  int var152;
                  int var153;
                  label974: {
                     int var127 = arg2 << 15 >> 7;
                     int var128 = arg3 << 15 >> 7;
                     int var129 = arg4 << 15 >> 7;
                     int var130 = -class405.field5857 * var127 - -8192 >> 14;
                     int var131 = -class653.field9565 * var128 + 8192 >> 14;
                     int var132 = -class218.field3119 * var129 - -8192 >> 14;
                     int var133 = class405.field5857 + var130;
                     int var134 = var131 - -class653.field9565;
                     int var135 = class218.field3119 + var132;
                     int[] var136 = new int[]{arg7[0] * var127 - -8192 >> 14, arg7[3] * var127 - -8192 >> 14, arg7[6] * var127 + 8192 >> 14, arg7[1] * var128 + 8192 >> 14, arg7[4] * var128 + 8192 >> 14, arg7[7] * var128 + 8192 >> 14, arg7[2] * var129 - -8192 >> 14, arg7[5] * var129 - -8192 >> 14, arg7[8] * var129 + 8192 >> 14};
                     int var137 = var118 * var127 + 8192 >> 14;
                     int var138 = var119 * var128 + 8192 >> 14;
                     int var139 = var134 + var138;
                     int var140 = var133 + var137;
                     int var141 = var120 * var129 + 8192 >> 14;
                     int var142 = var135 + var141;
                     var143 = new int[9];
                     int var144 = 0;
                     int var148;
                     int var149;
                     int var151;
                     if (var9) {
                        var145 = 0;
                     } else if (~var144 <= -4) {
                        var148 = arg7[2] * var142 + arg7[0] * var140 + arg7[1] * var139 + 8192 >> 14;
                        var149 = arg7[3] * var140 + 8192 - (-(arg7[4] * var139) + -(arg7[5] * var142)) >> 14;
                        var145 = var115 + var148;
                        var150 = var116 + var149;
                        var151 = arg7[6] * var140 + arg7[7] * var139 + arg7[8] * var142 + 8192 >> 14;
                        var152 = var117 + var151;
                        var153 = 0;
                        if (!var9) {
                           break label974;
                        }
                     } else {
                        var145 = 0;
                     }

                     while(true) {
                        label971: {
                           int var146;
                           int var147;
                           if (var9) {
                              var146 = 0;
                              var147 = 0;
                              if (var9) {
                                 var146 += arg7[var144 * 3 + var147] * var136[var147 * 3 + var145];
                                 ++var147;
                              }
                           } else {
                              if (var145 >= 3) {
                                 break label971;
                              }

                              var146 = 0;
                              var147 = 0;
                              if (var9) {
                                 var146 += arg7[var144 * 3 + var147] * var136[var147 * 3 + var145];
                                 ++var147;
                              }
                           }

                           while(true) {
                              while(var147 < 3) {
                                 var146 += arg7[var144 * 3 + var147] * var136[var147 * 3 + var145];
                                 ++var147;
                              }

                              var143[var144 * 3 - -var145] = var146 - -8192 >> 14;
                              if (!var9) {
                                 ++var145;
                                 if (var145 >= 3) {
                                    break;
                                 }

                                 var146 = 0;
                                 var147 = 0;
                                 if (var9) {
                                    var146 += arg7[var144 * 3 + var147] * var136[var147 * 3 + var145];
                                    ++var147;
                                 }
                              } else {
                                 ++var147;
                              }
                           }
                        }

                        ++var144;
                        if (~var144 <= -4) {
                           var148 = arg7[2] * var142 + arg7[0] * var140 + arg7[1] * var139 + 8192 >> 14;
                           var149 = arg7[3] * var140 + 8192 - (-(arg7[4] * var139) + -(arg7[5] * var142)) >> 14;
                           var145 = var115 + var148;
                           var150 = var116 + var149;
                           var151 = arg7[6] * var140 + arg7[7] * var139 + arg7[8] * var142 + 8192 >> 14;
                           var152 = var117 + var151;
                           var153 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var145 = 0;
                        }
                     }
                  }

                  if (var9 || ~var153 > ~var10) {
                     do {
                        int var154 = arg1[var153];
                        if (this.field11005.length <= var154) {
                           ++var153;
                        } else {
                           int[] var155 = this.field11005[var154];
                           int var156 = 0;
                           if (!var9 && var156 >= var155.length) {
                              ++var153;
                           } else {
                              do {
                                 int var157 = var155[var156];
                                 if (this.field10966 != null && (this.field10966[var157] & arg6) == 0) {
                                    ++var156;
                                 } else {
                                    int var158 = this.field10987[var157] * var143[2] + (this.field10951[var157] * var143[0] - (-(this.field11021[var157] * var143[1]) + -8192)) >> 14;
                                    int var159 = this.field10987[var157] * var143[5] + this.field11021[var157] * var143[4] + this.field10951[var157] * var143[3] + 8192 >> 14;
                                    int var160 = this.field11021[var157] * var143[7] + 8192 + this.field10987[var157] * var143[8] + this.field10951[var157] * var143[6] >> 14;
                                    int var161 = var145 + var158;
                                    int var162 = var150 + var159;
                                    this.field10951[var157] = var161;
                                    int var163 = var152 + var160;
                                    this.field11021[var157] = var162;
                                    this.field10987[var157] = var163;
                                    ++var156;
                                 }
                              } while(var156 < var155.length);

                              ++var153;
                           }
                        }
                     } while(~var153 > ~var10);

                  }
               } else {
                  int var164 = 0;
                  if (var9 || var10 > var164) {
                     do {
                        int var165 = arg1[var164];
                        if (var165 >= this.field11005.length) {
                           ++var164;
                        } else {
                           int[] var166 = this.field11005[var165];
                           int var167 = 0;
                           if (!var9 && ~var166.length >= ~var167) {
                              ++var164;
                           } else {
                              do {
                                 int var168 = var166[var167];
                                 if (this.field10966 != null && (this.field10966[var168] & arg6) == 0) {
                                    ++var167;
                                 } else {
                                    this.field10951[var168] -= class405.field5857;
                                    this.field11021[var168] -= class653.field9565;
                                    this.field10987[var168] -= class218.field3119;
                                    this.field10951[var168] = this.field10951[var168] * arg2 >> 7;
                                    this.field11021[var168] = this.field11021[var168] * arg3 >> 7;
                                    this.field10987[var168] = this.field10987[var168] * arg4 >> 7;
                                    this.field10951[var168] += class405.field5857;
                                    this.field11021[var168] += class653.field9565;
                                    this.field10987[var168] += class218.field3119;
                                    ++var167;
                                 }
                              } while(~var166.length < ~var167);

                              ++var164;
                           }
                        }
                     } while(var10 > var164);

                  }
               }
            } else if (~arg0 == -6) {
               if (this.field11036 != null) {
                  int var169 = 0;
                  if (var9 || ~var169 > ~var10) {
                     do {
                        int var170 = arg1[var169];
                        if (~this.field11036.length >= ~var170) {
                           ++var169;
                        } else {
                           int[] var171 = this.field11036[var170];
                           int var172 = 0;
                           if (!var9 && var172 >= var171.length) {
                              ++var169;
                           } else {
                              do {
                                 int var173 = var171[var172];
                                 if (this.field11066 != null && ~(this.field11066[var173] & arg6) == -1) {
                                    ++var172;
                                 } else {
                                    int var174 = (255 & this.field10955[var173]) + arg2 * 8;
                                    if (var174 < 0) {
                                       var174 = 0;
                                       if (var9 && ~var174 < -256) {
                                          var174 = 255;
                                       }
                                    } else if (~var174 < -256) {
                                       var174 = 255;
                                    }

                                    this.field10955[var173] = (byte)var174;
                                    if (this.field11043 != null) {
                                       this.field11043.field72 = null;
                                    }

                                    ++var172;
                                 }
                              } while(var172 < var171.length);

                              ++var169;
                           }
                        }
                     } while(~var169 > ~var10);
                  }

                  if (this.field10994 != null) {
                     int var175 = 0;
                     if (var9 || ~this.field11042 < ~var175) {
                        do {
                           class116 var176 = this.field10994[var175];
                           class319 var177 = this.field10984[var175];
                           var177.field4362 = 16777215 & var177.field4362 | -(255 & this.field10955[var176.field1447]) + 255 << 24;
                           ++var175;
                        } while(~this.field11042 < ~var175);
                     }
                  }
               }

            } else if (~arg0 == -8) {
               if (this.field11036 != null) {
                  int var178 = 0;
                  if (var9 || ~var10 < ~var178) {
                     do {
                        int var179 = arg1[var178];
                        if (~this.field11036.length >= ~var179) {
                           ++var178;
                        } else {
                           int[] var180 = this.field11036[var179];
                           int var181 = 0;
                           if (!var9 && ~var181 <= ~var180.length) {
                              ++var178;
                           } else {
                              do {
                                 int var182 = var180[var181];
                                 if (this.field11066 != null && (this.field11066[var182] & arg6) == 0) {
                                    ++var181;
                                 } else {
                                    int var183 = 65535 & this.field11031[var182];
                                    int var184 = 63 & var183 >> 10;
                                    int var185 = (var183 & 954) >> 7;
                                    int var186 = arg3 / 4 + var185;
                                    int var187 = 63 & arg2 + var184;
                                    int var188 = var183 & 127;
                                    int var189 = arg4 + var188;
                                    if (var186 >= 0) {
                                       if (~var186 < -8) {
                                          var186 = 7;
                                          if (var9) {
                                             var186 = 0;
                                          }
                                       }
                                    } else {
                                       var186 = 0;
                                    }

                                    if (~var189 > -1) {
                                       var189 = 0;
                                       if (var9 && ~var189 < -128) {
                                          var189 = 127;
                                       }
                                    } else if (~var189 < -128) {
                                       var189 = 127;
                                    }

                                    this.field11031[var182] = (short)class300.method2238(var189, class300.method2238(var186 << 7, var187 << 10));
                                    if (this.field11043 != null) {
                                       this.field11043.field72 = null;
                                    }

                                    ++var181;
                                 }
                              } while(~var181 > ~var180.length);

                              ++var178;
                           }
                        }
                     } while(~var10 < ~var178);
                  }

                  if (this.field10994 != null) {
                     int var190 = 0;
                     if (var9 || this.field11042 > var190) {
                        do {
                           class116 var191 = this.field10994[var190];
                           class319 var192 = this.field10984[var190];
                           var192.field4362 = -16777216 & var192.field4362 | class546.field7829[65535 & this.field11031[var191.field1447]] & 16777215;
                           ++var190;
                        } while(this.field11042 > var190);
                     }
                  }
               }

            } else if (~arg0 == -9) {
               if (this.field10982 != null) {
                  int var193 = 0;
                  if (var9 || var193 < var10) {
                     do {
                        int var194 = arg1[var193];
                        if (var194 >= this.field10982.length) {
                           ++var193;
                        } else {
                           int[] var195 = this.field10982[var194];
                           int var196 = 0;
                           if (!var9 && ~var195.length >= ~var196) {
                              ++var193;
                           } else {
                              do {
                                 class319 var197 = this.field10984[var195[var196]];
                                 var197.field4373 += arg2;
                                 var197.field4367 += arg3;
                                 ++var196;
                              } while(~var195.length < ~var196);

                              ++var193;
                           }
                        }
                     } while(var193 < var10);
                  }
               }

            } else if (arg0 == 10) {
               if (this.field10982 != null) {
                  int var198 = 0;
                  if (var9 || ~var10 < ~var198) {
                     do {
                        int var199 = arg1[var198];
                        if (~var199 <= ~this.field10982.length) {
                           ++var198;
                        } else {
                           int[] var200 = this.field10982[var199];
                           int var201 = 0;
                           if (!var9 && ~var200.length >= ~var201) {
                              ++var198;
                           } else {
                              do {
                                 class319 var202 = this.field10984[var200[var201]];
                                 var202.field4372 = var202.field4372 * arg3 >> 7;
                                 var202.field4371 = var202.field4371 * arg2 >> 7;
                                 ++var201;
                              } while(~var200.length < ~var201);

                              ++var198;
                           }
                        }
                     } while(~var10 < ~var198);
                  }
               }

            } else if (~arg0 == -10) {
               if (this.field10982 != null) {
                  int var203 = 0;
                  if (var9 || var203 < var10) {
                     do {
                        int var204 = arg1[var203];
                        if (var204 >= this.field10982.length) {
                           ++var203;
                        } else {
                           int[] var205 = this.field10982[var204];
                           int var206 = 0;
                           if (!var9 && ~var205.length >= ~var206) {
                              ++var203;
                           } else {
                              do {
                                 class319 var207 = this.field10984[var205[var206]];
                                 var207.field4366 = var207.field4366 + arg2 & 16383;
                                 ++var206;
                              } while(~var205.length < ~var206);

                              ++var203;
                           }
                        }
                     } while(var203 < var10);
                  }
               }

            }
         } else {
            arg2 <<= 4;
            arg3 <<= 4;
            arg4 <<= 4;
            int var11 = 0;
            class218.field3119 = 0;
            class653.field9565 = 0;
            class405.field5857 = 0;
            int var12 = 0;
            if (var9) {
               var10000 = arg1[var12];
            } else if (var12 >= var10) {
               var10000 = ~var11;
               if (!var9) {
                  if (var10000 < -1) {
                     class405.field5857 = class405.field5857 / var11 + arg2;
                     class225.field3203 = true;
                     class653.field9565 = class653.field9565 / var11 - -arg3;
                     class218.field3119 = class218.field3119 / var11 + arg4;
                     return;
                  }

                  class653.field9565 = arg3;
                  class218.field3119 = arg4;
                  class405.field5857 = arg2;
                  return;
               }
            } else {
               var10000 = arg1[var12];
            }

            while(true) {
               int var13 = var10000;
               if (~var13 <= ~this.field11005.length) {
                  ++var12;
               } else {
                  int[] var14 = this.field11005[var13];
                  int var15 = 0;
                  int var16;
                  if (var9) {
                     var16 = var14[var15];
                     if (this.field10966 != null) {
                        if ((arg6 & this.field10966[var16]) != 0) {
                           class405.field5857 += this.field10951[var16];
                           class653.field9565 += this.field11021[var16];
                           ++var11;
                           class218.field3119 += this.field10987[var16];
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class405.field5857 += this.field10951[var16];
                        class653.field9565 += this.field11021[var16];
                        ++var11;
                        class218.field3119 += this.field10987[var16];
                        ++var15;
                     }
                  }

                  while(var14.length > var15) {
                     var16 = var14[var15];
                     if (this.field10966 != null) {
                        if ((arg6 & this.field10966[var16]) != 0) {
                           class405.field5857 += this.field10951[var16];
                           class653.field9565 += this.field11021[var16];
                           ++var11;
                           class218.field3119 += this.field10987[var16];
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class405.field5857 += this.field10951[var16];
                        class653.field9565 += this.field11021[var16];
                        ++var11;
                        class218.field3119 += this.field10987[var16];
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (var12 >= var10) {
                  var10000 = ~var11;
                  if (!var9) {
                     if (var10000 < -1) {
                        class405.field5857 = class405.field5857 / var11 + arg2;
                        class225.field3203 = true;
                        class653.field9565 = class653.field9565 / var11 - -arg3;
                        class218.field3119 = class218.field3119 / var11 + arg4;
                        return;
                     }

                     class653.field9565 = arg3;
                     class218.field3119 = arg4;
                     class405.field5857 = arg2;
                     return;
                  }
               } else {
                  var10000 = arg1[var12];
               }
            }
         }
      } catch (RuntimeException var209) {
         throw class237.method1823(var209, field11074[60] + arg0 + ',' + (arg1 != null ? field11074[0] : field11074[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field11074[0] : field11074[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "P",
      descriptor = "(IIII)V",
      line = 4194
   )
   public final void method205(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field11024;
         if (~arg0 != -1) {
            if (arg0 != 1) {
               if (arg0 != 2) {
                  if (~arg0 != -4) {
                     if (~arg0 != -6) {
                        if (arg0 != 7) {
                           if (arg0 != 8) {
                              if (~arg0 != -11) {
                                 if (~arg0 == -10) {
                                    int var40 = 0;
                                    if (var5 || var40 < this.field11042) {
                                       do {
                                          class319 var41 = this.field10984[var40];
                                          var41.field4366 = var41.field4366 + arg1 & 16383;
                                          ++var40;
                                       } while(var40 < this.field11042);

                                    }
                                 }
                              } else {
                                 int var38 = 0;
                                 if (var5 || this.field11042 > var38) {
                                    do {
                                       class319 var39 = this.field10984[var38];
                                       var39.field4371 = var39.field4371 * arg1 >> 7;
                                       var39.field4372 = var39.field4372 * arg2 >> 7;
                                       ++var38;
                                    } while(this.field11042 > var38);

                                 }
                              }
                           } else {
                              int var36 = 0;
                              if (var5 || ~var36 > ~this.field11042) {
                                 do {
                                    class319 var37 = this.field10984[var36];
                                    var37.field4367 += arg2;
                                    var37.field4373 += arg1;
                                    ++var36;
                                 } while(~var36 > ~this.field11042);

                              }
                           }
                        } else {
                           int var25 = 0;
                           int var33;
                           class116 var34;
                           class319 var35;
                           class747 var45;
                           if (var5) {
                              var45 = this;
                           } else if (~this.field10996 >= ~var25) {
                              var45 = this;
                              if (!var5) {
                                 if (this.field11043 != null) {
                                    this.field11043.field72 = null;
                                 }

                                 if (this.field10994 != null) {
                                    var33 = 0;
                                    if (var5 || ~var33 > ~this.field11042) {
                                       do {
                                          var34 = this.field10994[var33];
                                          var35 = this.field10984[var33];
                                          var35.field4362 = var35.field4362 & -16777216 | 16777215 & class546.field7829[65535 & this.field11031[var34.field1447]];
                                          ++var33;
                                       } while(~var33 > ~this.field11042);
                                    }
                                 }

                                 return;
                              }
                           } else {
                              var45 = this;
                           }

                           while(true) {
                              int var26 = var45.field11031[var25] & 65535;
                              int var27 = (var26 & 65295) >> 10;
                              int var28 = 7 & var26 >> 7;
                              int var29 = 127 & var26;
                              int var30 = arg2 / 4 + var28;
                              int var31 = 63 & var27 - -arg1;
                              if (~var30 <= -1) {
                                 if (var30 > 7) {
                                    var30 = 7;
                                    if (var5) {
                                       var30 = 0;
                                    }
                                 }
                              } else {
                                 var30 = 0;
                              }

                              int var32 = arg3 + var29;
                              if (~var32 <= -1) {
                                 if (var32 > 127) {
                                    var32 = 127;
                                    if (var5) {
                                       var32 = 0;
                                    }
                                 }
                              } else {
                                 var32 = 0;
                              }

                              this.field11031[var25] = (short)class300.method2238(class300.method2238(var31 << 10, var30 << 7), var32);
                              ++var25;
                              if (~this.field10996 >= ~var25) {
                                 var45 = this;
                                 if (!var5) {
                                    if (this.field11043 != null) {
                                       this.field11043.field72 = null;
                                    }

                                    if (this.field10994 != null) {
                                       var33 = 0;
                                       if (var5 || ~var33 > ~this.field11042) {
                                          do {
                                             var34 = this.field10994[var33];
                                             var35 = this.field10984[var33];
                                             var35.field4362 = var35.field4362 & -16777216 | 16777215 & class546.field7829[65535 & this.field11031[var34.field1447]];
                                             ++var33;
                                          } while(~var33 > ~this.field11042);
                                       }
                                    }

                                    return;
                                 }
                              } else {
                                 var45 = this;
                              }
                           }
                        }
                     } else {
                        int var20 = 0;
                        int var21;
                        short var44;
                        if (var5) {
                           var21 = (255 & this.field10955[var20]) - -(arg1 * 8);
                           if (~var21 > -1) {
                              var44 = 0;
                              if (var5) {
                                 if (~var44 < -256) {
                                    var44 = 255;
                                 }

                                 this.field10955[var20] = (byte)var44;
                                 ++var20;
                              } else {
                                 this.field10955[var20] = (byte)var44;
                                 ++var20;
                              }
                           } else {
                              if (~var21 < -256) {
                                 var21 = 255;
                              }

                              this.field10955[var20] = (byte)var21;
                              ++var20;
                           }
                        }

                        while(~var20 > ~this.field10996) {
                           var21 = (255 & this.field10955[var20]) - -(arg1 * 8);
                           if (~var21 > -1) {
                              var44 = 0;
                              if (var5) {
                                 if (~var44 < -256) {
                                    var44 = 255;
                                 }

                                 this.field10955[var20] = (byte)var44;
                                 ++var20;
                              } else {
                                 this.field10955[var20] = (byte)var44;
                                 ++var20;
                              }
                           } else {
                              if (~var21 < -256) {
                                 var21 = 255;
                              }

                              this.field10955[var20] = (byte)var21;
                              ++var20;
                           }
                        }

                        if (this.field11043 != null) {
                           this.field11043.field72 = null;
                        }

                        if (this.field10994 != null) {
                           int var22 = 0;
                           if (var5 || var22 < this.field11042) {
                              do {
                                 class116 var23 = this.field10994[var22];
                                 class319 var24 = this.field10984[var22];
                                 var24.field4362 = var24.field4362 & 16777215 | -(255 & this.field10955[var23.field1447]) + 255 << 24;
                                 ++var22;
                              } while(var22 < this.field11042);
                           }
                        }

                     }
                  } else {
                     int var19 = 0;
                     if (var5) {
                        this.field10951[var19] -= class405.field5857;
                        this.field11021[var19] -= class653.field9565;
                        this.field10987[var19] -= class218.field3119;
                        this.field10951[var19] = this.field10951[var19] * arg1 / 128;
                        this.field11021[var19] = this.field11021[var19] * arg2 / 128;
                        this.field10987[var19] = this.field10987[var19] * arg3 / 128;
                        this.field10951[var19] += class405.field5857;
                        this.field11021[var19] += class653.field9565;
                        this.field10987[var19] += class218.field3119;
                        ++var19;
                     }

                     while(true) {
                        while(~this.field10997 < ~var19) {
                           this.field10951[var19] -= class405.field5857;
                           this.field11021[var19] -= class653.field9565;
                           this.field10987[var19] -= class218.field3119;
                           this.field10951[var19] = this.field10951[var19] * arg1 / 128;
                           this.field11021[var19] = this.field11021[var19] * arg2 / 128;
                           this.field10987[var19] = this.field10987[var19] * arg3 / 128;
                           this.field10951[var19] += class405.field5857;
                           this.field11021[var19] += class653.field9565;
                           this.field10987[var19] += class218.field3119;
                           ++var19;
                        }

                        if (!var5) {
                           return;
                        }

                        ++var19;
                     }
                  }
               } else {
                  int var9 = 0;
                  if (var5) {
                     this.field10951[var9] -= class405.field5857;
                     this.field11021[var9] -= class653.field9565;
                     this.field10987[var9] -= class218.field3119;
                  } else if (this.field10997 <= var9) {
                     if (!var5) {
                        return;
                     }
                  } else {
                     this.field10951[var9] -= class405.field5857;
                     this.field11021[var9] -= class653.field9565;
                     this.field10987[var9] -= class218.field3119;
                  }

                  while(true) {
                     if (~arg3 != -1) {
                        int var10 = class363.field4956[arg3];
                        int var11 = class363.field4987[arg3];
                        int var12 = this.field11021[var9] * var10 + this.field10951[var9] * var11 + 16383 >> 14;
                        this.field11021[var9] = this.field11021[var9] * var11 + -(this.field10951[var9] * var10) - -16383 >> 14;
                        this.field10951[var9] = var12;
                     }

                     if (~arg1 != -1) {
                        int var13 = class363.field4956[arg1];
                        int var14 = class363.field4987[arg1];
                        int var15 = this.field11021[var9] * var14 - this.field10987[var9] * var13 - -16383 >> 14;
                        this.field10987[var9] = this.field11021[var9] * var13 + this.field10987[var9] * var14 + 16383 >> 14;
                        this.field11021[var9] = var15;
                     }

                     if (~arg2 != -1) {
                        int var16 = class363.field4956[arg2];
                        int var17 = class363.field4987[arg2];
                        int var18 = this.field10987[var9] * var16 + this.field10951[var9] * var17 + 16383 >> 14;
                        this.field10987[var9] = this.field10987[var9] * var17 + -(this.field10951[var9] * var16) + 16383 >> 14;
                        this.field10951[var9] = var18;
                     }

                     this.field10951[var9] += class405.field5857;
                     this.field11021[var9] += class653.field9565;
                     this.field10987[var9] += class218.field3119;
                     ++var9;
                     if (this.field10997 <= var9) {
                        if (!var5) {
                           return;
                        }
                     } else {
                        this.field10951[var9] -= class405.field5857;
                        this.field11021[var9] -= class653.field9565;
                        this.field10987[var9] -= class218.field3119;
                     }
                  }
               }
            } else {
               int var8 = 0;
               if (var5) {
                  this.field10951[var8] += arg1;
                  this.field11021[var8] += arg2;
                  this.field10987[var8] += arg3;
                  ++var8;
               }

               while(true) {
                  while(~var8 > ~this.field10997) {
                     this.field10951[var8] += arg1;
                     this.field11021[var8] += arg2;
                     this.field10987[var8] += arg3;
                     ++var8;
                  }

                  if (!var5) {
                     return;
                  }

                  ++var8;
               }
            }
         } else {
            class405.field5857 = 0;
            class218.field3119 = 0;
            class653.field9565 = 0;
            int var6 = 0;
            int var7 = 0;
            if (var5) {
               class405.field5857 += this.field10951[var7];
               class653.field9565 += this.field11021[var7];
               ++var6;
               class218.field3119 += this.field10987[var7];
               ++var7;
            }

            while(true) {
               while(this.field10997 > var7) {
                  class405.field5857 += this.field10951[var7];
                  class653.field9565 += this.field11021[var7];
                  ++var6;
                  class218.field3119 += this.field10987[var7];
                  ++var7;
               }

               int var10000 = ~var6;
               if (!var5) {
                  if (var10000 >= -1) {
                     class218.field3119 = arg3;
                     class653.field9565 = arg2;
                     class405.field5857 = arg1;
                     return;
                  }

                  class405.field5857 = class405.field5857 / var6 + arg1;
                  class218.field3119 = class218.field3119 / var6 + arg3;
                  class653.field9565 = class653.field9565 / var6 + arg2;
                  return;
               }

               class218.field3119 = var10000 + -1;
               ++var7;
            }
         }
      } catch (RuntimeException var43) {
         throw class237.method1823(var43, field11074[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "H",
      descriptor = "(III)V",
      line = 4500
   )
   public final void method164(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field11038;
         int var5 = 0;
         if (var4) {
            if (arg0 != 0) {
               this.field10951[var5] += arg0;
            }

            if (~arg1 != -1) {
               this.field11021[var5] += arg1;
            }

            if (arg2 != 0) {
               this.field10987[var5] += arg2;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field10997) {
               if (arg0 != 0) {
                  this.field10951[var5] += arg0;
               }

               if (~arg1 != -1) {
                  this.field11021[var5] += arg1;
               }

               if (arg2 != 0) {
                  this.field10987[var5] += arg2;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            if (!var4) {
               if (this.field11011 != null) {
                  this.field11011.field72 = null;
               }

               this.field10995 = false;
               return;
            }

            this.field10987[var5] += arg2;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11074[34] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(ZZ)V",
      line = 4534
   )
   private final void method5421(boolean arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         ++field11064;
         boolean var4 = this.field11043 != null && this.field11043.field72 == null;
         boolean var5 = this.field10958 != null && this.field10958.field72 == null;
         boolean var6 = this.field11011 != null && this.field11011.field72 == null;
         boolean var7 = this.field11001 != null && this.field11001.field72 == null;
         if (arg0) {
            var7 &= ~(this.field11027 & 8) != -1;
            var6 &= ~(1 & this.field11027) != -1;
            var4 &= ~(this.field11027 & 2) != -1;
            var5 &= (this.field11027 & 4) != 0;
         }

         byte var8 = 0;
         byte var9 = 0;
         byte var10 = 0;
         byte var11 = 0;
         byte var12 = 0;
         if (var6) {
            var9 = var8;
            var8 = (byte)(var8 + 12);
         }

         if (var4) {
            var10 = var8;
            var8 = (byte)(var8 + 4);
         }

         if (var5) {
            var11 = var8;
            var8 = (byte)(var8 + 12);
         }

         if (var7) {
            var12 = var8;
            var8 = (byte)(var8 + 8);
         }

         if (~var8 != -1) {
            label493: {
               if (~(this.field10962 * var8) >= ~this.field10973.field8490.field1889.length) {
                  this.field10973.field8490.field1856 = 0;
                  if (!var3) {
                     break label493;
                  }
               }

               this.field10973.field8490 = new class77((this.field10962 + 100) * var8);
            }

            class77 var13 = this.field10973.field8490;
            if (var6) {
               label528: {
                  if (!this.field10973.field8469) {
                     int var14 = 0;
                     if (var3 || ~this.field10997 < ~var14) {
                        label483:
                        do {
                           int var15 = Stream.floatToRawIntBits((float)this.field10951[var14]);
                           int var16 = Stream.floatToRawIntBits((float)this.field11021[var14]);
                           int var17 = Stream.floatToRawIntBits((float)this.field10987[var14]);
                           int var18 = this.field10986[var14];
                           int var19 = this.field10986[var14 + 1];
                           int var20 = var18;
                           if (!var3 && ~var18 <= ~var19) {
                              ++var14;
                           } else {
                              do {
                                 int var21 = this.field10954[var20] + -1;
                                 if (~var21 == 0) {
                                    ++var14;
                                    continue label483;
                                 }

                                 var13.field1856 = var8 * var21;
                                 var13.method1149(true, var15);
                                 var13.method1149(true, var16);
                                 var13.method1149(true, var17);
                                 ++var20;
                              } while(~var20 > ~var19);

                              ++var14;
                           }
                        } while(~this.field10997 < ~var14);
                     }

                     if (!var3) {
                        break label528;
                     }
                  }

                  int var22 = 0;
                  if (var3 || ~var22 > ~this.field10997) {
                     label457:
                     do {
                        int var23 = Stream.floatToRawIntBits((float)this.field10951[var22]);
                        int var24 = Stream.floatToRawIntBits((float)this.field11021[var22]);
                        int var25 = Stream.floatToRawIntBits((float)this.field10987[var22]);
                        int var26 = this.field10986[var22];
                        int var27 = this.field10986[var22 + 1];
                        int var28 = var26;
                        if (!var3 && ~var27 >= ~var26) {
                           ++var22;
                        } else {
                           do {
                              int var29 = this.field10954[var28] + -1;
                              if (var29 == -1) {
                                 ++var22;
                                 continue label457;
                              }

                              var13.field1856 = var8 * var29;
                              var13.method1160(90, var23);
                              var13.method1160(79, var24);
                              var13.method1160(127, var25);
                              ++var28;
                           } while(~var27 < ~var28);

                           ++var22;
                        }
                     } while(~var22 > ~this.field10997);
                  }
               }
            }

            if (var4) {
               label531: {
                  if (this.field10958 == null) {
                     byte[] var30;
                     short[] var31;
                     short[] var32;
                     short[] var33;
                     label429: {
                        if (this.field11069 == null) {
                           var30 = this.field10970;
                           var31 = this.field11004;
                           var32 = this.field11012;
                           var33 = this.field11067;
                           if (!var3) {
                              break label429;
                           }
                        }

                        var30 = this.field11069.field5463;
                        var32 = this.field11069.field5460;
                        var33 = this.field11069.field5464;
                        var31 = this.field11069.field5459;
                     }

                     float var34 = this.field10973.field8405[0];
                     float var35 = this.field10973.field8405[1];
                     float var36 = this.field10973.field8405[2];
                     float var37 = this.field10973.field8471;
                     float var38 = this.field10973.field8461 * 768.0F / (float)this.field11044;
                     float var39 = this.field10973.field8465 * 768.0F / (float)this.field11044;
                     int var40 = 0;
                     if (var3 || ~this.field10996 < ~var40) {
                        do {
                           float var42;
                           short var43;
                           float var44;
                           float var45;
                           float var47;
                           label409: {
                              int var41 = this.method5420(this.field10979[var40], this.field10955[var40], this.field11052, this.field11031[var40], (byte)47);
                              var42 = (float)(var41 >> 16 & 255) * this.field10973.field8440;
                              var43 = this.field11048[var40];
                              var44 = (float)(var41 >>> 24) * this.field10973.field8402;
                              var45 = (float)(var41 >> 8 & 255) * this.field10973.field8442;
                              short var46 = (short)var30[var43];
                              if (~var46 == -1) {
                                 var47 = ((float)var33[var43] * var36 + (float)var31[var43] * var34 + (float)var32[var43] * var35) * 0.0026041667F;
                                 if (!var3) {
                                    break label409;
                                 }
                              }

                              var47 = ((float)var33[var43] * var36 + (float)var31[var43] * var34 + (float)var32[var43] * var35) / (float)(var46 * 256);
                           }

                           float var48 = var37 + (!(var47 < 0.0F) ? var38 : var39) * var47;
                           int var49 = (int)(var44 * var48);
                           if (~var49 > -1) {
                              var49 = 0;
                              if (var3 && var49 > 255) {
                                 var49 = 255;
                              }
                           } else if (var49 > 255) {
                              var49 = 255;
                           }

                           int var50 = (int)(var42 * var48);
                           if (var50 >= 0) {
                              if (var50 > 255) {
                                 var50 = 255;
                                 if (var3) {
                                    var50 = 0;
                                 }
                              }
                           } else {
                              var50 = 0;
                           }

                           int var51 = (int)(var45 * var48);
                           if (var51 < 0) {
                              var51 = 0;
                              if (var3 && var51 > 255) {
                                 var51 = 255;
                              }
                           } else if (var51 > 255) {
                              var51 = 255;
                           }

                           short var52;
                           float var54;
                           label414: {
                              var13.field1856 = var8 * var43 + var10;
                              var13.method1186(var49, 0);
                              var13.method1186(var50, 0);
                              var13.method1186(var51, 0);
                              var13.method1186(255 - (255 & this.field10955[var40]), 0);
                              var52 = this.field10989[var40];
                              short var53 = (short)var30[var52];
                              if (var53 == 0) {
                                 var54 = ((float)var33[var52] * var36 + (float)var31[var52] * var34 + (float)var32[var52] * var35) * 0.0026041667F;
                                 if (!var3) {
                                    break label414;
                                 }
                              }

                              var54 = ((float)var33[var52] * var36 + (float)var31[var52] * var34 + (float)var32[var52] * var35) / (float)(var53 * 256);
                           }

                           float var55 = (var54 < 0.0F ? var39 : var38) * var54 + var37;
                           int var56 = (int)(var44 * var55);
                           if (~var56 > -1) {
                              var56 = 0;
                              if (var3 && var56 > 255) {
                                 var56 = 255;
                              }
                           } else if (var56 > 255) {
                              var56 = 255;
                           }

                           int var57 = (int)(var42 * var55);
                           int var58 = (int)(var45 * var55);
                           if (var57 >= 0) {
                              if (var57 > 255) {
                                 var57 = 255;
                                 if (var3) {
                                    var57 = 0;
                                 }
                              }
                           } else {
                              var57 = 0;
                           }

                           if (var58 >= 0) {
                              if (~var58 < -256) {
                                 var58 = 255;
                                 if (var3) {
                                    var58 = 0;
                                 }
                              }
                           } else {
                              var58 = 0;
                           }

                           short var59;
                           float var61;
                           label420: {
                              var13.field1856 = var8 * var52 + var10;
                              var13.method1186(var56, 0);
                              var13.method1186(var57, 0);
                              var13.method1186(var58, 0);
                              var13.method1186(255 - (this.field10955[var40] & 255), 0);
                              var59 = this.field10949[var40];
                              short var60 = (short)var30[var59];
                              if (var60 == 0) {
                                 var61 = ((float)var33[var59] * var36 + (float)var31[var59] * var34 + (float)var32[var59] * var35) * 0.0026041667F;
                                 if (!var3) {
                                    break label420;
                                 }
                              }

                              var61 = ((float)var33[var59] * var36 + (float)var31[var59] * var34 + (float)var32[var59] * var35) / (float)(var60 * 256);
                           }

                           float var62 = var37 + var61 * (!(var61 < 0.0F) ? var38 : var39);
                           int var63 = (int)(var44 * var62);
                           if (~var63 > -1) {
                              var63 = 0;
                              if (var3 && ~var63 < -256) {
                                 var63 = 255;
                              }
                           } else if (~var63 < -256) {
                              var63 = 255;
                           }

                           int var64 = (int)(var42 * var62);
                           if (~var64 <= -1) {
                              if (~var64 < -256) {
                                 var64 = 255;
                                 if (var3) {
                                    var64 = 0;
                                 }
                              }
                           } else {
                              var64 = 0;
                           }

                           int var65 = (int)(var45 * var62);
                           if (~var65 <= -1) {
                              if (var65 > 255) {
                                 var65 = 255;
                                 if (var3) {
                                    var65 = 0;
                                 }
                              }
                           } else {
                              var65 = 0;
                           }

                           var13.field1856 = var10 - -(var8 * var59);
                           var13.method1186(var63, 0);
                           var13.method1186(var64, 0);
                           var13.method1186(var65, 0);
                           var13.method1186(255 - (255 & this.field10955[var40]), 0);
                           ++var40;
                        } while(~this.field10996 < ~var40);
                     }

                     if (!var3) {
                        break label531;
                     }
                  }

                  int var66 = 0;
                  if (var3 || var66 < this.field10996) {
                     do {
                        int var67 = this.method5420(this.field10979[var66], this.field10955[var66], this.field11052, this.field11031[var66], (byte)119);
                        var13.field1856 = this.field11048[var66] * var8 + var10;
                        var13.method1160(127, var67);
                        var13.field1856 = this.field10989[var66] * var8 + var10;
                        var13.method1160(91, var67);
                        var13.field1856 = this.field10949[var66] * var8 + var10;
                        var13.method1160(98, var67);
                        ++var66;
                     } while(var66 < this.field10996);
                  }
               }
            }

            if (var5) {
               label534: {
                  short[] var68;
                  short[] var69;
                  short[] var70;
                  byte[] var71;
                  label321: {
                     if (this.field11069 == null) {
                        var68 = this.field11012;
                        var69 = this.field11004;
                        var70 = this.field11067;
                        var71 = this.field10970;
                        if (!var3) {
                           break label321;
                        }
                     }

                     var70 = this.field11069.field5464;
                     var68 = this.field11069.field5460;
                     var71 = this.field11069.field5463;
                     var69 = this.field11069.field5459;
                  }

                  float var72 = 3.0F / (float)this.field11044;
                  float var73 = 3.0F / (float)(this.field11044 / 2 + this.field11044);
                  var13.field1856 = var11;
                  if (this.field10973.field8469) {
                     int var74 = 0;
                     if (var3 || var74 < this.field10962) {
                        do {
                           label311: {
                              int var75 = 255 & var71[var74];
                              if (var75 == 0) {
                                 var13.method701((float)var69[var74] * var73, 1871583144);
                                 var13.method701((float)var68[var74] * var73, 1871583144);
                                 var13.method701((float)var70[var74] * var73, 1871583144);
                                 if (!var3) {
                                    break label311;
                                 }
                              }

                              float var76 = var72 / (float)var75;
                              var13.method701((float)var69[var74] * var76, 1871583144);
                              var13.method701((float)var68[var74] * var76, 1871583144);
                              var13.method701((float)var70[var74] * var76, 1871583144);
                           }

                           var13.field1856 += var8 + -12;
                           ++var74;
                        } while(var74 < this.field10962);
                     }

                     if (!var3) {
                        break label534;
                     }
                  }

                  int var77 = 0;
                  if (var3 || var77 < this.field10962) {
                     do {
                        label295: {
                           int var78 = 255 & var71[var77];
                           if (var78 != 0) {
                              float var79 = var72 / (float)var78;
                              var13.method699((float)var69[var77] * var79, (byte)122);
                              var13.method699((float)var68[var77] * var79, (byte)126);
                              var13.method699((float)var70[var77] * var79, (byte)124);
                              if (!var3) {
                                 break label295;
                              }
                           }

                           var13.method699((float)var69[var77] * var73, (byte)127);
                           var13.method699((float)var68[var77] * var73, (byte)127);
                           var13.method699((float)var70[var77] * var73, (byte)125);
                        }

                        var13.field1856 += var8 - 12;
                        ++var77;
                     } while(var77 < this.field10962);
                  }
               }
            }

            if (var7) {
               label537: {
                  var13.field1856 = var12;
                  if (this.field10973.field8469) {
                     int var80 = 0;
                     if (var3) {
                        var13.method701(this.field11016[var80], 1871583144);
                        var13.method701(this.field10998[var80], 1871583144);
                        var13.field1856 += var8 + -8;
                        ++var80;
                     }

                     while(true) {
                        while(var80 < this.field10962) {
                           var13.method701(this.field11016[var80], 1871583144);
                           var13.method701(this.field10998[var80], 1871583144);
                           var13.field1856 += var8 + -8;
                           ++var80;
                        }

                        if (!var3) {
                           if (!var3) {
                              break label537;
                           }
                           break;
                        }

                        ++var80;
                     }
                  }

                  int var81 = 0;
                  if (var3 || this.field10962 > var81) {
                     do {
                        var13.method699(this.field11016[var81], (byte)123);
                        var13.method699(this.field10998[var81], (byte)124);
                        var13.field1856 += var8 - 8;
                        ++var81;
                     } while(this.field10962 > var81);
                  }
               }
            }

            var13.field1856 = this.field10962 * var8;
            if (!arg1) {
               class485 var82;
               label541: {
                  if (!arg0) {
                     var82 = this.field10973.method4113(var13.field1889, var8, 671655096, false, var13.field1856);
                     this.field11033 = true;
                     if (!var3) {
                        break label541;
                     }
                  }

                  label242: {
                     if (this.field11047 != null) {
                        this.field11047.method3519(var13.field1856, var8, var13.field1889, arg1);
                        if (!var3) {
                           break label242;
                        }
                     }

                     this.field11047 = this.field10973.method4113(var13.field1889, var8, 671655096, true, var13.field1856);
                  }

                  this.field11027 = 0;
                  var82 = this.field11047;
               }

               if (var6) {
                  this.field11011.field72 = var82;
                  this.field11011.field73 = var9;
               }

               if (var7) {
                  this.field11001.field72 = var82;
                  this.field11001.field73 = var12;
               }

               if (var4) {
                  this.field11043.field73 = var10;
                  this.field11043.field72 = var82;
               }

               if (var5) {
                  this.field10958.field72 = var82;
                  this.field10958.field73 = var11;
               }
            }
         }
      } catch (RuntimeException var84) {
         throw class237.method1823(var84, field11074[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lka;IIIZ)V",
      line = 5052
   )
   public final void method173(class500 param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "aa",
      descriptor = "(SS)V",
      line = 5320
   )
   public final void method176(short arg0, short arg1) {
      boolean var3 = client.field4360;

      try {
         ++field11013;
         class162 var4 = this.field10973.field802;
         int var5 = 0;
         if (var3) {
            if (~this.field10979[var5] == ~arg0) {
               this.field10979[var5] = arg1;
            }

            ++var5;
         }

         while(true) {
            while(this.field10996 > var5) {
               if (~this.field10979[var5] == ~arg0) {
                  this.field10979[var5] = arg1;
               }

               ++var5;
            }

            byte var6 = 0;
            byte var7 = 0;
            if (!var3) {
               if (arg0 != -1) {
                  class317 var8 = var4.method1354(65535 & arg0, (byte)-109);
                  var6 = var8.field4321;
                  var7 = var8.field4324;
               }

               byte var9 = 0;
               byte var10 = 0;
               if (~arg1 != 0) {
                  class317 var11 = var4.method1354(arg1 & 65535, (byte)-109);
                  var10 = var11.field4324;
                  var9 = var11.field4321;
                  if (~var11.field4326 != -1 || var11.field4327 != 0) {
                     this.field11002 = true;
                  }
               }

               if (var7 != var10 | var6 != var9) {
                  if (this.field10994 != null) {
                     int var12 = 0;
                     if (var3 || ~var12 > ~this.field11042) {
                        do {
                           class116 var13 = this.field10994[var12];
                           class319 var14 = this.field10984[var12];
                           var14.field4362 = class546.field7829[this.field11031[var13.field1447] & 65535] & 16777215 | -16777216 & var14.field4362;
                           ++var12;
                        } while(~var12 > ~this.field11042);
                     }
                  }

                  if (this.field11043 != null) {
                     this.field11043.field72 = null;
                     return;
                  }
               }

               return;
            }

            if (arg0 == -1) {
               this.field10979[var5] = arg1;
            }

            ++var5;
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field11074[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "()[Ltu;",
      line = 5402
   )
   public final class370[] method153() {
      try {
         ++field11035;
         return this.field10964;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[23] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "da",
      descriptor = "()I",
      line = 5431
   )
   public final int method148() {
      try {
         ++field11065;
         return this.field11044;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[39] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "b",
      descriptor = "(B)V",
      line = 5439
   )
   private final void method5422(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11070;
         if (this.field10994 != null) {
            class747 var10000;
            label53: {
               class507 var3 = this.field10973.field8349;
               this.field10973.method4139(false);
               this.field10973.method493(!this.field11028);
               this.field10973.method4124(110, false);
               this.field10973.method4144(this.field10973.field8438, (byte)71, (class7)null, this.field10973.field8478, (class7)null);
               int var4 = 0;
               if (var2) {
                  var10000 = this;
               } else if (var4 >= this.field11042) {
                  this.field10973.method493(true);
                  var10000 = this;
                  if (!var2) {
                     break label53;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class116 var5 = var10000.field10994[var4];
                  class319 var6 = this.field10984[var4];
                  if (var5.field1450 && this.field10973.method528()) {
                     ++var4;
                  } else {
                     float var7 = (float)(this.field10951[var5.field1456] + this.field10951[var5.field1449] + this.field10951[var5.field1441]) * 0.3333333F;
                     float var8 = (float)(this.field11021[var5.field1456] + this.field11021[var5.field1441] - -this.field11021[var5.field1449]) * 0.3333333F;
                     float var9 = (float)(this.field10987[var5.field1456] + this.field10987[var5.field1449] + this.field10987[var5.field1441]) * 0.3333333F;
                     float var10 = class472.field6812 * var9 + class308.field4215 * var8 + class141.field1803 * var7 + class111.field1402;
                     float var11 = class712.field10386 * var9 + class57.field707 * var8 + class562.field8025 * var7 + class169.field2361;
                     float var12 = class756.field11208 * var9 + class36.field518 * var8 + class338.field4602 * var7 + class728.field10672;
                     float var13 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + var10 * var10 + var11 * var11))) * (float)var5.field1455;
                     var3.method3686(-1, var12 * var13 + -var12, var5.field1446 * var6.field4372 >> 7, (float)var6.field4373 + var10 - var10 * var13, var6.field4366, var5.field1454 * var6.field4371 >> 7, var11 * var13 + ((float)var6.field4367 - var11));
                     this.field10973.method4143((byte)-77, var3);
                     int var14 = var6.field4362;
                     OpenGL.glColor4ub((byte)(var14 >> 16), (byte)(var14 >> 8), (byte)var14, (byte)(var14 >> 24));
                     this.field10973.method4105(4, var5.field1457);
                     this.field10973.method4098(var5.field1443, -16757);
                     this.field10973.method4125(4, 7, 0, true);
                     ++var4;
                  }

                  if (var4 >= this.field11042) {
                     this.field10973.method493(true);
                     var10000 = this;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }

            var10000.field10973.method4163((byte)85);
         }

         if (arg0 != 38) {
            this.field10958 = null;
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field11074[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "RA",
      descriptor = "()I",
      line = 5498
   )
   public final int method220() {
      try {
         ++field11034;
         if (!this.field10995) {
            this.method5412(true);
         }

         return this.field11000;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[62] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "LA",
      descriptor = "(I)V",
      line = 5510
   )
   public final void method204(int arg0) {
      try {
         if (this.field11043 != null) {
            this.field11043.field72 = null;
         }

         ++field10999;
         this.field11044 = (short)arg0;
         if (this.field10958 != null) {
            this.field10958.field72 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11074[59] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "f",
      descriptor = "()[Lvga;",
      line = 5528
   )
   public final class94[] method188() {
      try {
         ++field11057;
         return this.field11045;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[56] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(FLio;BIIIJFII)S",
      line = 5539
   )
   private final short method5423(float arg0, class464 arg1, byte arg2, int arg3, int arg4, int arg5, long arg6, float arg7, int arg8, int arg9) {
      boolean var12 = client.field4360;

      try {
         ++field10985;
         int var13 = this.field10986[arg5];
         int var14 = this.field10986[arg5 + 1];
         int var15 = -88 % ((arg2 - -25) / 46);
         int var16 = 0;
         int var17 = var13;
         short var10000;
         if (var12) {
            var10000 = this.field10954[var13];
         } else if (var13 >= var14) {
            this.field10954[var16] = (short)(this.field10962 + 1);
            class550.field7890[var16] = arg6;
            this.field11004[this.field10962] = (short)arg9;
            this.field11012[this.field10962] = (short)arg4;
            this.field11067[this.field10962] = (short)arg8;
            this.field10970[this.field10962] = (byte)arg3;
            this.field11016[this.field10962] = arg0;
            this.field10998[this.field10962] = arg7;
            var10000 = (short)(this.field10962++);
            if (!var12) {
               return var10000;
            }
         } else {
            var10000 = this.field10954[var13];
         }

         do {
            while(true) {
               short var18 = var10000;
               if (var18 == 0) {
                  var16 = var17;
                  if (!var12) {
                     this.field10954[var17] = (short)(this.field10962 + 1);
                     class550.field7890[var17] = arg6;
                     this.field11004[this.field10962] = (short)arg9;
                     this.field11012[this.field10962] = (short)arg4;
                     this.field11067[this.field10962] = (short)arg8;
                     this.field10970[this.field10962] = (byte)arg3;
                     this.field11016[this.field10962] = arg0;
                     this.field10998[this.field10962] = arg7;
                     var10000 = (short)(this.field10962++);
                     break;
                  }

                  if (~class550.field7890[var17] == ~arg6) {
                     return (short)(var18 + -1);
                  }

                  ++var17;
               } else {
                  if (~class550.field7890[var17] == ~arg6) {
                     return (short)(var18 + -1);
                  }

                  ++var17;
               }

               if (var17 >= var14) {
                  this.field10954[var16] = (short)(this.field10962 + 1);
                  class550.field7890[var16] = arg6;
                  this.field11004[this.field10962] = (short)arg9;
                  this.field11012[this.field10962] = (short)arg4;
                  this.field11067[this.field10962] = (short)arg8;
                  this.field10970[this.field10962] = (byte)arg3;
                  this.field11016[this.field10962] = arg0;
                  this.field10998[this.field10962] = arg7;
                  var10000 = (short)(this.field10962++);
                  if (!var12) {
                     return var10000;
                  }
               } else {
                  var10000 = this.field10954[var17];
               }
            }
         } while(var12);

         return var10000;
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field11074[58] + arg0 + ',' + (arg1 != null ? field11074[0] : field11074[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(Lvh;B)V",
      line = 5584
   )
   private final void method5424(class381 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "k",
      descriptor = "(I)V",
      line = 5672
   )
   public final void method177(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11003;
         int var3 = class363.field4956[arg0];
         int var4 = class363.field4987[arg0];
         int var5 = 0;
         int var6;
         if (var2) {
            var6 = this.field10987[var5] * var3 + this.field10951[var5] * var4 >> 14;
            this.field10987[var5] = this.field10987[var5] * var4 - this.field10951[var5] * var3 >> 14;
            this.field10951[var5] = var6;
            ++var5;
         }

         while(true) {
            while(~this.field10997 < ~var5) {
               var6 = this.field10987[var5] * var3 + this.field10951[var5] * var4 >> 14;
               this.field10987[var5] = this.field10987[var5] * var4 - this.field10951[var5] * var3 >> 14;
               this.field10951[var5] = var6;
               ++var5;
            }

            int var7 = 0;
            if (!var2) {
               class747 var10000;
               if (var2) {
                  var10000 = this;
               } else if (~var7 <= ~this.field10962) {
                  var10000 = this;
                  if (!var2) {
                     if (this.field10958 == null && this.field11043 != null) {
                        this.field11043.field72 = null;
                     }

                     if (this.field10958 != null) {
                        this.field10958.field72 = null;
                     }

                     this.field10995 = false;
                     if (this.field11011 != null) {
                        this.field11011.field72 = null;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  int var8 = var10000.field11067[var7] * var3 - -(this.field11004[var7] * var4) >> 14;
                  this.field11067[var7] = (short)(this.field11067[var7] * var4 + -(this.field11004[var7] * var3) >> 14);
                  this.field11004[var7] = (short)var8;
                  ++var7;
                  if (~var7 <= ~this.field10962) {
                     var10000 = this;
                     if (!var2) {
                        if (this.field10958 == null && this.field11043 != null) {
                           this.field11043.field72 = null;
                        }

                        if (this.field10958 != null) {
                           this.field10958.field72 = null;
                        }

                        this.field10995 = false;
                        if (this.field11011 != null) {
                           this.field11011.field72 = null;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }

            ++var5;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field11074[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "V",
      descriptor = "()I",
      line = 6623
   )
   public final int method199() {
      try {
         if (!this.field10995) {
            this.method5412(true);
         }

         ++field11017;
         return this.field10975;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "ua",
      descriptor = "()I",
      line = 6634
   )
   public final int method214() {
      try {
         ++field10969;
         return this.field10978;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11074[13] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "s",
      descriptor = "(I)V",
      line = 6643
   )
   public final void method195(int arg0) {
      try {
         this.field10978 = arg0;
         ++field11050;
         this.field11033 = true;
         if (this.field11069 != null && (this.field10978 & 65536) == 0) {
            this.field11004 = this.field11069.field5459;
            this.field11067 = this.field11069.field5464;
            this.field11012 = this.field11069.field5460;
            this.field10970 = this.field11069.field5463;
            this.field11069 = null;
         }

         this.method5413((byte)-119);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11074[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pca",
      name = "a",
      descriptor = "(IIIIIIIB)V",
      line = 6665
   )
   public static final void method5425(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5426(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5427(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

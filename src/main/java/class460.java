import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class460 extends class428 {
   @OriginalMember(
      owner = "client!rba",
      name = "E",
      descriptor = "I"
   )
   public int field6631 = 0;
   @OriginalMember(
      owner = "client!rba",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6635 = new String[]{method3353(method3352("\u00144\u0017\u0006\u001bN")), method3353(method3352("\u00144\u0017\u0006\u0018N"))};
   @OriginalMember(
      owner = "client!rba",
      name = "t",
      descriptor = "Lll;"
   )
   public static class387 field6601 = new class387();
   @OriginalMember(
      owner = "client!rba",
      name = "P",
      descriptor = "[S"
   )
   public static short[] field6629 = new short[256];
   @OriginalMember(
      owner = "client!rba",
      name = "R",
      descriptor = "J"
   )
   public static long field6632 = 0L;
   @OriginalMember(
      owner = "client!rba",
      name = "v",
      descriptor = "I"
   )
   public int field6602;
   @OriginalMember(
      owner = "client!rba",
      name = "y",
      descriptor = "I"
   )
   public int field6605;
   @OriginalMember(
      owner = "client!rba",
      name = "N",
      descriptor = "I"
   )
   public int field6606;
   @OriginalMember(
      owner = "client!rba",
      name = "G",
      descriptor = "I"
   )
   public int field6607;
   @OriginalMember(
      owner = "client!rba",
      name = "p",
      descriptor = "I"
   )
   public int field6608;
   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "I"
   )
   public int field6611;
   @OriginalMember(
      owner = "client!rba",
      name = "K",
      descriptor = "I"
   )
   public static int field6616;
   @OriginalMember(
      owner = "client!rba",
      name = "M",
      descriptor = "I"
   )
   public int field6618;
   @OriginalMember(
      owner = "client!rba",
      name = "x",
      descriptor = "I"
   )
   public int field6619;
   @OriginalMember(
      owner = "client!rba",
      name = "O",
      descriptor = "I"
   )
   public int field6620;
   @OriginalMember(
      owner = "client!rba",
      name = "Q",
      descriptor = "I"
   )
   public static int field6622;
   @OriginalMember(
      owner = "client!rba",
      name = "C",
      descriptor = "I"
   )
   public int field6623;
   @OriginalMember(
      owner = "client!rba",
      name = "q",
      descriptor = "I"
   )
   public int field6627;
   @OriginalMember(
      owner = "client!rba",
      name = "n",
      descriptor = "I"
   )
   public int field6628;
   @OriginalMember(
      owner = "client!rba",
      name = "I",
      descriptor = "I"
   )
   public int field6630;
   @OriginalMember(
      owner = "client!rba",
      name = "L",
      descriptor = "I"
   )
   public static int field6633;
   @OriginalMember(
      owner = "client!rba",
      name = "S",
      descriptor = "I"
   )
   public int field6634;
   @OriginalMember(
      owner = "client!rba",
      name = "B",
      descriptor = "Lrv;"
   )
   public class121 field6626;
   @OriginalMember(
      owner = "client!rba",
      name = "u",
      descriptor = "Lec;"
   )
   public class248 field6603;
   @OriginalMember(
      owner = "client!rba",
      name = "m",
      descriptor = "Lec;"
   )
   public class248 field6614;
   @OriginalMember(
      owner = "client!rba",
      name = "T",
      descriptor = "Ldea;"
   )
   public class259 field6604;
   @OriginalMember(
      owner = "client!rba",
      name = "D",
      descriptor = "Lvea;"
   )
   public class289 field6609;
   @OriginalMember(
      owner = "client!rba",
      name = "A",
      descriptor = "Lvea;"
   )
   public class289 field6613;
   @OriginalMember(
      owner = "client!rba",
      name = "o",
      descriptor = "Lvn;"
   )
   public class332 field6621;
   @OriginalMember(
      owner = "client!rba",
      name = "J",
      descriptor = "Lvn;"
   )
   public class332 field6625;
   @OriginalMember(
      owner = "client!rba",
      name = "s",
      descriptor = "Llia;"
   )
   public class506 field6624;
   @OriginalMember(
      owner = "client!rba",
      name = "H",
      descriptor = "Z"
   )
   public boolean field6610;
   @OriginalMember(
      owner = "client!rba",
      name = "F",
      descriptor = "Z"
   )
   public boolean field6612;
   @OriginalMember(
      owner = "client!rba",
      name = "r",
      descriptor = "Z"
   )
   public boolean field6615;
   @OriginalMember(
      owner = "client!rba",
      name = "w",
      descriptor = "[I"
   )
   public int[] field6617;

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3350(int arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != 0) {
            field6629 = null;
         }

         int var3;
         boolean var4;
         label75: {
            ++field6616;
            var3 = this.field6611;
            var4 = this.field6615;
            if (this.field6604 == null) {
               if (this.field6624 != null) {
                  int var5 = class262.method1999((byte)-89, this.field6624);
                  if (~var3 == ~var5) {
                     break label75;
                  }

                  this.field6611 = var5;
                  class745 var6 = this.field6624.field7333;
                  if (var6.field10912 != null) {
                     var6 = var6.method5405(class21.field248, -89);
                  }

                  if (var6 == null) {
                     this.field6606 = 256;
                     this.field6634 = 256;
                     this.field6607 = this.field6602 = this.field6627 = 0;
                     this.field6615 = this.field6624.field7333.field10859;
                     if (!var2) {
                        break label75;
                     }
                  }

                  this.field6606 = var6.field10857;
                  this.field6634 = var6.field10893;
                  this.field6602 = var6.field10863 << 9;
                  this.field6607 = var6.field10880;
                  this.field6627 = var6.field10903 << 9;
                  this.field6615 = var6.field10859;
                  if (!var2) {
                     break label75;
                  }
               }

               if (this.field6626 == null) {
                  break label75;
               }

               this.field6611 = class566.method4032(this.field6626, -1);
               this.field6615 = this.field6626.field1551;
               this.field6602 = this.field6626.field1546 << 9;
               this.field6607 = this.field6626.field1553;
               this.field6627 = 0;
               this.field6634 = 256;
               this.field6606 = 256;
               if (!var2) {
                  break label75;
               }
            }

            class259 var7 = this.field6604.method1984(class21.field248, 21723);
            if (var7 == null) {
               this.field6617 = null;
               this.field6615 = false;
               this.field6608 = 0;
               this.field6623 = 0;
               this.field6610 = false;
               this.field6627 = 0;
               this.field6634 = 256;
               this.field6606 = 256;
               this.field6607 = 0;
               this.field6611 = -1;
               this.field6602 = 0;
               if (!var2) {
                  break label75;
               }
            }

            this.field6602 = var7.field3598 << 9;
            this.field6610 = var7.field3581;
            this.field6606 = var7.field3528;
            this.field6611 = var7.field3529;
            this.field6607 = var7.field3575;
            this.field6634 = var7.field3591;
            this.field6617 = var7.field3548;
            this.field6623 = var7.field3507;
            this.field6615 = var7.field3508;
            this.field6608 = var7.field3525;
         }

         if (this.field6611 != var3 || this.field6615 == !var4) {
            if (this.field6614 == null) {
               return;
            }

            class280.field3897.method4815(this.field6614);
            this.field6614 = null;
            this.field6609 = null;
            this.field6621 = null;
         }

      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field6635[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3351(int arg0) {
      try {
         if (arg0 != -31063) {
            method3351(-113);
         }

         field6601 = null;
         field6629 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6635[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3353(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

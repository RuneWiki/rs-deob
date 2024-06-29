import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class634 extends class508 {
   @OriginalMember(
      owner = "client!raa",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9273 = new String[]{method4589(method4588("\bFe\u0006@R")), method4589(method4588("\bFe\u0006BR")), method4589(method4588("\bFe\u0006HR")), method4589(method4588("\bFe\u0006ER")), method4589(method4588("\bFe\u0006DR")), method4589(method4588("\u0001\t*\u0006|")), method4589(method4588("\bFe\u0006GR")), method4589(method4588("\u0014RhD")), method4589(method4588(")rF")), method4589(method4588("\bFe\u0006CR"))};
   @OriginalMember(
      owner = "client!raa",
      name = "x",
      descriptor = "Leg;"
   )
   public static class118 field9268 = new class118(41, 3);
   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "F"
   )
   private float field9258;
   @OriginalMember(
      owner = "client!raa",
      name = "w",
      descriptor = "F"
   )
   private float field9267;
   @OriginalMember(
      owner = "client!raa",
      name = "v",
      descriptor = "I"
   )
   public static int field9260;
   @OriginalMember(
      owner = "client!raa",
      name = "F",
      descriptor = "I"
   )
   public static int field9261;
   @OriginalMember(
      owner = "client!raa",
      name = "s",
      descriptor = "I"
   )
   public static int field9262;
   @OriginalMember(
      owner = "client!raa",
      name = "B",
      descriptor = "I"
   )
   private int field9263;
   @OriginalMember(
      owner = "client!raa",
      name = "A",
      descriptor = "I"
   )
   private int field9264;
   @OriginalMember(
      owner = "client!raa",
      name = "E",
      descriptor = "I"
   )
   public static int field9266;
   @OriginalMember(
      owner = "client!raa",
      name = "u",
      descriptor = "I"
   )
   public static int field9270;
   @OriginalMember(
      owner = "client!raa",
      name = "D",
      descriptor = "I"
   )
   public static int field9272;
   @OriginalMember(
      owner = "client!raa",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field9259;
   @OriginalMember(
      owner = "client!raa",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   private String field9265;
   @OriginalMember(
      owner = "client!raa",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   private String field9269;
   @OriginalMember(
      owner = "client!raa",
      name = "r",
      descriptor = "[Lau;"
   )
   public static class770[] field9271;

   @OriginalMember(
      owner = "client!raa",
      name = "h",
      descriptor = "(I)Ljava/lang/String;",
      line = 4
   )
   public final String method4583(int arg0) {
      try {
         if (arg0 != 128) {
            return null;
         } else {
            ++field9260;
            return this.field9265;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9273[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "c",
      descriptor = "(I)V",
      line = 16
   )
   public static void method4584(int arg0) {
      try {
         field9268 = null;
         int var1 = -58 % (-arg0 / 51);
         field9271 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9273[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(ZLjagtheora/ogg/OggPacket;)V",
      line = 27
   )
   public final void method1485(boolean arg0, OggPacket arg1) {
      try {
         ++field9266;
         if (~super.field7407 >= -1 || field9273[8].equals(this.field9259)) {
            if (arg0) {
               this.method1485(true, (OggPacket)null);
            }

            class147 var3 = new class147(arg1.getData());
            int var4 = var3.method1143(-15465);
            if (super.field7407 <= 8) {
               if ((var4 | 128) == 0) {
                  throw new IllegalStateException();
               }

               if (super.field7407 != 0) {
                  return;
               }

               var3.field1856 += 23;
               this.field9263 = var3.method1153(32);
               this.field9264 = var3.method1153(32);
               if (this.field9263 == 0 || this.field9264 == 0) {
                  throw new IllegalStateException();
               }

               class147 var12 = new class147(16);
               var3.method1191(-5766, 16, var12.field1889, 0);
               this.field9269 = var12.method1204(2119550368);
               var12.field1856 = 0;
               var3.method1191(-5766, 16, var12.field1889, 0);
               this.field9259 = var12.method1204(2119550368);
            } else {
               if (var4 == 0) {
                  long var5 = var3.method1182(-105);
                  long var7 = var3.method1182(-69);
                  long var9 = var3.method1182(-102);
                  if (var5 < 0L || ~var7 > -1L || var9 < 0L || var5 < var9) {
                     throw new IllegalStateException();
                  }

                  this.field9258 = (float)((var5 + var7) * (long)this.field9264) / (float)this.field9263;
                  this.field9267 = (float)((long)this.field9264 * var5) / (float)this.field9263;
                  int var11 = var3.method1153(32);
                  if (~var11 > -1 || var11 > var3.field1889.length + -var3.field1856) {
                     throw new IllegalStateException();
                  }

                  this.field9265 = class196.method1535(var11, var3.field1889, (byte)-52, var3.field1856);
               }

               if (~(128 | var4) != -1) {
                  return;
               }
            }

         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field9273[6] + arg0 + ',' + (arg1 != null ? field9273[5] : field9273[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V",
      line = 106
   )
   public class634(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!raa",
      name = "b",
      descriptor = "(I)F",
      line = 113
   )
   public final float method4585(int arg0) {
      try {
         if (arg0 != -31380) {
            field9271 = null;
         }

         ++field9270;
         return this.field9267;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9273[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "d",
      descriptor = "(I)F",
      line = 124
   )
   public final float method4586(int arg0) {
      try {
         ++field9262;
         if (arg0 < 8) {
            field9271 = null;
         }

         return this.field9258;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9273[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "g",
      descriptor = "(I)Ljava/lang/String;",
      line = 137
   )
   public final String method4587(int arg0) {
      try {
         ++field9261;
         if (arg0 < 122) {
            this.field9258 = -0.38267773F;
         }

         return this.field9269;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9273[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(I)V",
      line = 150
   )
   public final void method1486(int arg0) {
      try {
         if (arg0 != -5238) {
            this.method1485(false, (OggPacket)null);
         }

         ++field9272;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9273[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4588(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4589(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

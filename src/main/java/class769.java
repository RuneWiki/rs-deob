import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class769 {
   @OriginalMember(
      owner = "client!vg",
      name = "f",
      descriptor = "I"
   )
   private int field11036 = 0;
   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "I"
   )
   private int field11040 = -1;
   @OriginalMember(
      owner = "client!vg",
      name = "n",
      descriptor = "Lsb;"
   )
   private class261 field11032 = new class261();
   @OriginalMember(
      owner = "client!vg",
      name = "k",
      descriptor = "Z"
   )
   public boolean field11043 = false;
   @OriginalMember(
      owner = "client!vg",
      name = "d",
      descriptor = "I"
   )
   private int field11041;
   @OriginalMember(
      owner = "client!vg",
      name = "b",
      descriptor = "I"
   )
   private int field11037;
   @OriginalMember(
      owner = "client!vg",
      name = "e",
      descriptor = "[Lkm;"
   )
   private class443[] field11042;
   @OriginalMember(
      owner = "client!vg",
      name = "m",
      descriptor = "[[[I"
   )
   private int[][][] field11039;
   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11044 = new String[]{method5543(method5542("9\u0013\u001a\u0019E")), method5543(method5542("4Z\u001av\u0010")), method5543(method5542(",HX[")), method5543(method5542("4Z\u001ar\u0010")), method5543(method5542("4Z\u001as\u0010")), method5543(method5542("4Z\u001au\u0010")), method5543(method5542("4Z\u001aq\u0010")), method5543(method5542("\u0001\\Z\u0017W,QM\u0017J'IF^]4X\u0014V\u0018$HX[\u0018+PUP]b^UTP'")), method5543(method5542("4Z\u001at\u0010")), method5543(method5542("4Z\u001a\u000bQ,T@\t\u0010"))};
   @OriginalMember(
      owner = "client!vg",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field11031 = false;
   @OriginalMember(
      owner = "client!vg",
      name = "c",
      descriptor = "Lfm;"
   )
   public static class164 field11029 = new class164(59, 2);
   @OriginalMember(
      owner = "client!vg",
      name = "g",
      descriptor = "I"
   )
   public static int field11030;
   @OriginalMember(
      owner = "client!vg",
      name = "i",
      descriptor = "I"
   )
   public static int field11033;
   @OriginalMember(
      owner = "client!vg",
      name = "j",
      descriptor = "I"
   )
   public static int field11034;
   @OriginalMember(
      owner = "client!vg",
      name = "o",
      descriptor = "I"
   )
   public static int field11035;
   @OriginalMember(
      owner = "client!vg",
      name = "h",
      descriptor = "I"
   )
   public static int field11038;

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method5536(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 23870) {
            this.field11040 = 120;
         }

         ++field11030;
         if (this.field11041 != this.field11037) {
            if (this.field11041 == 1) {
               this.field11043 = this.field11040 != arg1;
               this.field11040 = arg1;
               return this.field11039[0];
            } else {
               class443 var4;
               label44: {
                  var4 = this.field11042[arg1];
                  if (var4 == null) {
                     label41: {
                        this.field11043 = true;
                        if (this.field11036 >= this.field11041) {
                           class443 var5 = (class443)this.field11032.method2243(110);
                           var4 = new class443(arg1, var5.field6472);
                           this.field11042[var5.field6469] = null;
                           var5.method2140((byte)123);
                           if (!var3) {
                              break label41;
                           }
                        }

                        var4 = new class443(arg1, this.field11036);
                        ++this.field11036;
                     }

                     this.field11042[arg1] = var4;
                     if (!var3) {
                        break label44;
                     }
                  }

                  this.field11043 = false;
               }

               this.field11032.method2241(3, var4);
               return this.field11039[var4.field6472];
            }
         } else {
            this.field11043 = this.field11042[arg1] == null;
            this.field11042[arg1] = class411.field6042;
            return this.field11039[arg1];
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11044[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5537(int arg0, int arg1, int arg2) {
      try {
         if (arg1 <= 85) {
            method5540((byte)76, (class65)null);
         }

         ++field11038;
         return ~(1024 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11044[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5538(int arg0) {
      try {
         field11029 = null;
         if (arg0 != -1) {
            method5538(-38);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11044[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5539(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(BLcu;)Lpt;"
   )
   public static final class377 method5540(byte arg0, class65 arg1) {
      try {
         ++field11035;
         if (arg0 != -115) {
            field11029 = null;
         }

         int var2 = arg1.method685(-2);
         class634 var3 = class108.method1059(-23386)[arg1.method665(false)];
         class730 var4 = class196.method1721(arg0 ^ -44)[arg1.method665(false)];
         int var5 = arg1.method655((byte)77);
         int var6 = arg1.method655((byte)57);
         return new class377(var2, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field11044[1] + arg0 + ',' + (arg1 != null ? field11044[0] : field11044[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(B)[[[I"
   )
   public final int[][][] method5541(byte arg0) {
      boolean var2 = client.field10022;

      try {
         if (arg0 <= 5) {
            return null;
         } else {
            ++field11034;
            if (~this.field11041 != ~this.field11037) {
               throw new RuntimeException(field11044[7]);
            } else {
               int var3 = 0;
               if (var2) {
                  this.field11042[var3] = class411.field6042;
                  ++var3;
               }

               while(true) {
                  class769 var10000;
                  if (~var3 <= ~this.field11041) {
                     var10000 = this;
                     if (!var2) {
                        return this.field11039;
                     }
                  } else {
                     var10000 = this;
                  }

                  var10000.field11042[var3] = class411.field6042;
                  ++var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11044[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class769(int arg0, int arg1, int arg2) {
      try {
         this.field11041 = arg0;
         this.field11037 = arg1;
         this.field11042 = new class443[this.field11037];
         this.field11039 = new int[this.field11041][3][arg2];
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11044[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5542(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5543(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

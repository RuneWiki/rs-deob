import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class729 extends class673 {
   @OriginalMember(
      owner = "client!cca",
      name = "t",
      descriptor = "I"
   )
   public int field10630;
   @OriginalMember(
      owner = "client!cca",
      name = "l",
      descriptor = "I"
   )
   public int field10634;
   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10638 = new String[]{method5280(method5279("aX,\u0004\u000ekU$^\f*")), method5280(method5279("aX,\u0004v*")), method5280(method5279("aX,\u0004w*")), method5280(method5279("aX,\u0004u*")), method5280(method5279("aX,\u0004p*")), method5280(method5279("aX,\u0004s*")), method5280(method5279("aX,\u0004q*")), method5280(method5279("aX,\u0004t*")), method5280(method5279("aX,\u0004z*"))};
   @OriginalMember(
      owner = "client!cca",
      name = "v",
      descriptor = "Laka;"
   )
   public static class418 field10636 = new class418(98, 6);
   @OriginalMember(
      owner = "client!cca",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field10637 = new int[32];
   @OriginalMember(
      owner = "client!cca",
      name = "m",
      descriptor = "I"
   )
   public static int field10627;
   @OriginalMember(
      owner = "client!cca",
      name = "n",
      descriptor = "I"
   )
   public static int field10628;
   @OriginalMember(
      owner = "client!cca",
      name = "o",
      descriptor = "I"
   )
   public static int field10629;
   @OriginalMember(
      owner = "client!cca",
      name = "p",
      descriptor = "I"
   )
   public static int field10631;
   @OriginalMember(
      owner = "client!cca",
      name = "u",
      descriptor = "I"
   )
   public static int field10632;
   @OriginalMember(
      owner = "client!cca",
      name = "r",
      descriptor = "I"
   )
   public static int field10633;
   @OriginalMember(
      owner = "client!cca",
      name = "s",
      descriptor = "I"
   )
   public static int field10635;

   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5271(int arg0) {
      try {
         field10636 = null;
         if (arg0 != 30684) {
            field10636 = null;
         }

         field10637 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10638[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method5272(byte arg0) {
      try {
         ++field10629;
         if (arg0 != 59) {
            return false;
         } else {
            return ~((this.field10630 & 4004219) >> 21) != -1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10638[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5273(int arg0) {
      boolean var1 = client.field1481;

      try {
         if (arg0 != 0) {
            method5273(-43);
         }

         ++field10631;
         if (class233.field2900 == null) {
            int var2 = class543.field7943;
            int var3 = class549.field8088;
            int var4 = class282.field3917 - class204.field2605 - var2;
            int var5 = -class91.field1242 + class315.field4358 + -var3;
            if (~var2 < -1 || ~var4 < -1 || ~var3 < -1 || var5 > 0) {
               try {
                  Container var6;
                  label55: {
                     if (class570.field8391 == null) {
                        if (class152.field1893 != null) {
                           var6 = class152.field1893;
                           if (!var1) {
                              break label55;
                           }
                        }

                        var6 = class329.field4545;
                        if (!var1) {
                           break label55;
                        }
                     }

                     var6 = class570.field8391;
                  }

                  int var7 = 0;
                  int var8 = 0;
                  if (class570.field8391 == var6) {
                     Insets var9 = class570.field8391.getInsets();
                     var8 = var9.top;
                     var7 = var9.left;
                  }

                  Graphics var10 = var6.getGraphics();
                  var10.setColor(Color.black);
                  if (var2 > 0) {
                     var10.fillRect(var7, var8, var2, class315.field4358);
                  }

                  if (var3 > 0) {
                     var10.fillRect(var7, var8, class282.field3917, var3);
                  }

                  if (var4 > 0) {
                     var10.fillRect(class282.field3917 + var7 + -var4, var8, var4, class315.field4358);
                  }

                  if (~var5 < -1) {
                     var10.fillRect(var7, -var5 + var8 - -class315.field4358, class282.field3917, var5);
                     return;
                  }
               } catch (Exception var12) {
                  return;
               }
            }

         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field10638[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method5274(byte arg0) {
      try {
         if (arg0 > -64) {
            return -125;
         } else {
            ++field10627;
            return (this.field10630 & 1995400) >> 18;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10638[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method5275(int arg0) {
      try {
         ++field10632;
         return arg0 != 4004219 ? 100 : class752.method5436((byte)118, this.field10630);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10638[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(IB)Z"
   )
   public final boolean method5276(int arg0, byte arg1) {
      try {
         ++field10628;
         if (arg1 != 107) {
            method5273(-10);
         }

         return (this.field10630 >> arg0 - -1 & 1) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10638[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method5277(boolean arg0) {
      try {
         if (!arg0) {
            this.method5278(-78);
         }

         ++field10633;
         return (1 & this.field10630 >> 22) != 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10638[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class729(int arg0, int arg1) {
      try {
         this.field10630 = arg0;
         this.field10634 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10638[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method5278(int arg0) {
      try {
         ++field10635;
         int var2 = 90 / ((-36 - arg0) / 43);
         return (1 & this.field10630) != 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10638[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5279(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5280(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

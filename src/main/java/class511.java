import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class511 {
   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "I"
   )
   private int field7467 = 0;
   @OriginalMember(
      owner = "client!ef",
      name = "m",
      descriptor = "I"
   )
   private int field7463 = -1;
   @OriginalMember(
      owner = "client!ef",
      name = "e",
      descriptor = "Liw;"
   )
   private class332 field7470 = new class332();
   @OriginalMember(
      owner = "client!ef",
      name = "o",
      descriptor = "Z"
   )
   public boolean field7474 = false;
   @OriginalMember(
      owner = "client!ef",
      name = "j",
      descriptor = "I"
   )
   private int field7460;
   @OriginalMember(
      owner = "client!ef",
      name = "h",
      descriptor = "I"
   )
   private int field7459;
   @OriginalMember(
      owner = "client!ef",
      name = "c",
      descriptor = "[Lbda;"
   )
   private class529[] field7464;
   @OriginalMember(
      owner = "client!ef",
      name = "q",
      descriptor = "[[I"
   )
   private int[][] field7465;
   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7475 = new String[]{method3873(method3872("N\u0015\u001c\u00183")), method3873(method3872("N\u0015\u001c\u00193")), method3873(method3872("h\u0012\\ztE\u001fKziN\u0007@3~]\u0016\u0012;;M\u0006^6;B\u001eS=~\u000b\u0010S9sN")), method3873(method3872("N\u0015\u001c\u001b3")), method3873(method3872("N\u0015\u001cfrE\u001aFd3")), method3873(method3872("N\u0015\u001c\u001f3")), method3873(method3872("N\u0015\u001c\u001e3"))};
   @OriginalMember(
      owner = "client!ef",
      name = "n",
      descriptor = "I"
   )
   public static int field7458;
   @OriginalMember(
      owner = "client!ef",
      name = "p",
      descriptor = "I"
   )
   public static int field7462;
   @OriginalMember(
      owner = "client!ef",
      name = "k",
      descriptor = "I"
   )
   public static int field7471;
   @OriginalMember(
      owner = "client!ef",
      name = "g",
      descriptor = "I"
   )
   public static int field7472;
   @OriginalMember(
      owner = "client!ef",
      name = "l",
      descriptor = "I"
   )
   public static int field7473;
   @OriginalMember(
      owner = "client!ef",
      name = "f",
      descriptor = "Ld;"
   )
   public static class160 field7469;
   @OriginalMember(
      owner = "client!ef",
      name = "i",
      descriptor = "Lika;"
   )
   public static class445 field7461;
   @OriginalMember(
      owner = "client!ef",
      name = "d",
      descriptor = "Lqt;"
   )
   public static class661 field7468;
   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "[Ljj;"
   )
   public static class129[] field7466;

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3867(int arg0) {
      try {
         field7461 = null;
         field7468 = null;
         field7469 = null;
         field7466 = null;
         if (arg0 <= 74) {
            method3867(-102);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7475[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3868(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field7471;
         int var3 = 0;
         if (var2) {
            this.field7465[var3] = null;
            ++var3;
         }

         while(true) {
            while(~var3 > ~this.field7460) {
               this.field7465[var3] = null;
               ++var3;
            }

            this.field7465 = null;
            this.field7464 = null;
            this.field7470.method2580((byte)-4);
            if (!var2) {
               if (arg0 != -10846) {
                  this.method3868(-9);
               }

               this.field7470 = null;
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7475[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(B)[[I"
   )
   public final int[][] method3869(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field7472;
         if (this.field7460 != this.field7459) {
            throw new RuntimeException(field7475[2]);
         } else {
            int var3 = 0;
            if (arg0 != -88) {
               field7469 = null;
               if (var2) {
                  this.field7464[var3] = class226.field3345;
                  ++var3;
               }
            }

            while(true) {
               class511 var10000;
               if (~var3 <= ~this.field7460) {
                  var10000 = this;
                  if (!var2) {
                     return this.field7465;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field7464[var3] = class226.field3345;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7475[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method3870(byte arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field7473;
         if (arg0 != 56) {
            this.method3870((byte)75, 84);
         }

         if (~this.field7460 == ~this.field7459) {
            this.field7474 = this.field7464[arg1] == null;
            this.field7464[arg1] = class226.field3345;
            return this.field7465[arg1];
         } else if (this.field7460 == 1) {
            this.field7474 = ~this.field7463 != ~arg1;
            this.field7463 = arg1;
            return this.field7465[0];
         } else {
            class529 var4;
            label53: {
               var4 = this.field7464[arg1];
               if (var4 != null) {
                  this.field7474 = false;
                  if (!var3) {
                     break label53;
                  }
               }

               label39: {
                  this.field7474 = true;
                  if (this.field7467 < this.field7460) {
                     var4 = new class529(arg1, this.field7467);
                     ++this.field7467;
                     if (!var3) {
                        break label39;
                     }
                  }

                  class529 var5 = (class529)this.field7470.method2586((byte)109);
                  var4 = new class529(arg1, var5.field7702);
                  this.field7464[var5.field7700] = null;
                  var5.method154(-112);
               }

               this.field7464[arg1] = var4;
            }

            this.field7470.method2578(96, var4);
            return this.field7465[var4.field7702];
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7475[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(IZIZI)V"
   )
   public static final void method3871(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field7458;
         class93.method902(-30146);
         class245.field3518 = 0L;
         int var5 = class257.method2057(false);
         if (!arg3) {
            field7469 = null;
         }

         if (arg2 == 3 || ~var5 == -4) {
            arg1 = true;
         }

         if (!class444.field6473.method328()) {
            arg1 = true;
         }

         class589.method4359(arg2, arg1, -1, arg4, var5, arg0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7475[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class511(int arg0, int arg1, int arg2) {
      try {
         this.field7460 = arg0;
         this.field7459 = arg1;
         this.field7464 = new class529[this.field7459];
         this.field7465 = new int[this.field7460][arg2];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7475[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3872(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3873(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

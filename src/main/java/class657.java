import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class657 {
   @OriginalMember(
      owner = "client!ffa",
      name = "h",
      descriptor = "Llj;"
   )
   private class304 field9820 = new class304(64);
   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "Llj;"
   )
   private class304 field9821 = new class304(100);
   @OriginalMember(
      owner = "client!ffa",
      name = "e",
      descriptor = "Lrr;"
   )
   private class678 field9813;
   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9825 = new String[]{method4847(method4846("]\u0018\u001a:\u001a\u0013")), method4847(method4846("]\u0018\u001a:\u001d\u0013")), method4847(method4846("]\u0018\u001a:\u001b\u0013")), method4847(method4846("]\u0018\u001a:\u001c\u0013")), method4847(method4846("]\u0018\u001a:\u001f\u0013")), method4847(method4846("]\u0018\u001a:\u001e\u0013")), method4847(method4846("]\u0018\u001a:\u0019\u0013")), method4847(method4846("@PU:%")), method4847(method4846("]\u0018\u001a:dR\u0010\u0012`f\u0013")), method4847(method4846("U\u000b\u0017x"))};
   @OriginalMember(
      owner = "client!ffa",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field9816 = new class498(99, 3);
   @OriginalMember(
      owner = "client!ffa",
      name = "j",
      descriptor = "Luk;"
   )
   public static class498 field9822 = new class498(39, -2);
   @OriginalMember(
      owner = "client!ffa",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field9824 = new class113(80, -1);
   @OriginalMember(
      owner = "client!ffa",
      name = "d",
      descriptor = "I"
   )
   public static int field9812;
   @OriginalMember(
      owner = "client!ffa",
      name = "k",
      descriptor = "I"
   )
   public static int field9814;
   @OriginalMember(
      owner = "client!ffa",
      name = "c",
      descriptor = "I"
   )
   public static int field9815;
   @OriginalMember(
      owner = "client!ffa",
      name = "g",
      descriptor = "I"
   )
   public static int field9817;
   @OriginalMember(
      owner = "client!ffa",
      name = "m",
      descriptor = "I"
   )
   public static int field9818;
   @OriginalMember(
      owner = "client!ffa",
      name = "i",
      descriptor = "I"
   )
   public static int field9819;
   @OriginalMember(
      owner = "client!ffa",
      name = "l",
      descriptor = "Lgv;"
   )
   public static class12 field9823;

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4839(byte arg0) {
      try {
         class304 var2 = this.field9820;
         synchronized(this.field9820) {
            this.field9820.method2554(-100);
         }

         ++field9818;
         class304 var3 = this.field9821;
         synchronized(this.field9821) {
            int var4 = -100 % ((-19 - arg0) / 38);
            this.field9821.method2554(-122);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9825[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "b",
      descriptor = "(II)Lafa;"
   )
   public final class64 method4840(int arg0, int arg1) {
      try {
         ++field9814;
         class304 var3 = this.field9821;
         synchronized(this.field9821) {
            class64 var4 = (class64)this.field9821.method2544(false, (long)arg1);
            if (var4 == null) {
               var4 = new class64(arg1);
               this.field9821.method2545((long)arg1, 111, var4);
            }

            if (!var4.method492((byte)122)) {
               return null;
            } else {
               if (arg0 != -31457) {
                  field9823 = null;
               }

               return var4;
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field9825[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4841(int arg0, int arg1) {
      try {
         ++field9812;
         class304 var3 = this.field9820;
         synchronized(this.field9820) {
            if (arg1 != 2) {
               this.field9821 = null;
            }

            this.field9820.method2552(arg0, 21533);
         }

         class304 var4 = this.field9821;
         synchronized(this.field9821) {
            this.field9821.method2552(arg0, 21533);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9825[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "c",
      descriptor = "(II)I"
   )
   public static final int method4842(int arg0, int arg1) {
      try {
         if (arg1 != 0) {
            return -103;
         } else {
            ++field9819;
            if (~arg0 > -97) {
               return 0;
            } else {
               return ~arg0 > -129 ? 2 : 3;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9825[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4843(boolean arg0) {
      try {
         ++field9817;
         class304 var2 = this.field9820;
         synchronized(this.field9820) {
            this.field9820.method2551(true);
         }

         class304 var3 = this.field9821;
         synchronized(this.field9821) {
            if (arg0) {
               this.field9820 = null;
            }

            this.field9821.method2551(true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9825[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4844(int arg0) {
      try {
         if (arg0 != -24524) {
            method4844(-45);
         }

         field9824 = null;
         field9823 = null;
         field9822 = null;
         field9816 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9825[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(IZ)Lvg;"
   )
   public final class82 method4845(int arg0, boolean arg1) {
      try {
         ++field9815;
         class304 var3 = this.field9820;
         class82 var4;
         synchronized(this.field9820) {
            var4 = (class82)this.field9820.method2544(arg1, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field9813;
            byte[] var6;
            synchronized(this.field9813) {
               var6 = this.field9813.method5017(class185.method1667(arg0, -20728), class783.method5692((byte)-58, arg0), (byte)71);
            }

            class82 var7 = new class82();
            var7.field1182 = arg0;
            if (var6 != null) {
               var7.method799(new class354(var6), -70);
            }

            var7.method797(0);
            class304 var8 = this.field9820;
            synchronized(this.field9820) {
               this.field9820.method2545((long)arg0, 108, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field9825[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Lrr;Lrr;)V"
   )
   public class657(class311 arg0, int arg1, class678 arg2, class678 arg3, class678 arg4) {
      try {
         this.field9813 = arg2;
         if (this.field9813 != null) {
            int var6 = this.field9813.method5008(-1) + -1;
            this.field9813.method4998((byte)-82, var6);
         }

         class674.method4966(2, (byte)92, arg3, arg4);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9825[8] + (arg0 != null ? field9825[7] : field9825[9]) + ',' + arg1 + ',' + (arg2 != null ? field9825[7] : field9825[9]) + ',' + (arg3 != null ? field9825[7] : field9825[9]) + ',' + (arg4 != null ? field9825[7] : field9825[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4846(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4847(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

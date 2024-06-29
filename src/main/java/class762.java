import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class762 {
   @OriginalMember(
      owner = "client!bo",
      name = "j",
      descriptor = "Ldp;"
   )
   private class3 field11260 = new class3();
   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11264 = new String[]{method5532(method5531("7kS'J")), method5532(method5531("7kS-J")), method5532(method5531("7kS+J")), method5532(method5531("7kS*J")), method5532(method5531("7kS.J")), method5532(method5531("7kS,J")), method5532(method5531(";q\u0011\u0003")), method5532(method5531(".*SA\u001f")), method5532(method5531("7kS(J")), method5532(method5531("7kSS\u000b;m\tQJ")), method5532(method5531("7kS)J"))};
   @OriginalMember(
      owner = "client!bo",
      name = "d",
      descriptor = "I"
   )
   public static int field11253;
   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "I"
   )
   public static int field11254;
   @OriginalMember(
      owner = "client!bo",
      name = "k",
      descriptor = "I"
   )
   public static int field11255;
   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "I"
   )
   public static int field11256;
   @OriginalMember(
      owner = "client!bo",
      name = "c",
      descriptor = "I"
   )
   public static int field11257;
   @OriginalMember(
      owner = "client!bo",
      name = "h",
      descriptor = "I"
   )
   public static int field11258;
   @OriginalMember(
      owner = "client!bo",
      name = "g",
      descriptor = "I"
   )
   public static int field11259;
   @OriginalMember(
      owner = "client!bo",
      name = "f",
      descriptor = "I"
   )
   public static int field11261;
   @OriginalMember(
      owner = "client!bo",
      name = "i",
      descriptor = "I"
   )
   public static int field11262;
   @OriginalMember(
      owner = "client!bo",
      name = "e",
      descriptor = "Ldp;"
   )
   private class3 field11263;

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(B)Ldp;",
      line = 6
   )
   public final class3 method5523(byte arg0) {
      try {
         ++field11259;
         class3 var2 = this.field11260.field20;
         if (this.field11260 == var2) {
            this.field11263 = null;
            return null;
         } else {
            if (arg0 != 21) {
               this.method5527((byte)-102);
            }

            this.field11263 = var2.field20;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11264[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(Z)I",
      line = 26
   )
   public final int method5524(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11258;
         int var3 = 0;
         class3 var4 = this.field11260.field14;
         if (var2) {
            ++var3;
            var4 = var4.field14;
         }

         while(true) {
            if (this.field11260 == var4) {
               if (!var2) {
                  if (!arg0) {
                     field11256 = -72;
                  }

                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field14;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11264[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(I)V",
      line = 47
   )
   public final void method5525(int arg0) {
      boolean var2 = client.field4360;

      try {
         while(true) {
            class3 var3 = this.field11260.field14;
            if (this.field11260 != var3) {
               var3.method12((byte)-127);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ++field11254;
            break;
         }

         if (arg0 != 6798) {
            this.field11263 = null;
         }

         this.field11263 = null;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11264[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(Z)Ldp;",
      line = 78
   )
   public final class3 method5526(boolean arg0) {
      try {
         if (!arg0) {
            this.method5528(-27);
         }

         ++field11257;
         class3 var2 = this.field11260.field14;
         if (this.field11260 == var2) {
            return null;
         } else {
            var2.method12((byte)55);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11264[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(B)Ldp;",
      line = 102
   )
   public final class3 method5527(byte arg0) {
      try {
         ++field11262;
         class3 var2 = this.field11263;
         if (this.field11260 == var2) {
            this.field11263 = null;
            return null;
         } else {
            this.field11263 = var2.field14;
            if (arg0 != 45) {
               field11256 = -54;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11264[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(I)Z",
      line = 123
   )
   public final boolean method5528(int arg0) {
      try {
         ++field11255;
         int var2 = 8 / ((61 - arg0) / 62);
         return this.field11260.field14 == this.field11260;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11264[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "c",
      descriptor = "(B)Ldp;",
      line = 136
   )
   public final class3 method5529(byte arg0) {
      try {
         ++field11261;
         if (arg0 != -42) {
            this.method5525(115);
         }

         class3 var2 = this.field11260.field14;
         if (this.field11260 == var2) {
            this.field11263 = null;
            return null;
         } else {
            this.field11263 = var2.field14;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11264[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "<init>",
      descriptor = "()V",
      line = 177
   )
   public class762() {
      try {
         this.field11260.field20 = this.field11260;
         this.field11260.field14 = this.field11260;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11264[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(ILdp;)V",
      line = 159
   )
   public final void method5530(int arg0, class3 arg1) {
      try {
         if (arg0 < 113) {
            this.field11263 = null;
         }

         ++field11253;
         if (arg1.field20 != null) {
            arg1.method12((byte)119);
         }

         arg1.field14 = this.field11260;
         arg1.field20 = this.field11260.field20;
         arg1.field20.field14 = arg1;
         arg1.field14.field20 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11264[5] + arg0 + ',' + (arg1 != null ? field11264[7] : field11264[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5531(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5532(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

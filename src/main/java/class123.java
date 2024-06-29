import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class123 {
   @OriginalMember(
      owner = "client!f",
      name = "g",
      descriptor = "Llj;"
   )
   private class304 field1761 = new class304(64);
   @OriginalMember(
      owner = "client!f",
      name = "i",
      descriptor = "Lrr;"
   )
   private class678 field1756;
   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1762 = new String[]{method1146(method1145("+\u0012H\u0012")), method1146(method1145(">I\nPu")), method1146(method1145("#I\u0018\u0017f,\u0013\u001aV")), method1146(method1145("#IaV")), method1146(method1145("#IeV")), method1146(method1145("#IcV")), method1146(method1145("#IgV")), method1146(method1145("#IbV")), method1146(method1145("#IfV")), method1146(method1145("y\u0004K\u00125#\u0001B\u0018n#Y")), method1146(method1145("eO")), method1146(method1145("eJ\u001a^4&\bHCn#\u0001B\u0018n{")), method1146(method1145("y\u0004K\u00125&\u0004G\u001dk&Y")), method1146(method1145("#I`V"))};
   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "I"
   )
   public static int field1753;
   @OriginalMember(
      owner = "client!f",
      name = "f",
      descriptor = "I"
   )
   public static int field1754;
   @OriginalMember(
      owner = "client!f",
      name = "c",
      descriptor = "I"
   )
   public static int field1755;
   @OriginalMember(
      owner = "client!f",
      name = "b",
      descriptor = "I"
   )
   public static int field1757;
   @OriginalMember(
      owner = "client!f",
      name = "d",
      descriptor = "I"
   )
   public static int field1758;
   @OriginalMember(
      owner = "client!f",
      name = "e",
      descriptor = "I"
   )
   public static int field1759;
   @OriginalMember(
      owner = "client!f",
      name = "h",
      descriptor = "I"
   )
   public static int field1760;

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(ZILwo;)V",
      line = 3
   )
   public static final void method1138(boolean param0, int param1, class9 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!f",
      name = "b",
      descriptor = "(II)Z",
      line = 158
   )
   public static final boolean method1139(int arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field1760;
         if (arg1 != 0) {
            method1141((String)null, false);
         }

         class185 var3 = (class185)class326.field4958.method4972((byte)-84);
         boolean var10000;
         if (var2) {
            var10000 = class115.method1069(var3.field2896, (byte)67);
         } else if (var3 == null) {
            var10000 = false;
            if (!var2) {
               return false;
            }
         } else {
            var10000 = class115.method1069(var3.field2896, (byte)67);
         }

         while(!var10000 || ~((long)arg0) != ~var3.field2907) {
            var3 = (class185)class326.field4958.method4975((byte)94);
            if (var3 == null) {
               var10000 = false;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = class115.method1069(var3.field2896, (byte)67);
            }
         }

         return true;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1762[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(II)Leaa;",
      line = 181
   )
   public final class756 method1140(int arg0, int arg1) {
      try {
         ++field1754;
         class304 var3 = this.field1761;
         class756 var4;
         synchronized(this.field1761) {
            if (arg1 != 2000) {
               this.field1761 = null;
            }

            var4 = (class756)this.field1761.method2544(false, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field1756;
            byte[] var6;
            synchronized(this.field1756) {
               var6 = this.field1756.method5017(31, arg0, (byte)71);
            }

            class756 var7 = new class756();
            if (var6 != null) {
               var7.method5546(arg1 + -2000, new class354(var6));
            }

            class304 var8 = this.field1761;
            synchronized(this.field1761) {
               this.field1761.method2545((long)arg0, 125, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field1762[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)I",
      line = 212
   )
   public static final int method1141(String arg0, boolean arg1) {
      try {
         if (arg1) {
            return -26;
         } else {
            ++field1758;
            return 2 + arg0.length();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1762[4] + (arg0 != null ? field1762[1] : field1762[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "c",
      descriptor = "(II)V",
      line = 224
   )
   public final void method1142(int arg0, int arg1) {
      try {
         class304 var3 = this.field1761;
         synchronized(this.field1761) {
            if (arg1 != -1) {
               this.field1761 = null;
            }

            this.field1761.method2552(arg0, arg1 + 21534);
         }

         ++field1759;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1762[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(B)V",
      line = 237
   )
   public final void method1143(byte arg0) {
      try {
         ++field1757;
         class304 var2 = this.field1761;
         synchronized(this.field1761) {
            this.field1761.method2551(true);
            if (arg0 != -57) {
               this.method1144((byte)-125);
            }

         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1762[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "b",
      descriptor = "(B)V",
      line = 259
   )
   public final void method1144(byte arg0) {
      try {
         ++field1755;
         class304 var2 = this.field1761;
         synchronized(this.field1761) {
            if (arg0 > -102) {
               method1138(true, -34, (class9)null);
            }

            this.field1761.method2554(-107);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1762[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 275
   )
   public class123(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field1756 = arg2;
         this.field1756.method4998((byte)-82, 31);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1762[2] + (arg0 != null ? field1762[1] : field1762[0]) + ',' + arg1 + ',' + (arg2 != null ? field1762[1] : field1762[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1145(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1146(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

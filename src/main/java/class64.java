import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class64 extends class588 {
   @OriginalMember(
      owner = "client!tga",
      name = "k",
      descriptor = "I"
   )
   private int field779;
   @OriginalMember(
      owner = "client!tga",
      name = "m",
      descriptor = "I"
   )
   private int field786;
   @OriginalMember(
      owner = "client!tga",
      name = "n",
      descriptor = "Lea;"
   )
   private class573 field776;
   @OriginalMember(
      owner = "client!tga",
      name = "i",
      descriptor = "I"
   )
   private int field774;
   @OriginalMember(
      owner = "client!tga",
      name = "t",
      descriptor = "I"
   )
   private int field777;
   @OriginalMember(
      owner = "client!tga",
      name = "v",
      descriptor = "I"
   )
   private int field775;
   @OriginalMember(
      owner = "client!tga",
      name = "l",
      descriptor = "I"
   )
   private int field784;
   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field787 = new String[]{method488(method487("\u0016\u0011\u0019\f|J")), method488(method487("\u0016\u0011\u0019\f}J")), method488(method487("\u0016\u0011\u0019\f\u007fJ")), method488(method487("\u0016\u0011\u0019\f\u0002\u000b\u0018\u0011V\u0000J")), method488(method487("\f\u0003\u0014N")), method488(method487("\u0019XV\fC")), method488(method487("\u0016\u0011\u0019\fzJ"))};
   @OriginalMember(
      owner = "client!tga",
      name = "u",
      descriptor = "I"
   )
   public static int field772 = -1;
   @OriginalMember(
      owner = "client!tga",
      name = "s",
      descriptor = "Leg;"
   )
   public static class118 field781 = new class118(47, -1);
   @OriginalMember(
      owner = "client!tga",
      name = "p",
      descriptor = "Lwu;"
   )
   public static class395 field783 = new class395(0, 2, 2, 1);
   @OriginalMember(
      owner = "client!tga",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field785 = new int[13];
   @OriginalMember(
      owner = "client!tga",
      name = "o",
      descriptor = "I"
   )
   public static int field773;
   @OriginalMember(
      owner = "client!tga",
      name = "j",
      descriptor = "I"
   )
   public static int field778;
   @OriginalMember(
      owner = "client!tga",
      name = "r",
      descriptor = "I"
   )
   public static int field782;
   @OriginalMember(
      owner = "client!tga",
      name = "h",
      descriptor = "Lwfa;"
   )
   private class212 field780;
   @OriginalMember(
      owner = "client!tga",
      name = "g",
      descriptor = "Lbg;"
   )
   public static class492 field771;

   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method483(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "(I)Lwfa;"
   )
   public final class212 method484(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field782;
         if (this.field780 == null) {
            class162 var3;
            byte var4;
            int var5;
            int var9;
            label89: {
               var3 = this.field776.field802;
               class156.field2226[0] = this.field779;
               class156.field2226[4] = this.field775;
               class156.field2226[2] = this.field784;
               class156.field2226[3] = this.field774;
               class156.field2226[1] = this.field786;
               class156.field2226[5] = this.field777;
               var4 = 0;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method1353(class156.field2226[var6], (byte)124)) {
                     return null;
                  }
               } else if (var6 >= 6) {
                  var9 = 0;
                  if (!var2) {
                     break label89;
                  }
               } else if (!var3.method1353(class156.field2226[var6], (byte)124)) {
                  return null;
               }

               while(true) {
                  class317 var7 = var3.method1354(class156.field2226[var6], (byte)-109);
                  int var8 = !var7.field4318 ? 128 : 64;
                  if (var5 < var8) {
                     var5 = var8;
                  }

                  if (~var7.field4322 < -1) {
                     var4 = 1;
                  }

                  ++var6;
                  if (var6 >= 6) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method1353(class156.field2226[var6], (byte)124)) {
                     return null;
                  }
               }
            }

            if (var2) {
               class157.field2245[var9] = var3.method1350(1.0F, class156.field2226[var9], var5, var5, (byte)15, false);
               ++var9;
            }

            while(true) {
               while(~var9 > -7) {
                  class157.field2245[var9] = var3.method1350(1.0F, class156.field2226[var9], var5, var5, (byte)15, false);
                  ++var9;
               }

               if (!var2) {
                  this.field780 = new class212(this.field776, 6407, var5, ~var4 != -1, class157.field2245);
                  break;
               }

               ++var9;
            }
         }

         if (arg0 != -10) {
            this.field777 = 12;
         }

         return this.field780;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field787[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method485(byte arg0) {
      try {
         if (class218.field3125 != null) {
            class218.field3125.method1544((byte)-76);
         }

         ++field773;
         if (class393.field5688 != null) {
            class393.field5688.method1544((byte)-76);
         }

         if (arg0 <= 34) {
            field772 = -91;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field787[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method486(int arg0) {
      try {
         field771 = null;
         if (arg0 <= 22) {
            method485((byte)114);
         }

         field785 = null;
         field783 = null;
         field781 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field787[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "<init>",
      descriptor = "(Lea;IIIIII)V"
   )
   public class64(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field779 = arg1;
         this.field786 = arg2;
         this.field776 = arg0;
         this.field774 = arg4;
         this.field777 = arg6;
         this.field775 = arg5;
         this.field784 = arg3;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field787[3] + (arg0 != null ? field787[5] : field787[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method488(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

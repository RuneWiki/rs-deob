import java.awt.Color;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class233 {
   @OriginalMember(
      owner = "client!ifa",
      name = "r",
      descriptor = "[I"
   )
   private int[] field3571 = new int[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3577 = new String[]{method2010(method2009("':iCzf")), method2010(method2009("5r&CC")), method2010(method2009("':iCvf")), method2010(method2009(" )d\u0001")), method2010(method2009("':iCwf")), method2010(method2009("':iC\u007ff")), method2010(method2009("':iC}f")), method2010(method2009("':iC{f")), method2010(method2009("':iCxf")), method2010(method2009("':iC|f")), method2010(method2009("':iCyf"))};
   @OriginalMember(
      owner = "client!ifa",
      name = "h",
      descriptor = "I"
   )
   public static int field3560 = 1408;
   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field3563 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   @OriginalMember(
      owner = "client!ifa",
      name = "g",
      descriptor = "I"
   )
   public static int field3559;
   @OriginalMember(
      owner = "client!ifa",
      name = "d",
      descriptor = "I"
   )
   public static int field3561;
   @OriginalMember(
      owner = "client!ifa",
      name = "b",
      descriptor = "I"
   )
   public static int field3562;
   @OriginalMember(
      owner = "client!ifa",
      name = "i",
      descriptor = "I"
   )
   public static int field3564;
   @OriginalMember(
      owner = "client!ifa",
      name = "o",
      descriptor = "I"
   )
   public static int field3565;
   @OriginalMember(
      owner = "client!ifa",
      name = "n",
      descriptor = "I"
   )
   public static int field3567;
   @OriginalMember(
      owner = "client!ifa",
      name = "m",
      descriptor = "I"
   )
   public static int field3569;
   @OriginalMember(
      owner = "client!ifa",
      name = "p",
      descriptor = "I"
   )
   public static int field3574;
   @OriginalMember(
      owner = "client!ifa",
      name = "q",
      descriptor = "I"
   )
   public static int field3575;
   @OriginalMember(
      owner = "client!ifa",
      name = "e",
      descriptor = "Lega;"
   )
   public class486 field3572;
   @OriginalMember(
      owner = "client!ifa",
      name = "c",
      descriptor = "[I"
   )
   private int[] field3573;
   @OriginalMember(
      owner = "client!ifa",
      name = "l",
      descriptor = "[S"
   )
   private short[] field3566;
   @OriginalMember(
      owner = "client!ifa",
      name = "f",
      descriptor = "[S"
   )
   private short[] field3568;
   @OriginalMember(
      owner = "client!ifa",
      name = "j",
      descriptor = "[S"
   )
   private short[] field3570;
   @OriginalMember(
      owner = "client!ifa",
      name = "k",
      descriptor = "[S"
   )
   private short[] field3576;

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(Ljava/io/File;II)[B"
   )
   public static final byte[] method2000(File arg0, int arg1, int arg2) {
      try {
         ++field3562;

         try {
            if (arg2 != -21839) {
               return null;
            } else {
               byte[] var3 = new byte[arg1];
               class198.method1747(arg0, var3, 0, arg1);
               return var3;
            }
         } catch (IOException var5) {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3577[2] + (arg0 != null ? field3577[1] : field3577[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "c",
      descriptor = "(B)Lnga;"
   )
   public final class159 method2001(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field3565;
         if (this.field3573 == null) {
            return null;
         } else {
            class159[] var3 = new class159[this.field3573.length];
            class678 var4 = this.field3572.field7385;
            synchronized(this.field3572.field7385){}

            int var5;
            Throwable var10000;
            boolean var10001;
            try {
               var5 = 0;
               if (arg0 < 120) {
                  return null;
               }
            } catch (Throwable var28) {
               var10000 = var28;
               var10001 = false;
               throw var10000;
            }

            while(true) {
               label431: {
                  boolean var30;
                  try {
                     if (~this.field3573.length < ~var5) {
                        var3[var5] = class489.method3795(this.field3572.field7385, this.field3573[var5], true, 0);
                        break label431;
                     }

                     var30 = var2;
                  } catch (Throwable var27) {
                     var10000 = var27;
                     var10001 = false;
                     break;
                  }

                  if (!var30) {
                     int var7 = 0;
                     if (var2) {
                        if (~var3[var7].field2408 > -14) {
                           var3[var7].method1426(2, 0);
                        }

                        ++var7;
                     }

                     while(true) {
                        byte var32;
                        int var31;
                        if (this.field3573.length <= var7) {
                           var31 = ~var3.length;
                           var32 = -2;
                           if (!var2) {
                              class159 var8;
                              if (var31 == -2) {
                                 var8 = var3[0];
                              } else {
                                 var8 = new class159(var3, var3.length);
                              }

                              if (var8 == null) {
                                 return null;
                              }

                              if (this.field3566 != null) {
                                 int var9 = 0;
                                 if (var2 || this.field3566.length > var9) {
                                    do {
                                       var8.method1435(this.field3566[var9], -23406, this.field3570[var9]);
                                       ++var9;
                                    } while(this.field3566.length > var9);
                                 }
                              }

                              if (this.field3568 != null) {
                                 int var10 = 0;
                                 if (var2 || ~this.field3568.length < ~var10) {
                                    do {
                                       var8.method1432(this.field3576[var10], this.field3568[var10], 0);
                                       ++var10;
                                    } while(~this.field3568.length < ~var10);
                                 }
                              }

                              return var8;
                           }
                        } else {
                           var31 = ~var3[var7].field2408;
                           var32 = -14;
                        }

                        if (var31 > var32) {
                           var3[var7].method1426(2, 0);
                        }

                        ++var7;
                     }
                  }
               }

               try {
                  ++var5;
               } catch (Throwable var26) {
                  var10000 = var26;
                  var10001 = false;
                  break;
               }
            }

            throw var10000;
         }
      } catch (RuntimeException var29) {
         throw class482.method3757(var29, field3577[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(Lica;II)V"
   )
   private final void method2002(class354 arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         label139: {
            if (~arg1 != -2) {
               if (~arg1 == -3) {
                  int var5 = arg0.method2855(-31007);
                  this.field3573 = new int[var5];
                  int var6 = 0;
                  if (var4) {
                     this.field3573[var6] = arg0.method2848(-100);
                     ++var6;
                  }

                  while(true) {
                     while(var5 > var6) {
                        this.field3573[var6] = arg0.method2848(-100);
                        ++var6;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label139;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               if (~arg1 == -4) {
                  break label139;
               }

               if (arg1 != 40) {
                  if (arg1 == 41) {
                     int var7 = arg0.method2855(-31007);
                     this.field3576 = new short[var7];
                     this.field3568 = new short[var7];
                     int var8 = 0;
                     if (var4) {
                        this.field3568[var8] = (short)arg0.method2848(-119);
                        this.field3576[var8] = (short)arg0.method2848(-93);
                        ++var8;
                     }

                     while(true) {
                        while(~var8 > ~var7) {
                           this.field3568[var8] = (short)arg0.method2848(-119);
                           this.field3576[var8] = (short)arg0.method2848(-93);
                           ++var8;
                        }

                        if (!var4) {
                           if (!var4) {
                              break label139;
                           }
                           break;
                        }

                        ++var8;
                     }
                  }

                  if (arg1 < 60 || ~arg1 <= -71) {
                     break label139;
                  }

                  this.field3571[arg1 + -60] = arg0.method2848(-118);
                  if (!var4) {
                     break label139;
                  }
               }

               int var9 = arg0.method2855(arg2 + -31006);
               this.field3566 = new short[var9];
               this.field3570 = new short[var9];
               int var10 = 0;
               if (var4) {
                  this.field3566[var10] = (short)arg0.method2848(-124);
                  this.field3570[var10] = (short)arg0.method2848(class419.method3339(arg2, 108));
                  ++var10;
               }

               while(true) {
                  while(var10 < var9) {
                     this.field3566[var10] = (short)arg0.method2848(-124);
                     this.field3570[var10] = (short)arg0.method2848(class419.method3339(arg2, 108));
                     ++var10;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label139;
                     }
                     break;
                  }

                  ++var10;
               }
            }

            arg0.method2855(-31007);
         }

         ++field3561;
         if (arg2 != -1) {
            field3563 = null;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field3577[8] + (arg0 != null ? field3577[1] : field3577[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method2003(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 <= 99) {
            field3563 = null;
         }

         ++field3567;
         if (!class511.method3973(arg2, arg0, (byte)-92)) {
            return false;
         } else {
            return ~(36864 & arg0) != -1 | class126.method1188(arg2, true, arg0) | class262.method2275(-8, arg0, arg2) ? true : ~(55 & arg2) == -1 & (~(8192 & arg0) != -1 | class187.method1679(arg2, arg0, 127) | class681.method5041(-24, arg2, arg0));
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3577[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2004(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(I)Lnga;"
   )
   public final class159 method2005(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method2006(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method2007(class354 arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         ++field3569;

         while(true) {
            int var4 = arg0.method2855(-31007);
            if (~var4 != -1) {
               this.method2002(arg0, var4, -1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 != -46) {
               this.field3568 = null;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3577[4] + (arg0 != null ? field3577[1] : field3577[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2008(boolean arg0) {
      try {
         if (arg0) {
            field3563 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3577[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2009(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2010(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}

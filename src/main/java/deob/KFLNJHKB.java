package deob;

@ObfuscatedName("KFLNJHKB")
public class KFLNJHKB {

	@ObfuscatedName("KFLNJHKB.g")
	public int field782 = 0;

	@ObfuscatedName("KFLNJHKB.h")
	public int field783 = 0;

	@ObfuscatedName("KFLNJHKB.i")
	public int field784;

	@ObfuscatedName("KFLNJHKB.j")
	public int field785;

	@ObfuscatedName("KFLNJHKB.k")
	public int[][] field786;

	public KFLNJHKB(int arg0, int arg1) {
		field784 = arg0;
		field785 = arg1;
		field786 = new int[field784][field785];
		method344();
	}

	@ObfuscatedName("KFLNJHKB.a()V")
	public void method344() {
		for (int var1 = 0; var1 < field784; var1++) {
			for (int var2 = 0; var2 < field785; var2++) {
				if (var1 == 0 || var2 == 0 || field784 - 1 == var1 || field785 - 1 == var2) {
					field786[var1][var2] = 0xFFFFFF;
				} else {
					field786[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("KFLNJHKB.a(IIZIII)V")
	public void method345(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg4 -= field782;
		arg3 -= field783;
		if (arg0 == 0) {
			if (arg1 == 0) {
				method348(arg4, arg3, 128);
				method348(arg4 - 1, arg3, 8);
			}

			if (arg1 == 1) {
				method348(arg4, arg3, 2);
				method348(arg4, arg3 + 1, 32);
			}

			if (arg1 == 2) {
				method348(arg4, arg3, 8);
				method348(arg4 + 1, arg3, 128);
			}

			if (arg1 == 3) {
				method348(arg4, arg3, 32);
				method348(arg4, arg3 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg1 == 0) {
				method348(arg4, arg3, 1);
				method348(arg4 - 1, arg3 + 1, 16);
			}

			if (arg1 == 1) {
				method348(arg4, arg3, 4);
				method348(arg4 + 1, arg3 + 1, 64);
			}

			if (arg1 == 2) {
				method348(arg4, arg3, 16);
				method348(arg4 + 1, arg3 - 1, 1);
			}

			if (arg1 == 3) {
				method348(arg4, arg3, 64);
				method348(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				method348(arg4, arg3, 130);
				method348(arg4 - 1, arg3, 8);
				method348(arg4, arg3 + 1, 32);
			}

			if (arg1 == 1) {
				method348(arg4, arg3, 10);
				method348(arg4, arg3 + 1, 32);
				method348(arg4 + 1, arg3, 128);
			}

			if (arg1 == 2) {
				method348(arg4, arg3, 40);
				method348(arg4 + 1, arg3, 128);
				method348(arg4, arg3 - 1, 2);
			}

			if (arg1 == 3) {
				method348(arg4, arg3, 160);
				method348(arg4, arg3 - 1, 2);
				method348(arg4 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg1 == 0) {
					method348(arg4, arg3, 0x10000);
					method348(arg4 - 1, arg3, 4096);
				}

				if (arg1 == 1) {
					method348(arg4, arg3, 1024);
					method348(arg4, arg3 + 1, 16384);
				}

				if (arg1 == 2) {
					method348(arg4, arg3, 4096);
					method348(arg4 + 1, arg3, 0x10000);
				}

				if (arg1 == 3) {
					method348(arg4, arg3, 16384);
					method348(arg4, arg3 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg1 == 0) {
					method348(arg4, arg3, 512);
					method348(arg4 - 1, arg3 + 1, 8192);
				}

				if (arg1 == 1) {
					method348(arg4, arg3, 2048);
					method348(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg1 == 2) {
					method348(arg4, arg3, 8192);
					method348(arg4 + 1, arg3 - 1, 512);
				}

				if (arg1 == 3) {
					method348(arg4, arg3, 32768);
					method348(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg1 == 0) {
					method348(arg4, arg3, 66560);
					method348(arg4 - 1, arg3, 4096);
					method348(arg4, arg3 + 1, 16384);
				}

				if (arg1 == 1) {
					method348(arg4, arg3, 5120);
					method348(arg4, arg3 + 1, 16384);
					method348(arg4 + 1, arg3, 0x10000);
				}

				if (arg1 == 2) {
					method348(arg4, arg3, 20480);
					method348(arg4 + 1, arg3, 0x10000);
					method348(arg4, arg3 - 1, 1024);
				}

				if (arg1 == 3) {
					method348(arg4, arg3, 81920);
					method348(arg4, arg3 - 1, 1024);
					method348(arg4 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("KFLNJHKB.a(ZIIIIIB)V")
	public void method346(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg5 -= field782;
		arg1 -= field783;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg3;
			arg3 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg5; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < field784) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field785) {
						method348(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("KFLNJHKB.a(III)V")
	public void method347(int arg0, int arg1) {
		arg0 -= field782;
		arg1 -= field783;
		field786[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("KFLNJHKB.b(III)V")
	public void method348(int arg0, int arg1, int arg2) {
		field786[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("KFLNJHKB.a(IIIZII)V")
	public void method349(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg4 -= field782;
		arg0 -= field783;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method351(arg4, arg0, 128);
				method351(arg4 - 1, arg0, 8);
			}

			if (arg2 == 1) {
				method351(arg4, arg0, 2);
				method351(arg4, arg0 + 1, 32);
			}

			if (arg2 == 2) {
				method351(arg4, arg0, 8);
				method351(arg4 + 1, arg0, 128);
			}

			if (arg2 == 3) {
				method351(arg4, arg0, 32);
				method351(arg4, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method351(arg4, arg0, 1);
				method351(arg4 - 1, arg0 + 1, 16);
			}

			if (arg2 == 1) {
				method351(arg4, arg0, 4);
				method351(arg4 + 1, arg0 + 1, 64);
			}

			if (arg2 == 2) {
				method351(arg4, arg0, 16);
				method351(arg4 + 1, arg0 - 1, 1);
			}

			if (arg2 == 3) {
				method351(arg4, arg0, 64);
				method351(arg4 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method351(arg4, arg0, 130);
				method351(arg4 - 1, arg0, 8);
				method351(arg4, arg0 + 1, 32);
			}

			if (arg2 == 1) {
				method351(arg4, arg0, 10);
				method351(arg4, arg0 + 1, 32);
				method351(arg4 + 1, arg0, 128);
			}

			if (arg2 == 2) {
				method351(arg4, arg0, 40);
				method351(arg4 + 1, arg0, 128);
				method351(arg4, arg0 - 1, 2);
			}

			if (arg2 == 3) {
				method351(arg4, arg0, 160);
				method351(arg4, arg0 - 1, 2);
				method351(arg4 - 1, arg0, 8);
			}
		}

		if (arg3) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method351(arg4, arg0, 0x10000);
					method351(arg4 - 1, arg0, 4096);
				}

				if (arg2 == 1) {
					method351(arg4, arg0, 1024);
					method351(arg4, arg0 + 1, 16384);
				}

				if (arg2 == 2) {
					method351(arg4, arg0, 4096);
					method351(arg4 + 1, arg0, 0x10000);
				}

				if (arg2 == 3) {
					method351(arg4, arg0, 16384);
					method351(arg4, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method351(arg4, arg0, 512);
					method351(arg4 - 1, arg0 + 1, 8192);
				}

				if (arg2 == 1) {
					method351(arg4, arg0, 2048);
					method351(arg4 + 1, arg0 + 1, 32768);
				}

				if (arg2 == 2) {
					method351(arg4, arg0, 8192);
					method351(arg4 + 1, arg0 - 1, 512);
				}

				if (arg2 == 3) {
					method351(arg4, arg0, 32768);
					method351(arg4 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method351(arg4, arg0, 66560);
					method351(arg4 - 1, arg0, 4096);
					method351(arg4, arg0 + 1, 16384);
				}

				if (arg2 == 1) {
					method351(arg4, arg0, 5120);
					method351(arg4, arg0 + 1, 16384);
					method351(arg4 + 1, arg0, 0x10000);
				}

				if (arg2 == 2) {
					method351(arg4, arg0, 20480);
					method351(arg4 + 1, arg0, 0x10000);
					method351(arg4, arg0 - 1, 1024);
				}

				if (arg2 == 3) {
					method351(arg4, arg0, 81920);
					method351(arg4, arg0 - 1, 1024);
					method351(arg4 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("KFLNJHKB.a(IIIIZBI)V")
	public void method350(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg2 -= field782;
		arg1 -= field783;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg2; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field784) {
				for (int var10 = arg1; var10 < arg1 + arg5; var10++) {
					if (var10 >= 0 && var10 < field785) {
						method351(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("KFLNJHKB.a(IIBI)V")
	public void method351(int arg0, int arg1, int arg2) {
		field786[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("KFLNJHKB.a(IBI)V")
	public void method352(int arg0, int arg1) {
		arg0 -= field782;
		arg1 -= field783;
		field786[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("KFLNJHKB.a(IZIIIII)Z")
	public boolean method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg3 == arg5) {
			return true;
		}

		arg0 -= field782;
		arg3 -= field783;
		arg4 -= field782;
		arg5 -= field783;
		if (arg1 == 0) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field786[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field786[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 == arg4 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field786[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field786[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 == arg4 && arg5 - 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field786[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 - 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field786[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 - 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field786[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field786[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg0 == arg4 && arg5 + 1 == arg3 && (field786[arg0][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg5 - 1 == arg3 && (field786[arg0][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg0 && arg3 == arg5 && (field786[arg0][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("KFLNJHKB.a(IIZIIII)Z")
	public boolean method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg3 == arg4) {
			return true;
		}

		arg1 -= field782;
		arg3 -= field783;
		arg0 -= field782;
		arg4 -= field783;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg2 = arg2 + 2 & 0x3;
			}

			if (arg2 == 0) {
				if (arg0 + 1 == arg1 && arg3 == arg4 && (field786[arg1][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg3 && (field786[arg1][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 - 1 == arg1 && arg3 == arg4 && (field786[arg1][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 - 1 == arg3 && (field786[arg1][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg0 - 1 == arg1 && arg3 == arg4 && (field786[arg1][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg3 && (field786[arg1][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 + 1 == arg1 && arg3 == arg4 && (field786[arg1][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg4 + 1 == arg3 && (field786[arg1][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg0 == arg1 && arg4 + 1 == arg3 && (field786[arg1][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg4 - 1 == arg3 && (field786[arg1][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg3 == arg4 && (field786[arg1][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg3 == arg4 && (field786[arg1][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("KFLNJHKB.a(IIIIIIIB)Z")
	public boolean method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg3 - 1;
		int var9 = arg1 + arg6 - 1;
		if (arg5 >= arg2 && arg5 <= var8 && arg4 >= arg6 && arg4 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg5 && arg4 >= arg6 && arg4 <= var9 && (field786[arg5 - field782][arg4 - field783] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg4 >= arg6 && arg4 <= var9 && (field786[arg5 - field782][arg4 - field783] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg4 && arg5 >= arg2 && arg5 <= var8 && (field786[arg5 - field782][arg4 - field783] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg5 >= arg2 && arg5 <= var8 && (field786[arg5 - field782][arg4 - field783] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}

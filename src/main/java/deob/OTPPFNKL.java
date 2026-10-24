package deob;

@ObfuscatedName("OTPPFNKL")
public class OTPPFNKL {

	@ObfuscatedName("OTPPFNKL.g")
	public int field1065 = 0;

	@ObfuscatedName("OTPPFNKL.h")
	public int field1066 = 0;

	@ObfuscatedName("OTPPFNKL.i")
	public int field1067;

	@ObfuscatedName("OTPPFNKL.j")
	public int field1068;

	@ObfuscatedName("OTPPFNKL.k")
	public int[][] field1069;

	public OTPPFNKL(int arg0, int arg1) {
		field1067 = arg0;
		field1068 = arg1;
		field1069 = new int[field1067][field1068];
		method353();
	}

	@ObfuscatedName("OTPPFNKL.a()V")
	public void method353() {
		for (int var1 = 0; var1 < field1067; var1++) {
			for (int var2 = 0; var2 < field1068; var2++) {
				if (var1 == 0 || var2 == 0 || field1067 - 1 == var1 || field1068 - 1 == var2) {
					field1069[var1][var2] = 0xFFFFFF;
				} else {
					field1069[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("OTPPFNKL.a(ZIIIII)V")
	public void method354(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1065;
		arg2 -= field1066;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method357(arg3, arg2, 128);
				method357(arg3 - 1, arg2, 8);
			}

			if (arg4 == 1) {
				method357(arg3, arg2, 2);
				method357(arg3, arg2 + 1, 32);
			}

			if (arg4 == 2) {
				method357(arg3, arg2, 8);
				method357(arg3 + 1, arg2, 128);
			}

			if (arg4 == 3) {
				method357(arg3, arg2, 32);
				method357(arg3, arg2 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method357(arg3, arg2, 1);
				method357(arg3 - 1, arg2 + 1, 16);
			}

			if (arg4 == 1) {
				method357(arg3, arg2, 4);
				method357(arg3 + 1, arg2 + 1, 64);
			}

			if (arg4 == 2) {
				method357(arg3, arg2, 16);
				method357(arg3 + 1, arg2 - 1, 1);
			}

			if (arg4 == 3) {
				method357(arg3, arg2, 64);
				method357(arg3 - 1, arg2 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method357(arg3, arg2, 130);
				method357(arg3 - 1, arg2, 8);
				method357(arg3, arg2 + 1, 32);
			}

			if (arg4 == 1) {
				method357(arg3, arg2, 10);
				method357(arg3, arg2 + 1, 32);
				method357(arg3 + 1, arg2, 128);
			}

			if (arg4 == 2) {
				method357(arg3, arg2, 40);
				method357(arg3 + 1, arg2, 128);
				method357(arg3, arg2 - 1, 2);
			}

			if (arg4 == 3) {
				method357(arg3, arg2, 160);
				method357(arg3, arg2 - 1, 2);
				method357(arg3 - 1, arg2, 8);
			}
		}

		if (arg0) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method357(arg3, arg2, 0x10000);
					method357(arg3 - 1, arg2, 4096);
				}

				if (arg4 == 1) {
					method357(arg3, arg2, 1024);
					method357(arg3, arg2 + 1, 16384);
				}

				if (arg4 == 2) {
					method357(arg3, arg2, 4096);
					method357(arg3 + 1, arg2, 0x10000);
				}

				if (arg4 == 3) {
					method357(arg3, arg2, 16384);
					method357(arg3, arg2 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method357(arg3, arg2, 512);
					method357(arg3 - 1, arg2 + 1, 8192);
				}

				if (arg4 == 1) {
					method357(arg3, arg2, 2048);
					method357(arg3 + 1, arg2 + 1, 32768);
				}

				if (arg4 == 2) {
					method357(arg3, arg2, 8192);
					method357(arg3 + 1, arg2 - 1, 512);
				}

				if (arg4 == 3) {
					method357(arg3, arg2, 32768);
					method357(arg3 - 1, arg2 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method357(arg3, arg2, 66560);
					method357(arg3 - 1, arg2, 4096);
					method357(arg3, arg2 + 1, 16384);
				}

				if (arg4 == 1) {
					method357(arg3, arg2, 5120);
					method357(arg3, arg2 + 1, 16384);
					method357(arg3 + 1, arg2, 0x10000);
				}

				if (arg4 == 2) {
					method357(arg3, arg2, 20480);
					method357(arg3 + 1, arg2, 0x10000);
					method357(arg3, arg2 - 1, 1024);
				}

				if (arg4 == 3) {
					method357(arg3, arg2, 81920);
					method357(arg3, arg2 - 1, 1024);
					method357(arg3 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("OTPPFNKL.a(ZIIBIII)V")
	public void method355(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg4 -= field1065;
		arg2 -= field1066;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg3;
			arg3 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1067) {
				for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1068) {
						method357(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("OTPPFNKL.a(III)V")
	public void method356(int arg0, int arg1) {
		arg1 -= field1065;
		arg0 -= field1066;
		field1069[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("OTPPFNKL.b(III)V")
	public void method357(int arg0, int arg1, int arg2) {
		field1069[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("OTPPFNKL.a(IIZIII)V")
	public void method358(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field1065;
		arg1 -= field1066;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method360(arg1, arg0, 128);
				method360(arg1, arg0 - 1, 8);
			}

			if (arg3 == 1) {
				method360(arg1, arg0, 2);
				method360(arg1 + 1, arg0, 32);
			}

			if (arg3 == 2) {
				method360(arg1, arg0, 8);
				method360(arg1, arg0 + 1, 128);
			}

			if (arg3 == 3) {
				method360(arg1, arg0, 32);
				method360(arg1 - 1, arg0, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method360(arg1, arg0, 1);
				method360(arg1 + 1, arg0 - 1, 16);
			}

			if (arg3 == 1) {
				method360(arg1, arg0, 4);
				method360(arg1 + 1, arg0 + 1, 64);
			}

			if (arg3 == 2) {
				method360(arg1, arg0, 16);
				method360(arg1 - 1, arg0 + 1, 1);
			}

			if (arg3 == 3) {
				method360(arg1, arg0, 64);
				method360(arg1 - 1, arg0 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method360(arg1, arg0, 130);
				method360(arg1, arg0 - 1, 8);
				method360(arg1 + 1, arg0, 32);
			}

			if (arg3 == 1) {
				method360(arg1, arg0, 10);
				method360(arg1 + 1, arg0, 32);
				method360(arg1, arg0 + 1, 128);
			}

			if (arg3 == 2) {
				method360(arg1, arg0, 40);
				method360(arg1, arg0 + 1, 128);
				method360(arg1 - 1, arg0, 2);
			}

			if (arg3 == 3) {
				method360(arg1, arg0, 160);
				method360(arg1 - 1, arg0, 2);
				method360(arg1, arg0 - 1, 8);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method360(arg1, arg0, 0x10000);
					method360(arg1, arg0 - 1, 4096);
				}

				if (arg3 == 1) {
					method360(arg1, arg0, 1024);
					method360(arg1 + 1, arg0, 16384);
				}

				if (arg3 == 2) {
					method360(arg1, arg0, 4096);
					method360(arg1, arg0 + 1, 0x10000);
				}

				if (arg3 == 3) {
					method360(arg1, arg0, 16384);
					method360(arg1 - 1, arg0, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method360(arg1, arg0, 512);
					method360(arg1 + 1, arg0 - 1, 8192);
				}

				if (arg3 == 1) {
					method360(arg1, arg0, 2048);
					method360(arg1 + 1, arg0 + 1, 32768);
				}

				if (arg3 == 2) {
					method360(arg1, arg0, 8192);
					method360(arg1 - 1, arg0 + 1, 512);
				}

				if (arg3 == 3) {
					method360(arg1, arg0, 32768);
					method360(arg1 - 1, arg0 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method360(arg1, arg0, 66560);
					method360(arg1, arg0 - 1, 4096);
					method360(arg1 + 1, arg0, 16384);
				}

				if (arg3 == 1) {
					method360(arg1, arg0, 5120);
					method360(arg1 + 1, arg0, 16384);
					method360(arg1, arg0 + 1, 0x10000);
				}

				if (arg3 == 2) {
					method360(arg1, arg0, 20480);
					method360(arg1, arg0 + 1, 0x10000);
					method360(arg1 - 1, arg0, 1024);
				}

				if (arg3 == 3) {
					method360(arg1, arg0, 81920);
					method360(arg1 - 1, arg0, 1024);
					method360(arg1, arg0 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("OTPPFNKL.a(IIIIIZI)V")
	public void method359(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field1065;
		arg5 -= field1066;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field1067) {
				for (int var10 = arg5; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1068) {
						method360(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("OTPPFNKL.a(IIII)V")
	public void method360(int arg0, int arg1, int arg2) {
		field1069[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("OTPPFNKL.c(III)V")
	public void method361(int arg0, int arg1) {
		arg0 -= field1065;
		arg1 -= field1066;
		field1069[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("OTPPFNKL.a(IIIIZII)Z")
	public boolean method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg5 && arg1 == arg3) {
			return true;
		}

		arg5 -= field1065;
		arg3 -= field1066;
		arg2 -= field1065;
		arg1 -= field1066;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (arg2 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3 && (field1069[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3 && (field1069[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg2 == arg5 && arg1 + 1 == arg3) {
					return true;
				}

				if (arg2 - 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg2 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3 && (field1069[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3 && (field1069[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg2 == arg5 && arg1 - 1 == arg3) {
					return true;
				}

				if (arg2 - 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				if (arg2 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3 && (field1069[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg2 - 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3 && (field1069[arg5][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg2 - 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3 && (field1069[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg2 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3 && (field1069[arg5][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg2 == arg5 && arg1 + 1 == arg3 && (field1069[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg5 && arg1 - 1 == arg3 && (field1069[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg5 && arg1 == arg3 && (field1069[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("OTPPFNKL.a(IIIIIIZ)Z")
	public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg2 == arg5) {
			return true;
		}

		arg4 -= field1065;
		arg5 -= field1066;
		arg0 -= field1065;
		arg2 -= field1066;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg0 + 1 == arg4 && arg2 == arg5 && (field1069[arg4][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg5 && (field1069[arg4][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg4 && arg2 == arg5 && (field1069[arg4][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg5 && (field1069[arg4][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg4 && arg2 == arg5 && (field1069[arg4][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg5 && (field1069[arg4][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 + 1 == arg4 && arg2 == arg5 && (field1069[arg4][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg5 && (field1069[arg4][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg0 == arg4 && arg2 + 1 == arg5 && (field1069[arg4][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg2 - 1 == arg5 && (field1069[arg4][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg2 == arg5 && (field1069[arg4][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg2 == arg5 && (field1069[arg4][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("OTPPFNKL.a(IIIIIIII)Z")
	public boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg4 - 1;
		int var9 = arg0 + arg5 - 1;
		if (arg2 >= arg3 && arg2 <= var8 && arg1 >= arg5 && arg1 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg2 && arg1 >= arg5 && arg1 <= var9 && (field1069[arg2 - field1065][arg1 - field1066] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg1 >= arg5 && arg1 <= var9 && (field1069[arg2 - field1065][arg1 - field1066] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg1 && arg2 >= arg3 && arg2 <= var8 && (field1069[arg2 - field1065][arg1 - field1066] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg2 >= arg3 && arg2 <= var8 && (field1069[arg2 - field1065][arg1 - field1066] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
